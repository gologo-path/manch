import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

public class Card {
    private Image wrap;
    private Image face;
    public Card(String a, String b){
        try {
            URL url = new URL(a);
            wrap = ImageIO.read(url);
            URL url1 = new URL(b);
            face = ImageIO.read(url1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
