public class CW2 {
    public static void main (String[] args){

        System.out.println(decToHex(155));
        System.out.println(decToHexShort(1355));


    }

    private static String decToHex(int a){
        String str="";
        int r=0;

        while(a>0){
            r=a%16;
            a=a/16;

            if(r>9){
                switch(r){
                    case 10:
                        str+="A";
                        break;
                    case 11:
                        str+="B";
                        break;
                    case 12:
                        str+="C";
                        break;
                    case 13:
                        str+="D";
                        break;
                    case 14:
                        str+="E";
                        break;
                    case 15:
                        str+="F";
                        break;
                }
            }
            else{
                str+=r;
            }
        }

        return new StringBuilder().append(str).reverse().toString();
    }

    private static String decToHexShort(int a){
        String result="";
        String hexDigits="ABCDEF";
        int r;

        while(a>0){
            r=a%16;
            a=a/16;

            if(r<10){
                result+=r;
            }
            else{
                result+=hexDigits.charAt(r-10);
            }
        }

        return new StringBuilder().append(result).reverse().toString();
        //return result;
    }
}