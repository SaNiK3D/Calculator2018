package calculator;

import calculator.controller.CalculatorController;
import observer.ObserverModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 03.10.2018
 */
public class CalculatorView extends JFrame implements ObserverModel, ActionListener {
    private final CalculatorController controller;

    private final JTextField calculationTextField;

    public CalculatorView(CalculatorController controller) throws HeadlessException {
        super("Калькулятор");
        this.controller = controller;

        JPanel rootPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.add(rootPanel);

        // создание верхней панели
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.LINE_AXIS));
        calculationTextField = new JTextField();
        calculationTextField.setEditable(false);
        topPanel.add(calculationTextField);
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.weighty = 0.0;
        rootPanel.add(topPanel, c);

        // создание средней левой панели
        JPanel leftMiddlePanel = new JPanel();
        leftMiddlePanel.setLayout(new BoxLayout(leftMiddlePanel, BoxLayout.PAGE_AXIS));
        ButtonGroup group = new ButtonGroup();
        JRadioButton degreesRadButton = new JRadioButton("Градусы", true);
        group.add(degreesRadButton);
        leftMiddlePanel.add(degreesRadButton);
        JRadioButton radiansRadButton = new JRadioButton("Радианы");
        group.add(radiansRadButton);
        leftMiddlePanel.add(radiansRadButton);
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        rootPanel.add(leftMiddlePanel, c);

        // создание средней правой панели
        JPanel rightMiddlePanel = new JPanel();
        rightMiddlePanel.setLayout(new BoxLayout(rightMiddlePanel, BoxLayout.PAGE_AXIS));
        rightMiddlePanel.add(new Label("История"));
        JPanel backAndForwardPanel = new JPanel();
        backAndForwardPanel.setLayout(new BoxLayout(backAndForwardPanel, BoxLayout.LINE_AXIS));
        JButton backwardHistoryButton = new JButton("←");
        JButton forwardHistoryButton = new JButton("→");
        backAndForwardPanel.add(backwardHistoryButton);
        backAndForwardPanel.add(forwardHistoryButton);
        rightMiddlePanel.add(backAndForwardPanel);
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        rootPanel.add(rightMiddlePanel, c);

        // создание нижней левой панели
        JPanel leftDownPanel = new JPanel(new GridLayout(5, 2));
        String[] btnNames = {"(", ")", "√", "^", "sin", "cos", "tg", "ctg", "π", "e"};
        for (String btnName : btnNames) {
            JButton btn = new JButton(btnName);
            btn.addActionListener(this);
            leftDownPanel.add(btn);
        }
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        rootPanel.add(leftDownPanel, c);

        // создание нижней правой панели
        JPanel rightDownPanel = new JPanel();
        rightDownPanel.setLayout(new BoxLayout(rightDownPanel, BoxLayout.PAGE_AXIS));

        JPanel topRightDownPanel = new JPanel();
        topRightDownPanel.setLayout(new BoxLayout(topRightDownPanel, BoxLayout.LINE_AXIS));
        topRightDownPanel.add(new JButton("Стереть"));
        topRightDownPanel.add(new JButton("Очистить"));
        rightDownPanel.add(topRightDownPanel);

        JPanel downRightDownPanel = new JPanel(new GridLayout(4, 4));
        btnNames = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ",", "=", "+"};
        for (String btnName : btnNames) {
            JButton btn = new JButton(btnName);
            btn.addActionListener(this);
            downRightDownPanel.add(btn);
        }
        rightDownPanel.add(downRightDownPanel);

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 2;
        rootPanel.add(rightDownPanel, c);
    }

    @Override
    public void update(String data) {
        calculationTextField.setText(data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.inputString(e.getActionCommand());
    }
}
