import javax.swing.JFrame;

class Main {
    // set up window, instantiate GamePanel
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Greenlings - Quest for a Better Earth");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); // adjust to preferrred size

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}