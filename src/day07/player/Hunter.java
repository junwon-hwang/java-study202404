package day07.player;

public class Hunter  extends Player {

    int concentration;

    public Hunter(String nickname) {
        super(nickname);
        this.concentration = 50;
    }

    public void showStatus(){
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow(){

    }
}
