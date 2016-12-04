package game.roles;
import game.logic.GongFuMaster;
import game.logic.GongFuPerson;

/**
 * Created by Captain Wang on 16/12/4.
 */
public class Linghuchong extends GongFuMaster {

    String name;
    public Linghuchong() {
    }

    public Linghuchong(String name){
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
        System.out.println(this.getName()+"使用绝招【独孤九剑】攻击 "+person.getName()+" 300点血");

    }

    @Override
    public void commonSkill(GongFuPerson person){
        super.commonSkill(person);
        System.out.println(this.getName()+"使用【越女剑法】攻击 "+person.getName()+" 50点血");
    }

    @Override
    public void bestSkill(GongFuPerson person){
        super.bestSkill(person);
        System.out.println(this.getName()+"使用【华山剑法】攻击 "+person.getName()+" 100点血");
    }

}
