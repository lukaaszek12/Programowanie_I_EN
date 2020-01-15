public class CW1 {
    public static void main(String[] args) {
        System.out.println(NWW(7,13));

    }

    private static int NWW(int a, int b){
        int wyn;
        wyn=a*b/algEuclideanShort(a,b);

        return wyn;
    }

    private static int algEuclideanShort(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (algEuclideanShort(b, a % b));
        }
    }
}
