/**
 * Created by wangwei on 16/12/4.
 */
public class Dog extends Animal implements CatchMouse{


    @Override
    public void catchMouse() {
        System.out.println("I am dog,i can catch mouse too.");
    }

}
