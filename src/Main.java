import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
  public static void main(String[] args) {
    //creating instance of JFrame
    JFrame f= new JFrame();
    // Add a button
    JButton b1 = new JButton("Push Me!");
    b1.setBounds(10, 10, 180, 40);
    // Add some text
    JLabel l1 = new JLabel();
    l1.setText("Label Text");
    l1.setBounds(10, 60, 200, 40);
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //your actions
            b1.setBounds(10, 10, 280, 40);
            String msg = getMessage();
            b1.setText("Not Yet a Card Game.");
            l1.setText(msg);
        }
    });
    f.add(l1);
    f.add(b1);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static String getMessage() {
      String str = "";
      Card c1 = new Card(Ranks.ACE, Suits.DIAMONDS);
      str += c1.toString();
      return str;
  }
}