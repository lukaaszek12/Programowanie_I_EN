import java.util.Random;

public class Figure_printer {

    public void printTriangle(int w){

        for(int i=0; i<w; i++){
            for(int j=0; j<i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void printSlash(int w){

        for(int i=0; i<w; i++){
            for(int j=0; j<i+1; j++){
                if(i==j) {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public void printSquare(int w){

        for(int i=0; i<w; i++){
            for(int j=0; j<w; j++){
                if(i==0 || i==w-1) { //sprawdzam czy pierwszy badz ostatni wiersz
                    System.out.print('*');
                }
                else
                {
                    if (j==0 || j==w-1){ //sprawdzam czy pierwsza lub ostatnia kolumna
                        System.out.print('*');
                    }
                    else{ //w srodku drukuje spacje
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    public void printX(int w){
        for(int i=0; i<w; i++){
            for(int j=0; j<w; j++){
                if(i==j || j==w-i-1) { //sprawdzam czy dany element lezy na ktorejs z przekatnych
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public void printRectangle(int w, int h, char c){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(i==0 || i==h-1) { //sprawdzam czy pierwszy badz ostatni wiersz
                    System.out.print(c);
                }
                else
                {
                    if (j==0 || j==w-1){ //sprawdzam czy pierwsza lub ostatnia kolumna
                        System.out.print(c);
                    }
                    else{ //w srodku drukuje spacje
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    public void printX(int w, int h, char c){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(i==j || j==w-i-1) { //sprawdzam czy dany element lezy na ktorejs z przekatnych
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }






    public void printTriangle(int h, int w, char c){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                //if(i>=Math.round(h*j/w)){
                if(j<=Math.round((float)w*(float)i/(float)h)){ //(float)(w*i)/(float)h
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public void printSlash(int h, int w, char c){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                //if(i>=Math.round(h*j/w)){
                if(j==Math.round((float)w*(float)i/(float)h)){ //(float)(w*i)/(float)h
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printChessBoard(int w, int h){
        char b, c;
        Random random = new Random();
        b=(char)random.nextInt(256);
        c=(char)random.nextInt(256);
        for(int i=0; i<h; i++){ //odpowiada za iterowanie wierszami pól
            for(int ii=0; ii<2; ii++){ //realizuje wysokosc pola rowna 2
                for(int j=0; j<w; j++){ //odpowiada za iterowanie kolumnami pól
                    for(int jj=0; jj<2; jj++){ //realizuje szerokosc pola rowna 2
                        if((i+j)%2==0){ //sprawdzam czy pole biale czy czarne
                            System.out.print(b);
                        }
                        else{
                            System.out.print(c);
                        }
                    }
                }
                System.out.println();
            }
        }
    }

}
