public class CW9 {
    public static void main(String[] args){
        System.out.println(squareRoot(6.25,0.000000001));
    }

    private static double squareRoot(double n, double e){
        double a,b;
        a=1.0; //warunki poczatkowe
        b=n;

        while(Math.abs(a-b)>=e){ //warunek koncowy
            a=(a+b)/2.0;  //srednia arytmetyczna z dlugosci prostokata z poprzedniego kroku
            b=n/a;  //b jest ilorazem Pola i boku a
        }

        return a; //zwracamy pierwiastek z n
    }
}
