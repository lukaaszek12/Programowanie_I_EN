import java.util.Random;

public class Zad_ind_I {
    public static void main(String[] args) {
        //1
        int[][] tab1=new int[][]{
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5}};

        print2DTable(tab1);

        //2
        double[][] tab2 = new double[10][10];

        //2a
        //int k=1; //1 sposob
        for(int i=0; i<tab2.length; i++){
            for(int j=0; j<tab2[i].length; j++){
                //tab2[i][j]=k++; //1 sposob
                tab2[i][j]=10*i+j+1; //2 sposob
            }
        }

        for(double[] row:tab2){
            for(double l:row){
                System.out.print(l+"; ");
            }
            System.out.println();
        }

        //5
        printDouble2DTable(transpose2DTable(tab2));

        //2b
        Random rand = new Random();
        for(int i=0; i<tab2.length; i++){
            for(int j=0; j<tab2[i].length; j++){
                tab2[i][j]=rand.nextDouble();
            }
        }

        for(double[] row:tab2){
            for(double l:row){
                System.out.print(l+"; ");
            }
            System.out.println();
        }

        //2c
        for(int i=0; i<tab2.length; i++){
            for(int j=0; j<tab2[i].length; j++){
                tab2[i][j]=i+j;
            }
        }

        for(double[] row:tab2){
            for(double l:row){
                System.out.print(l+"; ");
            }
            System.out.println();
        }
    }

    private static void print2DTable(int[][] tab){
        for(int[] row:tab){
            for(int l:row){
                System.out.print(l+"; ");
            }
            System.out.println();
        }
    }

    //3
    private static void printDouble2DTable(double[][] tab){
        for(double[] row:tab){
            for(double l:row){
                System.out.print(l+"; ");
            }
            System.out.println();
        }
    }

    //4
    private static double sumDouble2DTable(double[][] tab){
        double sum=0.0;
        for(double[] row:tab){
            for(double l:row){
                sum+=l; //sum=sum+l;
            }
        }
        return sum;
    }

    //
    private static double[][] transpose2DTable(double[][] tab){
        double[][] transposed = new double[tab[0].length][tab.length];

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                transposed[j][i]=tab[i][j]; //zamiana wiersz i kolumn
            }
        }

        return transposed;
    }
}

