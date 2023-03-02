import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sample extends JFrame{

  final int windowWidth = 500;
  final int windowHeight = 800;
  public static void main(String[] args) {
  
    new sample();
  }

  public sample() {
    Dimension dimOfScreen = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds(dimOfScreen.width/2 - windowWidth/2,
    dimOfScreen.height/2 - windowHeight/2, windowWidth,windowHeight);
    setResizable(false);
    setTitle("JavaGame");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    MyJpanel panel = new MyJpanel();
    Container c = getContentPane();
    c.add(panel);
    setVisible(true);
  }

  public class MyJpanel extends JPanel implements ActionListener {
    // elements
    Dimension dimOfPanel;
    JButton button;
    Timer timer;
    JLabel label;

    // variable of timer
    int second, decimal, count = 0;
    
    public MyJpanel() {
      timer = new Timer(50, this);
      button = new JButton("START");
      label = new JLabel("");
      button.setBounds(windowWidth/2, 50, 200, 60);
      button.addActionListener(this);
      add(label);
      add(button);
    }
    
    public void  actionPerformed(ActionEvent e) {
      label.setText("START");
    }
  }
}
