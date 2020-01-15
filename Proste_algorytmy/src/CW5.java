import java.util.LinkedList;
import java.util.List;

public class CW5 {
    public static void main (String[] arg){

        //List<Long> lLD=nPerfectNumbers(2);

//        for (int i=1; i<500; i++){
//            System.out.println(i+" : "+isPerfect(i));
//        }

//        for(Long a:lLD){
//            //System.out.println(a);
//        }

        System.out.println(isPerfect(6));
    }

    private static List<Long> nPerfectNumbers(int n){
        List<Long> lLD = new LinkedList<>();
        long liczba=1;

        while(n>0){
            if(isPerfect(liczba)){
                lLD.add(liczba);
                n--;
            }
            liczba++;
        }

        return lLD;
    }

    private static boolean isPerfect(long n){
        long s=1;

        for(long i=2; i*i<=n; i++){
            System.out.println(i);
            if(n%i==0){
                s+=i+n/i;
            }
        }

//        for(long i=2; i<n; i++){ //rozwiazanie wolniejsze
//            System.out.println(i);
//            if(n%i==0){
//                s+=i;
//            }
//        }

        if(s==n){
            return true;
        }
        else{
            return false;
        }
    }
}
