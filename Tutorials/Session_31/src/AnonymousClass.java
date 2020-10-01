public class AnonymousClass {
    public static void main(String[] args) {

        mathMethod(new MathAnonymous() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }

            @Override
            public int subtract(int x, int y) {
                return x-y;
            }

            @Override
            public int divide(int num, int den) {
                if(den == 0) {
                    return -1;
                }
                return num/den;
            }
        }, 30, 5);

    }

    public static void mathMethod(MathAnonymous math, int x, int y) {
        System.out.println(math.add(x, y));
        System.out.println(math.subtract(x, y));
        System.out.println(math.divide(x, y));
    }
}

interface MathAnonymous {
    int add(int x, int y);
    int subtract(int x, int y);
    int divide(int num, int den);
}
