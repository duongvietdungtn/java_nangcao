/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btaplop;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dugdug
 */
public class B2_17_1 extends JFrame {
    public B2_17_1(){
        this.setTitle("Hello Dung");
        this.setSize(400,500);
        
        JButton b_Dong = new JButton("Đông");
        JButton b_Tay = new JButton("Tây");
        JButton b_Nam = new JButton("Nam");
        JButton b_Bac = new JButton("Bắc");        
        JButton b_Center = new JButton("Trung tâm");
        
        this.setLayout (new BorderLayout());
        this.add(b_Dong, BorderLayout.EAST);
        this.add(b_Tay, BorderLayout.WEST);
        this.add(b_Nam, BorderLayout.SOUTH);
        this.add(b_Bac, BorderLayout.NORTH);
        this.add(b_Center, BorderLayout.CENTER);
        this.setVisible(true);
    }
    public static void main(String[] args){
        B2_17_1 d = new B2_17_1();
    }
}
