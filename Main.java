import javax.swing.*;

public class Main {
    public static void main(String[] args) {
     JFrame frame = new JFrame();
     GamePlay gameplay = new GamePlay();
     frame.setBounds(10,10,700,600);
     frame.setTitle("BrickBreaker");
     frame.setResizable(false);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
     frame.add(gameplay);
    }
}