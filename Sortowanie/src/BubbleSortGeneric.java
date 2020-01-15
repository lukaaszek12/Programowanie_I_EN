public class BubbleSortGeneric {
    public static void main(String[] args) {
        Integer[] tabInt=new Integer[]{10, 2, 1, 5, 7, 8, 12, 0};
        Double[] tabDouble=new Double[]{5.0, 3.45, 2.12, 8.12, 9.1};
        String[] tabStr=new String[]{"xyz", "def", "abc", "acb"};

        tabInt=bubbleSortGeneric(tabInt);
        tabDouble=bubbleSortGeneric(tabDouble);
        tabStr=bubbleSortGeneric(tabStr);

        for(Integer l:tabInt)
            System.out.println(l);

        for(Double d:tabDouble)
            System.out.println(d);

        for(String s:tabStr)
            System.out.println(s);
    }

    private static <T extends Comparable<T>> T[] bubbleSortGeneric(T[] tab){
        T a;

        for(int i=tab.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                //wykorzystuje metode compareTo z interfejsu Comparable zamiast znaku porownania
                if(tab[j].compareTo(tab[j+1])>0){
                    a=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=a;

                }
            }
        }

        return tab;
    }
}
