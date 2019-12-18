public class TriangleNumbers_main {
    public static void main(String[] args) {
        System.out.println(triangleNumber(6));
    }

    private static int triangleNumber(int n){
        if(n==1) {
            return 1;
        }
        else{
            return n+triangleNumber(n-1);
        }
    }
}
