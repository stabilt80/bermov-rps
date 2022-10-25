package games;
import java.util.Scanner;
public class RockPaperScissors {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    Player player;
    Fist aIFist;

    //@TODO: declare the methods access modifier: public, private or protected
    //An instance of the object cannot be created from outside its package if the constructor is not declared as public
    //@FIXME: Use the variable arguments playerName and playerScore passed in the method call instead of static values
    RockPaperScissors(String playerName, int playerScore) {
        player = new Player("lucas", 0);
        aIFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors("Marcus", 0);
        game.playGame();
    }

    //@TODO: declare the methods access modifier: public, private or protected
    void playGame() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Rock, paper, scissors");
        String choice=scanner.nextLine();
        String stringresult="";
        int intresult=aIFist.play();

        if(intresult==Fist.ROCK){
            stringresult="ROCK";
        }
        if(intresult==Fist.PAPER){
            stringresult="PAPER";
        }
        if(intresult==Fist.SCISSORS){
            stringresult="SCISSORS";
        }
        
        //@TODO: You can optimize the if statements
        if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Rcok")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Du vann");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Du vann");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Du Vann");
        }
    }
}