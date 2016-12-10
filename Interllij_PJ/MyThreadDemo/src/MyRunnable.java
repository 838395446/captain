/**
 * Created by Captain Wang on 16/12/10.
 */
public class MyRunnable implements Runnable {

    public void run() {

        for(int i = 0;i< 100;i++)
        {
            System.out.println("Main ：" + i);
            try {
                System.out.println(Thread.currentThread().getName() + " + " + i);
                Thread.sleep(100);
            } catch (Exception e) {
            }


        }
    }


}