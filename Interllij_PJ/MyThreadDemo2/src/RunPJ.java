/**
 * Created by Captain Wang on 16/12/11.
 */
public class RunPJ {

    public static void main(String[] agrs) {
        MyThreadDemo th1 = new MyThreadDemo();

        MyThreadDemo th2 = new MyThreadDemo("First");
        th2.start();
        th1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (i + 1));
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }
}
