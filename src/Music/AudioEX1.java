// this code does not work with the music, alteration have been made which still wouldnt start music
package Music;

//captain kesty
import java.io.*;
import sun.audio.*;
public class AudioEX1 {

    // first method of importing audio
    
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(new File("Wastelands.wav")); // must be in .wav format
        AudioStream audioEX = new AudioStream(in);
        AudioPlayer.player.start(audioEX);
       // AudioPlayer.player.stop(audioEX);
    }
}
