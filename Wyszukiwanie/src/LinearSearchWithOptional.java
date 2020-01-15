import javax.management.InstanceNotFoundException;
import java.util.Optional;

public class LinearSearchWithOptional {
    public static void main(String[] args){

        int[] tab=new int[]{2,4,1,6,7,23,72,34};

        //wywolujemy algorutm wyszukiwania liniowego, jesli nic nie zostanie
        //znalezione zwracamy -1 z optionala
        System.out.println(linearSearchWithOptional(tab, 7).orElse(-1));

    }

    private static Optional<Integer> linearSearchWithOptional(int[] tab, int x) {
        Optional<Integer> opt = Optional.empty(); //utworzenie pustego optionala

        for(int i=0; i<tab.length; i++){ //iterowanie po dlugosci tablicy
            if(tab[i]==x){ //sprawdzanie czy znalezlismy element szukany
                opt=Optional.ofNullable(i); //wstawienie indeksu do optionala
                return opt;  //szukamy do pierwszego znalezionego elementu
            }
        }

        return opt; //zwrocenie pustego optionala jesli nic nie zostanie znalezione
    }
}
