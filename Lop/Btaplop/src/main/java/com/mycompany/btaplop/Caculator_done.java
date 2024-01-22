/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btaplop;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dugdug
 */
public class Caculator_done extends JFrame {
        private JTextField tfResult;
    private StringBuilder input;
    public Caculator_done(){
        
        setTitle("Calculator");
        setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tfResult = new JTextField();
        input = new StringBuilder();
        tfResult.setFont(new Font("Arial", Font.PLAIN, 30));
        tfResult.setColumns(30);
        JPanel number = new JPanel();
        JPanel operator = new JPanel();
        this.setLayout(new BorderLayout());
        
        number.setLayout(new GridLayout(4,3));
        operator.setLayout(new GridLayout(5,1));
        add(number, BorderLayout.CENTER);
        add(operator, BorderLayout.EAST);
        add(tfResult, BorderLayout.NORTH);
        String[] arr={
            "1","2","3","4","5","6","7","8","9","0",".","C"
        };
        String[] arr2={
            "+","-","*","/","="
        };
        for(String lable : arr){
            JButton button = new JButton(lable);
            button.addActionListener((ActionListener) new NumberButtonClickListener());
            number.add(button);
        }
        for(String lable : arr2){
            JButton button = new JButton(lable);
            button.addActionListener(new OperatorButtonClickListener());
            operator.add(button);
        }
        this.setLocationRelativeTo(null);        
        this.setVisible(true);
    }
    private class NumberButtonClickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String text = source.getText();
            if(text.equals("C")){
                tfResult.setText("");
                input.setLength(0);
            }else{
            tfResult.setText(tfResult.getText() + text);
            input.append(text);
            }
        }
        
    }

    private class OperatorButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String text = source.getText();
            
            if(text.equals("=")){
                double result=evaluateExpression();
                tfResult.setText(String.valueOf(result));
                input.setLength(0);
            }else if(text.equals("C")){
                tfResult.setText("");
                input.setLength(0);
            }else{
                input.append(" ").append(text).append(" ");
                tfResult.setText(tfResult.getText() + " " + text + " ");
            }
        }
    }
    
    private double evaluateExpression(){
        String[] tokens=input.toString().split("\\s+");
        double result=Double.parseDouble(tokens[0]);
        for(int i=1;i<tokens.length;i+=2){
            String operator = tokens[i];
            double operand=Double.parseDouble(tokens[i+1]);
            
            switch(operator){
                case "+":
                    result+=operand;
                    break;
                case "-":
                    result-=operand;
                    break;
                case "*":
                    result*=operand;
                    break;
                case "/":
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        tfResult.setText("Error");
                        return 0; // Return early if division by zero
                    }
                    break;
            }
            
        }
        return result;
        
    }
    public static void main(String[] args){
        Caculator_done ca = new Caculator_done();
    }
}
