
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class GamePanel extends JPanel implements  Runnable{

    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16px x 16px tile norm
    final int scale = 3; // 48px x 48 px adjusted tile

    final int tileSize = originalTileSize * scale; // 48px x 48px tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = maxScreenCol * tileSize; // 768px
    final int screenHeight = maxScreenRow * tileSize; // 576px

    Thread gameThread; // automatically calls run method

    public GamePanel(){
        this.setPreferredSize(new DimensionUIResource(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); // paints faster, offscreem

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
       System.out.println("Game Thread created, running method for game loop!");
    }
    
}
