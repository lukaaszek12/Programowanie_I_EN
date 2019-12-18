
public class Task1_Runner {

    public static void main(String[] args){

        Runnable[] runners = new Runnable[3];
        Thread[] threads = new Thread[3];

        for(int i=0;i<3;i++) {
            runners[i]=new MyRun_Task1(i, 1000*(i+1));
        }

        for(int i=0;i<3;i++) {
            threads[i]=new Thread(runners[i]);
        }

        for(int i=0;i<3;i++) {
            threads[i].start();
        }
    }
}
