import java.util.LinkedList;
import java.util.List;

public class CW4 {
    public static void main(String[] args){

        List<Integer> pList=findNPrimes(10);

        System.out.println(pList);
    }

    private static List<Integer> findNPrimes(int n){
        List<Integer> primesList=new LinkedList<>();
        int l=2;

        while(n>0){ //dopoki ilosc liczb pierwszych pozostalych do znalezienia jest wieksza niz 0
            if(isPrime(l)){
                primesList.add(l);
                n--;
            }
            l++;
        }
        return primesList;
    }

    private static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
