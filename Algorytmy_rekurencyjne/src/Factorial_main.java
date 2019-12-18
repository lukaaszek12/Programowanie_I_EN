public class Factorial_main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n){
        if(n==1){
            return 1; //warunek koncowy
        }
        else{
            int res=n*factorial(n-1); //wywoalywanie samej siebie
            System.out.println(res);
            return res;
        }
    }
}
