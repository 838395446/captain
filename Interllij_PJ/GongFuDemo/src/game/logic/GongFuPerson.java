package game.logic;

/**
 * Created by Captain Wang on 16/12/4.
 */
public class GongFuPerson extends Person{

    protected int blood = 1000;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }



    public GongFuPerson() {

    }

    public GongFuPerson(String name){
        this.name = name;
    }

    public void commonSkill(GongFuPerson person){
        person.blood-=50;
    }

    public void bestSkill(GongFuPerson person){
        person.blood-=100;
    }

}
