package calculator.controller;

import calculator.model.CalculatorModel;

/**
 * Created by User on 04.10.2018
 */
interface ControllerStrategy {
    void performAction(CalculatorModel model);
}
