import java.util.Scanner;
import java.util.regex.Pattern;

public class ALG2 {
    static double[] denominations = new double[]{500.0, 200.0, 100.0, 50.0, 20.0, 10.0,
            5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01}; //nominaly

    public static void main(String[] args) {

        double amount;
        Scanner sc = new Scanner(System.in);
        Pattern pat = Pattern.compile("(\\d+\\.\\d{2})|(\\d+)"); //dopuszczenie liczby z dwoma miejscami po kropce oraz liczby calkowitej

        System.out.println("Give me amount: ");
        String text=sc.nextLine(); //pobranie nastepnej linii

        while(!pat.matcher(text).matches()){
            System.out.println("Give me amount: ");
            text=sc.nextLine(); //pobranie nastepnej linii
        }

        amount=Double.parseDouble(text);

        int[] result = calculateNumberOfDenominations(amount);

        for(int i=0; i<result.length; i++){ //iterowanie po wyniku
            if(result[i]!=0) { //wyswietlam tylko uzyte nominaly
                System.out.println(denominations[i] + " x " + result[i]);
            }
        }
    }

    private static int[] calculateNumberOfDenominations(double amount){
        int[] numOfDen = new int[denominations.length];

        int i=0;
        while(amount >= 0.01){ //petla dopoki kwota wyzsza od 0

            int num = (int)(amount/denominations[i]); //obliczam liczbe nominalow
            numOfDen[i]=num; //wstawiam liczbe nominalow w odpowiednie miejsce
            amount-=numOfDen[i]*denominations[i]; //pomniejszam kwote
            i++;

            amount=(Math.round(amount*100))/100.0; //zlikwidowanie problemu niedokladnosci liczb zmiennoprzecinkowych
            //System.out.println(amount);
        }
        return numOfDen;
    }
}
