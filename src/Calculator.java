import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;

    public Calculator(){
        createUIComponenets();



        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                if(textField2.getText().length() > 0){
                    int Bill = Integer.parseInt(textField2.getText());
                    System.out.println(Bill);
                }


            }
        });
    }

    private void createUIComponenets(){
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        String Bill = textField2.getText();
        int billNum = 0;
        billNum = Integer.parseInt(Bill);
        String Tip = textField1.getText();
        int tipNum = 0;
        tipNum = 100 / Integer.parseInt(Tip);
        String NumberOfPeople = textField3.getText();
        int NumOfPeople = 0;
        NumOfPeople = Integer.parseInt(NumberOfPeople);
        int finalTip = (tipNum * billNum) / NumOfPeople;
        System.out.println(finalTip);

    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
