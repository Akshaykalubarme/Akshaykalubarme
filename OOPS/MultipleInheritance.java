package OOPS;

public class MultipleInheritance {

    interface Payment {
        void pay();
    }

    interface Refund {
        void refund();
    }

    public static class OnlineTransaction implements Payment, Refund {
        @Override
        public void pay() {
            System.out.println("Payment done successfully");
        }

        @Override
        public void refund() {
            System.out.println("Refund successfully");
        }

    }

    public static void main(String[] args) {
        OnlineTransaction ot = new OnlineTransaction();
        ot.pay();
        ot.refund();
    }
}
