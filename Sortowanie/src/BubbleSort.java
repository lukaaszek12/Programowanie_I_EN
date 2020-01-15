import static java.lang.Thread.sleep;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tab= new int[]{2, 5, 3, 7, 1};

        tab=bubbleSort(tab);

        for(int l:tab){
            System.out.println(l);
        }
    }

    private static int[] bubbleSort(int[] tab){
        int tmp; //zmienna tymczasowa gdzie beda przechowywane wartosci przy zamianie

        for(int i=0; i<tab.length-1; i++){ //kolejne iteracje - po kazdej iteracji kolejne liczby od najwiekszej zostana ustawione
            for(int j=0; j<tab.length-i-1; j++){ //iterowanie po kolejnych parach
                if(tab[j]>tab[j+1]){    //porownywanie kolejnych par liczb
                    tmp=tab[j+1];   //liczbe po lewej zapamietujemy
                    tab[j+1]=tab[j]; //liczbe z prawej wstawiamy w miejsce liczby po lewej
                    tab[j]=tmp;     //zapamietana liczbe z lewej wstawiamy po prawej
                }
            }
        }

        return tab;
    }
}
