import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Integer a=null;

        Optional<Integer> opt=Optional.ofNullable(a);

        System.out.println(opt);
        //System.out.println(a);

        List<Integer> listInteger = new LinkedList<>();
        listInteger.add(2);
        //listInteger.add(3);
        listInteger.add(4);

        System.out.println(3*findOddOptional(listInteger).orElse(0));
        System.out.println(5*findOdd(listInteger));

    }

    private static Integer findOdd(List<Integer> integerList){

        for(Integer a:integerList){
            if(a%2==1){
                return a;
            }
        }

        return null;
    }

    private static Optional<Integer> findOddOptional(List<Integer> integerList){

        Optional<Integer> opt= Optional.empty();

        for(Integer a:integerList){
            if(a%2==1){
                opt=Optional.ofNullable(a);
                return opt;
            }
        }

        return opt;
    }
}
