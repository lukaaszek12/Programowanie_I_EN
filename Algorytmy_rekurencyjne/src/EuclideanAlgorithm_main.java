public class EuclideanAlgorithm_main {
    public static void main(String[] args) {
        System.out.println(algEuclidean(96, 80));
        System.out.println(algEuclideanShort(96, 80));

    }

    private static int algEuclidean(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int m = 0; //tu trzymam liczbe wieksza
            int n = 0; //tu trzymam liczbe mniejsza
            if (a >= b) {
                m = a;
                n = b;
            } else {
                m = b;
                n = a;
            }

            return algEuclidean(n, m - n);
        }
    }

    private static int algEuclideanShort(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (algEuclideanShort(b, a % b));
        }
    }
}

