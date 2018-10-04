package calculator.model;

import calculator.model.expression.Expression;
import observer.ObservableModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.10.2018
 */
public class CalculatorModel extends ObservableModel {
    private Expression expression;

    public CalculatorModel() {
        this.expression = new Expression();
    }

    public void addElement(String element){
        expression.addElement(element);
    }

    public void delete(){
        expression.removeElement();
    }
}
