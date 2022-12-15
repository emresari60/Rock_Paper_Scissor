import java.util.*;


public class RockPaperScissor {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Voices.theme16();
        result();
    }
    static int yourScore,javasScore;

    public static void play() {

        String yourChoose=scan.next().toUpperCase();
        String you ="";
        boolean flag=true;
        do{
        switch (yourChoose) {
            case "P":
                you = "Paper";
                flag=false;
                break;
            case "R":
                you = "Rock";
                flag=false;
                break;
            case "S":
                you = "Scissor";
                flag=false;
                break;
            default:
            System.out.println("There is no escape from here loser. Make a decision!!!");
            Voices.getOverHere();
            yourChoose=scan.next().toUpperCase();
                }}while(flag);

        //Create A random integer and switch it to R or P or S
        Random rndm = new Random();
        int random = rndm.nextInt(3);

        String java = "";

        switch (random) {
            case 0:
                java = "Paper";
                break;
            case 1:
                java = "Rock";
                break;
            case 2:
                java = "Scissor";
                break;
        }
        System.out.println("java = " + java);
        System.out.println("You = " + you);





        if (java.equals("Rock") & you.equals("Rock")) {
            System.out.println("Score tied");
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Rock") & you.equals("Paper")) {
            System.out.println("You win ");
            yourScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Rock") & you.equals("Scissor")) {
            System.out.println("Java win ");
            javasScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Paper") & you.equals("Paper")) {
            System.out.println("Score tied");
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Paper") & you.equals("Rock")) {
            System.out.println("Java win ");
            javasScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Paper") & you.equals("Scissor")) {
            System.out.println("You win ");
            yourScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Scissor") & you.equals("Rock")) {
            System.out.println("You win ");
            yourScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Scissor") & you.equals("Paper")) {
            System.out.println("Java win ");
            javasScore++;
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        } else if (java.equals("Scissor") & you.equals("Scissor")) {
            System.out.println("Score tied");
            System.out.println("Your Score = " + yourScore +"<-->"+javasScore+"= Java's Score");
        }

    }

    public static void result() {

        System.out.println("Let's Play");
        Voices.round1();

        System.out.println("Wish luck for yourself and choose one of R (for rock) or P (for paper) or S (for scissor)");
        for (int i = 1; i < 4; i++) {
            if (i==1){
                play();
                if (yourScore>javasScore){
                    Voices.fatality();
                } else if (javasScore>=yourScore) {
                    Voices.thatWasPathetic();
                }
            } else if (i == 2)
                {System.out.println("----------------------------------------------------------------------------------");
                Voices.round2();
                System.out.println("Make your choose for 2. Round!!!  R (for rock) or P (for paper) or S (for scissor)");

                    play();
                    if (yourScore>javasScore){
                        Voices.fatality();
                    } else if (javasScore>=yourScore) {
                        Voices.thatWasPathetic();
                    }
                    }
            else if (i == 3)
            {System.out.println("----------------------------------------------------------------------------------");
             Voices.finalRound();
             System.out.println("Starting of the End!!! Make your last decision  R (for rock) or P (for paper) or S (for scissor)");
                play();
                if (yourScore==3 || javasScore==3){
                    Voices.finishHim();
                    Voices.fatality();
                    if(yourScore>javasScore) {
                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                        System.out.println("FINAL SCORE : YOU WIN!!!");
                    } else if (yourScore<javasScore) {
                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                        System.out.println("FINAL SCORE : JAVA WIN!!!");
                } }else {
                    Voices.finishHim();
                    if(yourScore>javasScore) {
                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                        System.out.println("FINAL SCORE : YOU WIN!!!");
                    } else if (yourScore<javasScore) {
                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                        System.out.println("FINAL SCORE : JAVA WIN!!!");
                    } else {
                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                        System.out.println("FINAL SCORE : SCORE TIED!!!");
                        Voices.thatWasPathetic();
                    }
                }

            }

        }
    }
}
