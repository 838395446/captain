package game.logic;

/**
 * Created by Captain Wang on 16/12/4.
 */
public class GongFuMaster extends GongFuPerson implements Secrets {


    @Override
    public void secrets(GongFuPerson person) {
        person.blood-=300;
    }
}
