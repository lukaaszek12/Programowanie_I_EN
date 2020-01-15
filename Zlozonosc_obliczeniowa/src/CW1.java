public class CW1 {
    public static void main(String[] args){
        System.out.println(isEven(3));
        System.out.println(isEven(2));

        int[] tab= new int[]{1, 4, 2, 3, 6};
        int[][] tab2= new int[][]{{1, 4, 2, 3, 6},
                {1, 4, 2, 3, 6},
                {1, 4, 2, 3, 6},
                {1, 4, 2, 3, 6},
                {1, 4, 2, 3, 6}};
        System.out.println(findMax(tab));
        eq3n(250);
        System.out.println(sum2DTab(tab2));
    }

    private static boolean isEven(int x){
        return x%2==0;
    }

    private static int findMax(int[] tab){
        int max;
        max=tab[0];
        for(int a:tab){
            if(a>max){
                max=a;
            }
        }
        return max;
    }

    private static void eq3n(int n){
        for(int x=0; x<=n; x++){
            for(int y=0; y<=n; y++){
                for(int z=0; z<=n; z++){
                    if(7*x+5*y+3*z==362){
                        System.out.println(x+" "+y+" "+z);
                    }
                }
            }
        }
    }

    private static int sum2DTab(int[][] tab){
        Integer sum=Integer.valueOf(0);

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++) {
                sum+=tab[i][j];
            }
        }

        return sum;
    }
}
