package calculator.model;

/**
 * Created by User on 04.10.2018
 */
abstract class ModelState {
    void handleDigit(int digit, CalculatorModel model){}
    void handleUnaryOperation(UnaryOperation operation, CalculatorModel model){}
    void handleBinaryOperation(BinaryOperation operation, CalculatorModel model){}
    void handleOpenBracket(CalculatorModel model){}
    void handleCloseBracket(CalculatorModel model){}
    void handleComma(CalculatorModel model){}
    void handleEquals(CalculatorModel model){}
}
