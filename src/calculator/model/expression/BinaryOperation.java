package calculator.model.expression;

/**
 * Created by User on 04.10.2018
 */
public abstract class BinaryOperation extends Operation {
    abstract double calculate(Operand a, Operand b);
}
