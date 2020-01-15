public class StackExample {

    private int[] tab;
    private int pos;

    public StackExample(int max){
        tab = new int[max];
        pos=0;
    }

    public void put(int E) throws IndexOutOfBoundsException{
        if(pos<tab.length) {
            tab[pos] = E;
            pos++;
        }
        else
        {
            throw new IndexOutOfBoundsException("Przepełnienie");
        }
    }

    public int get() throws IndexOutOfBoundsException{

        if(pos<=0){
            throw new IndexOutOfBoundsException("Pusty stos");
        }

        int temp = tab[pos-1];
        tab[pos-1]=0;
        pos--;
        return temp;
    }

    public int size(){
        return pos;
    }

    public boolean isEmpty(){
        return pos==0;
    }

    public void printAll(){
        if(isEmpty()){
            System.out.println("Stos jest pusty!");
        }
        else {
            System.out.println();
            for(int i=0; i<pos; i++){
                System.out.print(tab[i]+" ");
            }
            System.out.println();
        }
    }

    public void clear(){
//        while(!czyPusty()){
//            get();
//        }
        for(int i=0; i<pos; i++){
            tab[i]=0;
        }
        pos=0;
    }
}
