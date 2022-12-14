import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Voices extends SoundPlayerUsingClip {
    public static void main(String[] args) {
       // theme();
       // round2();
      // finalRound();
      //  getOverHere();
       // thatWasPathetic();
       // fatality();
      // finishHim();
       // theme16();

    }
    public Voices() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    }

    public static void round1() {
        try {
            filePath = "src/main/java/voices/round_1.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(3000);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }
    public static void round2() {
        try {
            filePath = "src/main/java/voices/round_2.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(3000);
            audioPlayer.stop();

        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void finalRound() {
        try {
            filePath = "src/main/java/voices/finalround.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(3000);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void theme() {
        try {
            filePath = "src/main/java/voices/theme_4mins.wav";
            Voices audioPlayer=new Voices();
            audioPlayer.play();
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void getOverHere() {
        try {
            filePath = "src/main/java/voices/get_over_here.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(1800);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void thatWasPathetic() {
        try {
            filePath = "src/main/java/voices/that was pathetic.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(2400);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void fatality() {
        try {
            filePath = "src/main/java/voices/fatality.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(1600);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void finishHim() {
        try {
            filePath = "src/main/java/voices/finish_him.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            Thread.sleep(1600);
            audioPlayer.stop();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    public static void theme16() {
        try {
            filePath = "src/main/java/voices/theme16sec.wav";
            Voices audioPlayer=new Voices();

            audioPlayer.play();
            //Thread.sleep(3000);
            //audioPlayer.stop();
            //audioPlayer.restart();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

}
