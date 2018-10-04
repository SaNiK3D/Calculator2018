package calculator.model;

/**
 * Created by User on 04.10.2018
 */
public class UnaryState extends ModelState {
    @Override
    void handleDigit(int digit, CalculatorModel model) {
        super.handleDigit(digit, model);
    }

    @Override
    void handleUnaryOperation(UnaryOperation operation, CalculatorModel model) {
        super.handleUnaryOperation(operation, model);
    }

    @Override
    void handleOpenBracket(CalculatorModel model) {
        super.handleOpenBracket(model);
    }
}
