import java.util.Random;

public class Table_main {
    public static void main(String[] args) {
        //(1)
        int[] tab1a = new int[10];
        int[] tab1b = new int[10];
        int[] tab1c = new int[10];
        Random rand= new Random();

        //a
        for (int i=0; i<tab1a.length; i++){
            tab1a[i]=i;
        }

        //b
        for (int i=0; i<tab1b.length; i++){
            if(i%2==1) {
                tab1b[i] = i+tab1a[i-1];
                //tab1b[i] = i+i-1;
            }
            else{
                tab1b[i]=i;
            }

        }

        //c
        for (int i=0; i<tab1c.length; i++){
            tab1c[i]= rand.nextInt(9)+1;
            //tab1c[i]= new Random().nextInt(5);
        }

        //a
        for (int l:tab1a){
            System.out.println(l);
        }

        //b
        for (int l:tab1b){
            System.out.println(l);
        }

        //c
        for (int l:tab1c){
            System.out.println(l);
        }


        //(2)
        int[] tab2 = new int[20];
        for (int i=0; i<tab2.length; i++){
            tab2[i]= rand.nextInt(9)+1;
            //tab1c[i]= new Random().nextInt(5);
        }

        //a
        System.out.print("a: ");
        for(int l:tab2){
            System.out.print(l+" ");
        }
        System.out.println();

        //b
        System.out.print("b: ");
        for(int i=tab2.length-1; i>=0; i--){
            System.out.print(tab2[i]+" ");
        }
        System.out.println();

        //c
        System.out.print("c: ");
        for(int i=0; i<tab2.length; i=i+2){
            System.out.print(tab2[i]+" ");
        }
        System.out.println();

        //d
        System.out.print("d: ");
        for(int i=0; i<tab2.length; i+=3){
            System.out.print(tab2[i]+" ");
        }
        System.out.println();

        //e
        int sum=0;
        for(int i=0; i<tab2.length; i++){
            sum+=tab2[i];
        }
        System.out.println("e: "+sum);

        //f
        sum=0;
        for(int i=tab2.length-1; i>=tab2.length-5; i--){
            sum+=tab2[i]>3?tab2[i]:0;
        }
        System.out.println("f: "+sum);

        //g
        sum=0;
        for(int i=0; i<tab2.length; i++){
            sum+=tab2[i];
            if(sum>10){
                System.out.println("g: "+(i+1));
                break;
            }
        }
        //System.out.println(sum);

        //h
        System.out.print("h: ");
        int n=5;
        for(int i=0; i<tab2.length; i=i+n){
            System.out.print(tab2[i]+" ");
        }
        System.out.println();

        //i
        System.out.print("i: ");
        int m=3;
        for(int i=0; i<tab2.length; i++){
            if(tab2[i]%m==0) {
                System.out.print(tab2[i]+" ");
            }
        }
        System.out.println();
    }
}
