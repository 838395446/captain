/**
 * Created by Captain Wang on 16/12/10.
 */

public class MyThread {

    public static void main(String [] args){

        MulThread th1 = new MulThread();
        th1.start();

        MulThread th2 = new MulThread();
        th2.start();

        MyRunnable r = new MyRunnable();

        Thread th3 = new Thread(r);
        th3.start();

        for(int i=0 ; i<100; i ++){
            System.out.println("Main ："+i);
           try{
               System.out.println(Thread.currentThread().getName()+" + "+i);
               Thread.sleep(100);
           }catch(Exception e){

           }
        }
    }

}
