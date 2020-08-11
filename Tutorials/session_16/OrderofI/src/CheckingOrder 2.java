public class CheckingOrder {
    static {
        System.out.println('a');
    }

    CheckingOrder() {
        System.out.println('b');
    }

    static {
        System.out.println('c');
    }

    {
        System.out.println('d');
    }

    static {
        System.out.println('e');
    }

    {
        System.out.println('f');
    }

    public static void main(String[] args) {
        CheckingOrder co = new CheckingOrder();

    }
}