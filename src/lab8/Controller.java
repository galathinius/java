package lab8;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public static class DivisionEventListener {
        TextField textField1;
        TextField textField2;
        Label label;

        DivisionEventListener(TextField textField1, TextField textField2, Label label) {
            this.textField1 = textField1;
            this.textField2 = textField2;
            this.label = label;
        }

        public void listen(ActionEvent actionEvent) {
            try {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());

                double res = getDivisor(number1, number2);
                label.setText(Double.toString(res));

            }
            catch (Unlucky error) {
                label.setText(error.getMessage());
            }
            catch(ArithmeticException error) {
                label.setText(error.getMessage());
            }
            catch(Exception error) {
                label.setText("Invalid input");
            };
        }
    }


    static public double getDivisor(double number1, double number2) throws Unlucky {
        if(number2 == 13) {
            throw new Unlucky("denominator is 13");
        }
        if (number2 == 0) {
            throw new ArithmeticException("denominator is 0");
        }
        return number1 / number2;
    }
}
