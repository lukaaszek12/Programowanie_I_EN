public class DecimalToBinary_main {
    public static void main(String[] args) {
        System.out.println(convertDecToBin(37));

    }

    private static String convertDecToBin(int n){
        if(n==1){
            return "1";
        }
        else
        {
            if(n%2==1){
                return convertDecToBin(n/2)+"1";
            }
            else{
                return convertDecToBin(n/2)+"0";
            }
        }
    }
}
