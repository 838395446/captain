import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Captain Wang on 16/12/11.
 */
public class RunPJTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void test1() throws Exception {

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