import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class showtext extends JFrame implements ActionListener {
  JLabel label;

  public static void main(String[] args) {
    showtext test = new showtext("showtext");

    //アプリが終了すると、ターミナルも自動終了
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    test.setVisible(true);
  }

  showtext(String title) {
    setTitle(title);
    setBounds(10, 10, 300, 200);
    label = new JLabel("");

    JButton btn = new JButton("start");
    btn.addActionListener(this);

    JPanel p = new JPanel();
    p.add(label);
    p.add(btn);

    getContentPane().add(p);

  }

  public void  actionPerformed(ActionEvent e) {
    label.setText("START");
  }
}
