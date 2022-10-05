package games;

public class Player {
    int score;
    String name;
    //constructor
    public Player(String name, int score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public void rageQuit(){
        System.exit(0);
    }
    public String toString(){
        return "Name;" +this.name+ "Score:" + this .score;
    }
}
