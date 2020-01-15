import java.util.LinkedList;
import java.util.List;

public class CW6 {
    public static void main(String[] args){
        List<Integer> lCP=findPrimeFactors(1520);

        System.out.println(lCP);
    }

    private static List<Integer> findPrimeFactors(int n){
        List<Integer> listPF=new LinkedList<>(); //tu bedziemy przechowywac czynniki pierwsze
        int div=2; //zaczynamy dzielic od 2

        while(n>1){ //dopoki liczba wieksza od 1 to rozkladamy
            while(n%div==0){ //dzielimy przez pewna liczbę tyle razy ile to jest tylko możliwe
                listPF.add(div); //dodajemy znaleziony czynnik do listy
                n/=div; //dzielimy liczbę rozkładana
            }
            div++; //jezeli przez dany dzielnik nie można dzielic to zwiekszamy go o 1
        }

        return listPF;  //zwracamy liste czynnikow pierwszych
    }
}
