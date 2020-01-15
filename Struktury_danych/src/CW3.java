import java.util.*;

public class CW3 {
    public static void main(String[] args){
        List<Integer> a=new LinkedList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));
        List<Integer> b=new LinkedList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
        List<Integer> c=new LinkedList<>();

        c=listAddition(b,a);

        System.out.println(c);

    }

    private static List<Integer> listAddition(List<Integer> a, List<Integer> b){
        List<Integer> c= new LinkedList<>();

        if(a.size()>=b.size()){ //sprawdzam czy lista a jest dluzsza badz rowna liscie b
            for(int i=0; i<a.size(); i++){ //iteruje po dlugosci listy a
                if(i<b.size()) { //sprawdzam czy nie wykraczam poza dlugosc listy b
                    c.add(i, a.get(i) + b.get(i)); //dodaje sume z obu list
                }
                else {
                    c.add(i,a.get(i)); //wstawiam tylko element z listy dluzszej
                }
            }
        }
        else
        {
            for(int i=0; i<b.size(); i++){
                if(i<a.size()) {
                    c.add(i, a.get(i) + b.get(i));
                }
                else {
                    c.add(i,b.get(i));
                }
            }
        }

        return c;
    }

}
