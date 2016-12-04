package game.app;

import game.logic.GongFuMaster;
import game.roles.Linghuchong;
import game.roles.Ouyangfeng;

import java.util.Scanner;

/**
 * Created by Captain Wang on 16/12/4.
 */
public class Game {

    public static Scanner in =new Scanner(System.in);
    public static int choice;

    public static GongFuMaster player;
    public static GongFuMaster computer;
    public static boolean isFirst=true;

    public static  void init(){
        switch (choice){
            case 1:
                player = new Linghuchong("令狐冲");
                computer = new Ouyangfeng("欧阳锋");
                break;
            case 2:
                computer = new Linghuchong("令狐冲");
                player = new Ouyangfeng("欧阳锋");
                break;
        }
        System.out.println("你选择了："+player.getName()+"\n");
    }


    public static void begin_pk(GongFuMaster player , GongFuMaster computer){
        int temp = (int) (Math.random()*10)%3;
        temp++;
        switch (temp){
            case 1:
                if(Game.isFirst){
                    player.commonSkill(computer);
                }
                else{
                    computer.commonSkill(player);
                }
                break;
            case 2:
                if(Game.isFirst){
                    player.bestSkill(computer);
                }
                else{
                    computer.bestSkill(player);
                }
                break;

            case 3:
                if(Game.isFirst){
                    player.secrets(computer);
                }
                else{
                    computer.secrets(player);
                }
                break;

        }
        isFirst=!Game.isFirst;

    }

    public static boolean isComplete() {
        if (Game.player.getBlood() >0 || Game.computer.getBlood() >0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void showResult(){
        if(Game.player.getBlood()==0){
            System.out.println("\n青山不改绿水长流，后会有期");
            System.out.println("*********** 你输啦！ 游戏结束 **********");
        }else{
            System.out.println("\n别羡慕哥，哥只是个传奇！");
            System.out.println("*********** 你赢啦！游戏结束 **********");
        }
    }




    public static void showMenu(){

        System.out.println("****** 开始游戏：金庸群侠传 *******");
        System.out.println("1.令狐冲       2.欧阳锋");
        System.out.print("请选择：");
        choice=in.nextInt();1

    }

    public static void main(String[] args){
        Game.showMenu();
        Game.init();

        do{
            Game.begin_pk(player,computer);
        }while (Game.isComplete());

        Game.showResult();

    }

}
