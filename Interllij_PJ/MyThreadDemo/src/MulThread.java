/**
 * Created by Captain Wang on 16/12/10.
 */
public class MulThread extends Thread{



    public void run(){
       for(int i =0 ; i<100;i++){

           System.out.println(Thread.currentThread().getName()+" + "+i);
           try{
               Thread.sleep(100);
           }catch(Exception e){

           }
       }

   }
}
