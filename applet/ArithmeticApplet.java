import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, sub, mul, div;

    public void init() {
        Label label1 = new Label("Number 1:");
        add(label1);
        num1 = new TextField(5);
        add(num1);

        Label label2 = new Label("Number 2:");
        add(label2);
        num2 = new TextField(5);
        add(num2);

        add = new Button("Add");
        add(add);
        add.addActionListener(this);

        sub = new Button("Subtract");
        add(sub);
        sub.addActionListener(this);

        mul = new Button("Multiply");
        add(mul);
        mul.addActionListener(this);

        div = new Button("Divide");
        add(div);
        div.addActionListener(this);

        result = new TextField(10);
        result.setEditable(false);
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(num1.getText());
        double number2 = Double.parseDouble(num2.getText());
        double res = 0;

        if (e.getSource() == add) {
            res = number1 + number2;
        } else if (e.getSource() == sub) {
            res = number1 - number2;
        } else if (e.getSource() == mul) {
            res = number1 * number2;
        } else if (e.getSource() == div) {
            res = number1 / number2;
        }

        result.setText(String.valueOf(res));
    }
}
