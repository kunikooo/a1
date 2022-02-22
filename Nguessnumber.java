package Nguessnumber;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Nguessnumber extends JFrame{
    private JTextField txtGuess;  
    private JTextField txtGuess2;  
    private JTextField txtGuess3; 
    private JTextField txtGuess4;  
    private JLabel lblOutput;  
    private JLabel lblOutput2;  
    private JLabel lblOutput3;  
    private JLabel lblOutput4; 
    private JButton btnPlayAgain; 
    private int ra;
    private int ra2;
    private int ra3;
    private int ra4;
   
    public void getra() {
        this.ra =(int)(Math.random()*10)+1;
        this.ra2 =(int)(Math.random()*10)+1;
        this.ra3 =(int)(Math.random()*10)+1;
        this.ra4 =(int)(Math.random()*10)+1;
    }
    public void getra2() {
        this.ra2 =(int)(Math.random()*10)+1;
    }
    public void getra3() {
        this.ra3 =(int)(Math.random()*10)+1;
    }
    public void getra4() {
        this.ra4 =(int)(Math.random()*10)+1;
    }
  
    public void panduan() {
        int nowra1 = ra;
        String txt = txtGuess.getText();
        int txtint = Integer.parseInt(txt);
        if (nowra1 > txtint) {
            lblOutput.setText(txtint + "小了，重新输入");
        } else if (nowra1 < txtint) {
            lblOutput.setText(txtint + "大了，重新输入");
        } else if (nowra1 == txtint) {
            lblOutput.setText("猜对了第2个!");
        }
        int nowra2 = ra2;
        String txu = txtGuess2.getText();
        int txuint = Integer.parseInt(txu);
        if (nowra2 > txuint) {
            lblOutput2.setText(txuint + "小了，重新输入");
        } else if (nowra2 < txuint) {
            lblOutput2.setText(txuint + "大了，重新输入");
        } else if (nowra2 == txuint) {
            lblOutput2.setText("猜对了第2个!");
        }
        int nowra3 = ra3;
        String txi = txtGuess3.getText();
        int txiint = Integer.parseInt(txi);
        if (nowra3 > txiint) {
            lblOutput3.setText(txtint + "小了，重新输入");
        } else if (nowra3 < txiint) {
            lblOutput3.setText(txiint + "大了，重新输入");
        } else if (nowra3 == txiint) {
            lblOutput3.setText("猜对了第3个!!");
        }
        int nowra4 = ra4;
        String txo = txtGuess4.getText();
        int txoint = Integer.parseInt(txo);
        if (nowra4 > txoint) {
            lblOutput4.setText(txoint + "小了，重新输入");
        } else if (nowra4 < txoint) {
            lblOutput4.setText(txoint + "大了，重新输入");
        } else if (nowra4 == txoint) {
            lblOutput4.setText("猜对了第4个!\"");
        }
        if (nowra4 == txoint && nowra3 == txiint && nowra2 == txuint && nowra1 == txtint) {
        	 lblOutput.setText("都猜对了，你太棒了！");
             lblOutput2.setText("都猜对了，你太棒了！");
             lblOutput3.setText("都猜对了，你太棒了！");
             lblOutput4.setText("都猜对了，你太棒了！");
            btnPlayAgain.setVisible(true);

        }
    }


    public Nguessnumber() {
        this.getra(); 

        setTitle("Java猜数字游戏");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Java猜数字游戏");
        lblNewLabel.setFont(new Font("宋体", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(159, 27, 116, 18);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("请输入4个1~100之间的数字");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setBounds(26, 72, 213, 15);
        getContentPane().add(lblNewLabel_1);

        txtGuess = new JTextField();
        txtGuess.setBounds(250, 69, 66, 21);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);
        txtGuess2 = new JTextField();
        txtGuess2.setBounds(250, 89, 66, 21);
        getContentPane().add(txtGuess2);
        txtGuess2.setColumns(10);
        txtGuess3 = new JTextField();
        txtGuess3.setBounds(250, 109, 66, 21);
        getContentPane().add(txtGuess3);
        txtGuess3.setColumns(10);
        txtGuess4 = new JTextField();
        txtGuess4.setBounds(250, 129, 66, 21);
        getContentPane().add(txtGuess4);
        txtGuess4.setColumns(10);

        JButton btnNewButton = new JButton("猜一下");
        btnNewButton.setBounds(150, 114, 93, 23);
        getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panduan();
            }
        });


        lblOutput = new JLabel("请在输入框内输入数字并点击猜一下");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(51, 214, 331, 15);
        getContentPane().add(lblOutput);
        lblOutput2 = new JLabel("请在输入框内输入数字并点击猜一下");
        lblOutput2.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput2.setBounds(51, 234, 331, 15);
        getContentPane().add(lblOutput2);
        lblOutput3 = new JLabel("请在输入框内输入数字并点击猜一下");
        lblOutput3.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput3.setBounds(51, 254, 331, 15);
        getContentPane().add(lblOutput3);
        lblOutput4 = new JLabel("请在输入框内输入数字并点击猜一下");
        lblOutput4.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput4.setBounds(51, 274, 331, 15);
        getContentPane().add(lblOutput4);


        btnPlayAgain = new JButton("再玩一次");
        btnPlayAgain.setBounds(164, 164, 105, 23);
        btnPlayAgain.setVisible(false);
        getContentPane().add(btnPlayAgain);

    }
    public static void main(String args[]) {
        Nguessnumber theGame = new Nguessnumber();
        theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
    }
}