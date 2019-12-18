public class MyRun_Task1 implements Runnable {
    private int id;
    private int period;
    private int num;

    public MyRun_Task1(int id, int period){
        this.id=id;
        this.period=period;
        num=0;
    }

    public void run(){
        while(true){
            System.out.println("Thread: "+id+"; number: "+num++);
            try {
                Thread.sleep(period);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
