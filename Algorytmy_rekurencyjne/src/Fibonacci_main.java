public class Fibonacci_main {
    public static void main(String[] args) {
        for(int i=0; i<40; i++) {
            System.out.println(i+": "+calculateFibonacciNumber(i));
        }
    }

    private static int calculateFibonacciNumber(int n){
        if(n<2){
            return n;
        }
        else{
            return calculateFibonacciNumber(n-1)+calculateFibonacciNumber(n-2);
        }
    }
}
