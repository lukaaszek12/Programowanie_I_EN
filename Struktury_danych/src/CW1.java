import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CW1 {
    public static void main(String[] args){
        List<Long> longList=new LinkedList<>();
        int length=0;

        Scanner scn= new Scanner(System.in);

        System.out.println("Give length of list:");
        length=scn.nextInt();

        for(int i=0; i<length; i++){
            longList.add(calculateFibonacciNumber(i));
        }

        for(long l:longList){
            System.out.println(l);
        }
    }

    private static long calculateFibonacciNumber(int n){
        if(n<2){
            return (long)n;
        }
        else{
            return calculateFibonacciNumber(n-1)+calculateFibonacciNumber(n-2);
        }
    }
}
