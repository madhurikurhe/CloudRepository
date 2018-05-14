package com.techlabs.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void makeframe() {
		JButton b1 = new JButton("1");
		b1.setBounds(100, 100, 100, 100);
		add(b1);
		b1.addActionListener(this);
		
		JButton b2 = new JButton("2");
		b2.setBounds(200, 100, 100, 100);
		add(b2);
		b2.addActionListener(this);
		
		JButton b3 = new JButton("3");
		b3.setBounds(300, 100, 100, 100);
		add(b3);
		b3.addActionListener(this);
		
		JButton b4 = new JButton("4");
		b4.setBounds(100, 200, 100, 100);
		add(b4);
		b4.addActionListener(this);
		
		JButton b5 = new JButton("5");
		b5.setBounds(200, 200, 100, 100);
		add(b5);
		b5.addActionListener(this);
		
		JButton b6 = new JButton("6");
		b6.setBounds(300, 200, 100, 100);
		add(b6);
		b6.addActionListener(this);
		
		JButton b7 = new JButton("7");
		b7.setBounds(100, 300, 100, 100);
		add(b7);
		b7.addActionListener(this);
		
		JButton b8 = new JButton("8");
		b8.setBounds(200, 300, 100, 100);
		add(b8);
		b8.addActionListener(this);
		
		JButton b9 = new JButton("9");
		b9.setBounds(300, 300, 100, 100);
		add(b9);
		b9.addActionListener(this);
		
		setSize(600,600);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==this)
			{
				
			}
	}

}
