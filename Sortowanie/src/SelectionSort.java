public class SelectionSort {
    public static void main(String[] args){

        int[] tab= new int[]{2, 5, 3, 7, 1, 9, 34, 0};

        tab=selectionSort(tab);

        for(int l:tab){
            System.out.println(l);
        }
    }

    private static int[] selectionSort(int[] tab){
        int minInd;  //indeks liczby minimalnej
        int min;    //liczba minimalna

        for(int i=0; i<tab.length-1; i++){ //iterowanie po kolejnych elementach tablicy
            minInd=i; //inicjalizacja indeksu liczby minimalnej
            min=tab[i]; //liczba minimalna
            for(int j=i+1; j<tab.length; j++){ //iterowanie po pozostalych elementach tablicy
                if(tab[j]<min){ //szukanie najmniejszej liczby
                    minInd=j; //przypisanie indeksu liczby mniejszej
                    min=tab[j];
                }
            }
            tab[minInd]=tab[i]; //zamiana elementow w tablicy
            tab[i]=min;

        }

        return tab;
    }
}
