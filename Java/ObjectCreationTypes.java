package Java;

public class ObjectCreationTypes implements Cloneable {

    // 1. Using new keyword
    ObjectCreationTypes obj1 = new ObjectCreationTypes();

    // 2. Using reflection (Constructor.newInstance)
    ObjectCreationTypes obj2;

    // 3. Using clone()
    ObjectCreationTypes obj3;

    public ObjectCreationTypes() {
        try {
            // Correct way to create object via reflection
            obj2 = ObjectCreationTypes.class.getDeclaredConstructor().newInstance();

            // clone() requires implementing Cloneable + overriding clone()
            obj3 = (ObjectCreationTypes) this.clone();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Mandatory for cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        // 4. Using new keyword
        ObjectCreationTypes o1 = new ObjectCreationTypes();

        // 5. Using reflection again
        try {
            ObjectCreationTypes o2 = ObjectCreationTypes.class.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. Deserialization is another valid method (not included here)
    }
}
