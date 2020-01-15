import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String, Double> treeMap=new TreeMap<>();    //stworzenie nowego drzewa TreeMap z kluczem typu String
                                                            //oraz wartościami typu Double

        treeMap.put("Paradise Lost", 23.56);    //wstawienie kolejnego wpisu do drzewa
        treeMap.put("Golden Treasury", 12.47);
        treeMap.put("Moon and the Sixpence", 65.28);
        treeMap.put("Holinshed", 7.68);
        treeMap.put("Ancient Mariner", 45.36);

        printAll(treeMap);      //wyswietlenie calego drzewa

        treeMap.put("Paradise Lost", 23.45);
        printAll(treeMap);

        treeMap.put("Paradise Regained", 23.45);
        printAll(treeMap);

        treeMap.put("Bubble Driver", 51.27);
        printAll(treeMap);
    }

    public static void printAll(TreeMap<String, Double> treeMap){
        for(Map.Entry<String, Double> et:treeMap.entrySet()){   //iterowanie po wpisach drzewa TreeMap
            System.out.println(et.getKey()+": "+et.getValue()); //wyswietlanie kluczy i wartosci kolejnych wpisow
        }
        System.out.println();
    }
}

