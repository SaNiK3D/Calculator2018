package calculator.model.expression;

/**
 * Created by User on 04.10.2018
 */
public abstract class UnaryOperation extends Operation {
    abstract double calculate(Operand o);
}
