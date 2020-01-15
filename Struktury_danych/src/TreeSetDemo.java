import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args){
        Integer[] nums={2,4,1,6,3,7,9,5};
        SortedSet<Integer> tree=new TreeSet<>(Arrays.asList(nums));

        System.out.println(tree.first()); //wypisanie pierwszego elementu drzewa
        System.out.println(tree.last());    //wypisanie ostatniego elementu drzewa

        printAll(tree); //wyswietlenie wszystkich elementow drzewa
        System.out.println(tree.add(1)); //dodanie 1
        System.out.println(tree.add(8)); //dodanie 8
        System.out.println(tree.add(11));   //dodanie 11
        printAll(tree);

        printAll(tree.headSet(7));  //wyswietlenie elementow drzewa do wartosci 7 (ale bez 7)
        printAll(tree.subSet(2,5)); //wyswietlenie elementow drzewa w zakresie od 2 do 4 (bez 5)
        printAll(tree.tailSet(4)); //wyswietlenie koncowki drzewa od wartosci 4

    }

    public static void printAll(SortedSet<Integer> tree){
        for(int s: tree){
            System.out.print(s+"; ");
        }
        System.out.println();
    }

}
