import java.util.LinkedList;
import java.util.List;

public class ALG3 {
    public static void main(String[] args) {

        List<Integer[]> result=findAllPatterns("ABC","DABCDABCRDSSDC");

        for (Integer[] r:result) {
            System.out.println(r[0]+"; "+r[1]);
        }
    }

    private static List<Integer[]> findAllPatterns(String pat, String text){
        List<Integer[]> listOfIndexes = new LinkedList<>();
        for(int i=0; i<text.length()-pat.length(); i++){
            for(int j=0; j<pat.length(); j++){
                if(text.charAt(i+j)==pat.charAt(j)){
                    if(j==pat.length()-1){
                        listOfIndexes.add(new Integer[]{i,i+j});
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return listOfIndexes;
    }
}
