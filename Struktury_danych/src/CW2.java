import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CW2 {
    public static void main(String[] args){
        List<Integer> integerList=new LinkedList<>();
        int length=0;
        int[] range=new int[2];

        Scanner scn= new Scanner(System.in);

        System.out.println("Give length of list:");
        length=scn.nextInt();
        System.out.println("Give max value:");
        range[1]=scn.nextInt();
        System.out.println("Give min value:");
        range[0]=scn.nextInt();
        while (range[0]>range[1]){
            System.out.println("Incorrect min value, give it again:");
            range[0]=scn.nextInt();
        }

        Random rnd= new Random();

        for(int i=0; i<length; i++){
            integerList.add(rnd.nextInt(range[1]-range[0]+1)+range[0]);
        }

//        for(long l:integerList){
//            System.out.println(l);
//        }
        System.out.println(integerList);
    }

}
