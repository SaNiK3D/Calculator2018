package calculator.model.expression;

import java.util.*;

/**
 * Created by User on 04.10.2018
 */
public class Expression {
    private final List<String> elements;
    private final Map<String, ExpressionElement> expressionElements = new HashMap<>();
    private final Map<String, Integer> priorities = new HashMap<>();

    public Expression() {
        this.elements = new ArrayList<>();
        priorities.put("+", 5);
        priorities.put("-", 5);
        priorities.put("*", 4);
        priorities.put("/", 4);
        priorities.put("^", 3);
        priorities.put("√", 5);
        priorities.put("sin", 5);
        priorities.put("cos", 5);
        priorities.put("tg", 5);
        priorities.put("ctg", 5);
    }

    public void addElement(String element){
        if(!elements.isEmpty() && elements.get(elements.size() - 1).matches(""))
        elements.add(element);
    }

    public void removeElement(){
        if (!elements.isEmpty())
            elements.remove(elements.size() - 1);
    }

    public void calculate(){
        Stack<String> operandStack = new Stack<>();
        Stack<String> operationStack = new Stack<>();

        for (String currentStr : elements) {
            if (currentStr.matches("\\d")){
                operandStack.push(currentStr);
            } else switch (currentStr){

            }
        }
    }

}
