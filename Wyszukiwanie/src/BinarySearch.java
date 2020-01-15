import javax.management.InstanceNotFoundException;

public class BinarySearch {
    public static void main(String[] arg){
        int[] tab=new int[]{1,3,4,6,7,8,10,13,14,18,19,21,24,37,40,45,71,89};

        System.out.println(binarySearch(tab, 35));

    }

    private static int binarySearch(int[] tab, int a, int li, int ri) {
        int m=(li+ri)/2; //znalezienie indeksu srodka przedzialu

        if(li>ri){
            //warunek oznaczajacy ze szukanego elementu nie ma w tablicy
        }

        if(tab[m]==a){ //sprawdzamy czy srodek przedzialu jest szukana liczba
            return m; //jesli jest to zwracamy indeks poszukiwanej liczby
        }
        else{
            if(a<tab[m]){ //jezeli szukana liczba jest w lewej polowie
                //rekurencyjnie wywolujemy sama siebie zmieniajac odpowiednio indeksy
                return binarySearch(tab,a,li,m-1);
            }
            else{ //jezeli szukana liczba jest w prawej polowie
                //rekurencyjnie wywolujemy sama siebie zmieniajac odpowiednio indeksy
                return binarySearch(tab,a,m+1,ri);
            }
        }
    }

    private static int binarySearch(int[] tab, int a) {
            return binarySearch(tab, a, 0, tab.length-1);
    }
}
