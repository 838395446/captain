package game.roles;

import game.logic.GongFuMaster;
import game.logic.GongFuPerson;

/**
 * Created by Captain Wang on 16/12/4.
 */
public class Ouyangfeng extends GongFuMaster {

    String name;
    public Ouyangfeng() {
    }

    public Ouyangfeng(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void secrets(GongFuPerson person){

        super.secrets(person);
        System.out.println(this.getName()+"使用绝招【蛤蟆功】攻击 "+person.getName()+" 300点血");

    }

    @Override
    public void commonSkill(GongFuPerson person){
        super.commonSkill(person);
        System.out.println(this.getName()+"使用【毒蛇】攻击 "+person.getName()+" 50点血");
    }

    @Override
    public void bestSkill(GongFuPerson person){
        super.bestSkill(person);
        System.out.println(this.getName()+"使用【毒蛇拐杖】攻击 "+person.getName()+" 100点血");
    }

}
