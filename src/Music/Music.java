package Music;


import java.io.*;
import sun.audio.*;
import java.util.*;

public class Music {

    public static void main(String[] args) throws Exception {
        String sChoice;

        Scanner sin = new Scanner(System.in);
        System.out.println("Type A to play Wastelands or type B to play Final Masquerade");
        sChoice = sin.next();

        if (sChoice.equals("A")) {

            // open the sound file as a Java input stream
            String Wastelands = "H:\\NetBeansProjects\\Wastelands.wav";
            InputStream in = new FileInputStream(Wastelands);
            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);
            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
            System.out.println("Type Stop to stop when you are done");
            sChoice = sin.next();

            if (sChoice.equals("Stop")) {
                AudioPlayer.player.stop(audioStream);
            }

        } else if (sChoice.equals("B")) {

            String Final = "H:\\Netbeans\\Final Masquerade.wav";
            InputStream in = new FileInputStream(Final);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
            System.out.println("Type Stop to stop when you are done");
            sChoice = sin.next();

            if (sChoice.equals("Stop")) {
                AudioPlayer.player.stop(audioStream);
            }

        }

    }
}


/*
 //open the sound file as a Java input stream
 String Wastelands = "C:\\Users\\prabh\\Documents\\NetBeansProjects\\Wastelands.wav";
 InputStream in = new FileInputStream(Wastelands);

 // create an audiostream from the inputstream
 AudioStream audioStream = new AudioStream(in);

 // play the audio clip with the audioplayer class
 AudioPlayer.player.start(audioStream);
 */
