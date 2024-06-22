import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator implements ActionListener{

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonAdd = new JButton("+");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonReciprocal = new JButton("1/x");


    //Variables
    double num1 = 0, num2 =0; 
    double answer= 0;
    int calculate;

    //Creating a constructor and passing methods in it.
    Calculator(){
        prepareGui();
        addComponents();
        addActionEvent();
    }

    //Preparing the JFrame pallete.
    public void prepareGui(){
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Adding all the Components.
    public void addComponents(){
        //Added label
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);


        //Added TextField
        textField.setBounds(10,40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);


        //Adding Radiobuttons

        //1. ON RadioButton
        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);
        //2. OFF RadioButton
        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        //Adding Buttons
        button7.setBounds(10,230,60,40);
        button7.setFont(new Font("Arial", Font.BOLD, 20));
        button7.setFocusable(false);
        frame.add(button7);
        button8.setBounds(80,230,60,40);
        button8.setFont(new Font("Arial", Font.BOLD, 20));
        button8.setFocusable(false);
        frame.add(button8);
        button9.setBounds(150,230,60,40);
        button9.setFont(new Font("Arial", Font.BOLD, 20));
        button9.setFocusable(false);
        frame.add(button9);
        button4.setBounds(10,290,60,40);
        button4.setFont(new Font("Arial", Font.BOLD, 20));
        button4.setFocusable(false);
        frame.add(button4);
        button5.setBounds(80,290,60,40);
        button5.setFont(new Font("Arial", Font.BOLD, 20));
        button5.setFocusable(false);
        frame.add(button5);
        button6.setBounds(150,290,60,40);
        button6.setFont(new Font("Arial", Font.BOLD, 20));
        button6.setFocusable(false);
        frame.add(button6);
        button1.setBounds(10,350,60,40);
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        button1.setFocusable(false);
        frame.add(button1);
        button2.setBounds(80,350,60,40);
        button2.setFont(new Font("Arial", Font.BOLD, 20));
        button2.setFocusable(false);
        frame.add(button2);
        button3.setBounds(150,350,60,40);
        button3.setFont(new Font("Arial", Font.BOLD, 20));
        button3.setFocusable(false);
        frame.add(button3);
        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);
        button0.setBounds(10,410,130,40);
        button0.setFont(new Font("Arial", Font.BOLD, 20));
        button0.setFocusable(false);
        frame.add(button0);

        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220,110,60,40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);

        buttonMul.setBounds(220,230,60,40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonSqrt.setBounds(10,170,60,40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonSub.setBounds(220,170,60,40);
        buttonSub.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSub.setBackground(new Color(239, 188, 2));
        buttonSub.setFocusable(false);
        frame.add(buttonSub);

        buttonAdd.setBounds(220,290,60,40);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
        buttonAdd.setBackground(new Color(239, 188, 2));
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 16));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150,110,60,40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.gray);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);
    }

    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object object = e.getSource();
        if(object == onRadioButton)
        {
            enable(); //Components to be On or Off.
        }
        else if(object == offRadioButton)
        {
            disable();
        }
        else if(object == buttonClear)
        {
            label.setText("");
            textField.setText("");
        }
        else if(object == buttonDelete)
        {
            int length = textField.getText().length();
            int number = length-1;
            if(length>0)
            {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith(""))
            {
                label.setText("");
            }
        }

        else if(object == button0)
        {
            if(textField.getText().equals("0"))
            {
                return;
            }
            else{
                textField.setText(textField.getText() + "0");
            }
        }
        else if(object == button1)
        {
            textField.setText(textField.getText() + "1");
        }
        else if(object == button2)
        {
            textField.setText(textField.getText() + "2");
        }
        else if(object == button3)
        {
            textField.setText(textField.getText() + "3");
        }
        else if(object == button4)
        {
            textField.setText(textField.getText() + "4");
        }
        else if(object == button5)
        {
            textField.setText(textField.getText() + "5");
        }
        else if(object == button6)
        {
            textField.setText(textField.getText() + "6");
        }
        else if(object == button7)
        {
            textField.setText(textField.getText() + "7");
        }
        else if(object == button8)
        {
            textField.setText(textField.getText() + "8");
        }
        else if(object == button9)
        {
            textField.setText(textField.getText() + "9");
        }
        else if(object == buttonDot)
        {
            if(textField.getText().contains("."))
            {
                return;
            }
            else{
                textField.setText(textField.getText() + ".");
            }
        }
        else if(object == buttonAdd)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculate = 1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if(object == buttonSub)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculate = 2;
            textField.setText("");
            label.setText(str + "-");
        }
        else if(object == buttonMul)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculate = 3;
            textField.setText("");
            label.setText(str + "x");
        }
        else if(object == buttonDiv)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculate = 4;
            textField.setText("");
            label.setText(str + "/");
        }
        else if(object == buttonSquare)
        {
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0"))
            {
                textField.setText(string.replace(".0",""));
            }
            else{
                textField.setText(string);
            }
        }
        else if( object == buttonSqrt)
        {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }
        else if( object == buttonReciprocal)
        {
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1/num1;
            String string = Double.toString(reciprocal);
            if(string.endsWith(".0"))
            {
                textField.setText(string.replace(".0", ""));
            }
            else
            {
                textField.setText(string);
            }
        }
        else if( object == buttonEqual)
        {
            num2 = Double.parseDouble(textField.getText());
            switch(calculate)
            {
                case 1:
                answer = num1 + num2;
                break;
                case 2:
                answer = num1 - num2;
                break;
                case 3:
                answer = num1 * num2;
                break;
                case 4:
                answer = num1/num2;
                break;
            }if(Double.toString(answer).endsWith(".0"))
            {
                textField.setText(Double.toString(answer).replace(".0", ""));
            }
            else{
                textField.setText(Double.toString(answer));
            }
            label.setText("");
            num1 = answer;
        }
        
    }

    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        label.setEnabled(true);
        textField.setEnabled(true);
        buttonClear.setEnabled(true);
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSub.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
    }

    public void disable()
    {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setText(" ");
        textField.setText("");
        buttonClear.setEnabled(false);
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSub.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
    }
}