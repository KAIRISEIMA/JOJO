import com.sun.javafx.image.BytePixelSetter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.PINK);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.cyan);
        myPanel.add(textArea_B);
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() ==KeyEvent.VK_ENTER){

                if (textArea_A.getText().equals("DIO")) {
                textArea_B.setText("我不做人了！JOJO!正确！ \n");
                }else {
                    textArea_B.setText("回答错误！");
                }

                }

            }
        });
    }
    //显示窗体方法
    void go(){

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
