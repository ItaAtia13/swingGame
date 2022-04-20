package com.company;

import javax.swing.*;

public class Background extends JLabel {
    public Background(Bin player, int x, int y,Coin coin){
        this.setSize(x,y);
        this.setBackground(new java.awt.Color(200,210,230));
        this.add(player,coin);
        this.setOpaque(true);
    }
}
