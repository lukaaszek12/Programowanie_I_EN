public class CW7 {
    public static void main(String[] args){
        System.out.println(isTriangle(7.0,4.0,1.0));
    }

    private static boolean isTriangle(double a, double b, double c){
        if(a+b>c && a+c>b && b+c>a){ //sprawdzam 3 warunki, dzieki temu nie musze szukac odcinka najdluzszego
            return true;
        }
        else {
            return false;
        }
    }
}
