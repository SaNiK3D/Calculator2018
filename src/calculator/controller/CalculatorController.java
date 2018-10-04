package calculator.controller;

import calculator.model.CalculatorModel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 04.10.2018
 */
public class CalculatorController {
    private final CalculatorModel model;
    private final Map<String, ControllerStrategy> strategies = new HashMap<>();

    public CalculatorController(CalculatorModel model) {
        this.model = model;
    }

    public void inputString(String in){
        model.addElement(in);
    }
}
