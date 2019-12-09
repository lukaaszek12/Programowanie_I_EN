public class ChristmasTreePrinter {

    public void printChristmasTree(){
        printSlashLines(10,3,0);
        printHorizontalLine(10, 7);
        printSlashLines(10,4,2);
        printHorizontalLine(10, 13);
        printSlashLines(10,5,5);
        printHorizontalLine(10, 21);
        printHorizontalLine(10, 3);
        printHorizontalLine(10, 3);
        printHorizontalLine(10, 3);

    }

    public void printFilledChristmasTree(){
        printSlashLines(10,3,0, true);
        printHorizontalLine(10, 7);
        printSlashLines(10,4,2, true);
        printHorizontalLine(10, 13);
        printSlashLines(10,5,5, true);
        printHorizontalLine(10, 21);
        printHorizontalLine(10, 3);
        printHorizontalLine(10, 3);
        printHorizontalLine(10, 3);

    }

    private void printSlashLines(int ip, int l, int m){
        printSlashLines(ip, l, m, false);
    }

    private void printSlashLines(int ip, int l, int m, boolean fill){
        for(int i=0; i<l; i++){
            for(int j=0; j<ip+l+m; j++){
                if(j==ip-i-m || j==ip+i+m){
                    System.out.print('#');
                }
                else{
                    if((j>ip-i-m && j<ip+i+m) && fill) {
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    private void printHorizontalLine(int ip, int l){
        for(int i=0; i<=ip+l/2; i++){
            if(i>=ip-l/2 && i<=ip+l/2){
                System.out.print('#');
            }
            else{
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
