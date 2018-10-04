import calculator.controller.CalculatorController;
import calculator.model.CalculatorModel;
import calculator.CalculatorView;

import javax.swing.*;

/**
 * Created by User on 04.10.2018
 */
public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        CalculatorView view = new CalculatorView(controller);
        model.registerObserver(view);
        javax.swing.SwingUtilities.invokeLater(() -> {
            view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            view.pack();
            view.setVisible(true);
        });
    }
}
