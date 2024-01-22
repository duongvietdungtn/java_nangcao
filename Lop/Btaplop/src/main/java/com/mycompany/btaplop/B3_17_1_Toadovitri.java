/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btaplop;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dugdug
 */
public class B3_17_1_Toadovitri extends JFrame {
    public B3_17_1_Toadovitri(){
        this.setTitle("Tọa độ nút");
        this.setSize(400, 500);
        JButton s1 = new JButton("1");
        JButton s2 = new JButton("2");
        JButton s3 = new JButton("3");
        JButton s4 = new JButton("4");
        JButton s5 = new JButton("5");
        JButton s6 = new JButton("6");
        JButton s7 = new JButton("7");
        JButton s8 = new JButton("8");
        JButton s9 = new JButton("9");
        JButton s0 = new JButton("0");
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        this.add(s1,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=0;
        this.add(s2,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=0;
        this.add(s3,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        this.add(s4,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=1;
        this.add(s5,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=1;
        this.add(s6,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=2;
        this.add(s7,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=1;
        gbc.gridy=2;
        this.add(s8,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=2;
        gbc.gridy=2;
        this.add(s9,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=3;
        this.add(s0,gbc);
        this.setVisible(true);
    }    
    public static void main (String[] args){
        B3_17_1_Toadovitri b3 = new B3_17_1_Toadovitri();
    }
}
