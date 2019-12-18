import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ALG1 {
    public static void main(String[] args) {

//        System.out.println(isPalindrom("Ala"));
//        System.out.println(isPalindrom("abc"));
//        System.out.println(isPalindrom("kajak"));

        String path = new String("C:\\Users\\Sławomir\\Desktop\\SDA\\Programowanie I\\palindromy.txt");
        String line;
        BufferedReader file = null;
        List<String> lineList = new LinkedList<>();

        try{
            file = new BufferedReader(new FileReader(path));

            while(true){
                line=file.readLine();

                if(line==null){
                    break;
                }

                lineList.add(line);
            }
        }
        catch(IOException e){
            System.out.println("Error when opening file");
        }
        finally{
            if(file!=null){
                try{
                    file.close();
                }
                catch(IOException e){
                    System.out.println("Error when closing file");
                }
            }
        }

        for(String s:lineList){
            System.out.println(s+": "+isPalindrom(s));
        }

    }

    private static final boolean isPalindrom(String s){
        boolean result = true;

        s=s.toLowerCase(); //wszystko zamieniamy na małe litery, aby ignowrowac wielkosc liter
        for(int i=0; i<Math.round(s.length()/2.0); i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                result=false;
                break;
            }
        }

        return result;
    }
}
