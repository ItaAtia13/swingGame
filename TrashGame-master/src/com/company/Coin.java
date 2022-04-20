package com.company;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coin extends JLabel {

    private ImageIcon coin;
    private int value;
    //todo:not sure about speed field
    private int speed;
    public Coin(int x,int y,int width,int height,ImageIcon coin,int value,int speed) {
        this.setBounds(x,y,width,height);
        this.coin = coin;
        this.value=value;
        this.speed=speed;
        this.setOpaque(true);
    }

}

