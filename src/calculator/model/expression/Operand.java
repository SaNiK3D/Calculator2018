package calculator.model.expression;

/**
 * Created by User on 04.10.2018
 */
public class Operand implements ExpressionElement{
    private final double value;

    public Operand(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }
}
