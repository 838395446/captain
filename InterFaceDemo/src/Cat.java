/**
 * Created by wangwei on 16/12/4.
 */
public class Cat extends Animal implements CatchMouse {

    @Override
    public void catchMouse() {
        System.out.println("I am cat ,i can catch mouse.");
    }

}
