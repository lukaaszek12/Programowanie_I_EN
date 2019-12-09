import java.util.LinkedList;
import java.util.List;

public class Graphical_letters {
    Integer[][][] alphabet = new Integer[30][8][8];
    List<Integer[][]> text = new LinkedList<>();

    public void init(){
        alphabet[0]=new Integer[][]{
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 1, 0, 0}};

        alphabet[1]=new Integer[][]{
                {0, 0, 1, 1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 1, 1, 1, 0, 0}};

        alphabet[2]=new Integer[][]{
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 0, 1, 1}};

        text.add(alphabet[2]);
        text.add(alphabet[2]);
        text.add(alphabet[2]);
        text.add(alphabet[2]);
        text.add(alphabet[1]);

        printText();
    }

    public void printText(){
        for(int i=0; i<text.get(0).length; i++){
            for(int j=0; j<text.size(); j++){
                for(int k=0; k<text.get(j).length; k++){
                    if(text.get(j)[i][k]==1){
                        System.out.print('$');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
