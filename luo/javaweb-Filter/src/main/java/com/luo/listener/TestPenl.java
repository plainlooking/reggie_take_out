package com.luo.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPenl {
    public static void main(String[] args) {
        Frame frame = new Frame("一念逍遥");//创建窗体
        Panel panel = new Panel(null);//面板

        frame.setLayout(null);//设置窗体的布局
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255));
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(0,253,0));
        frame.add(panel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("关闭ing");
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("关闭ed");
            }

            public void windowIconified(WindowEvent e) {

            }

            public void windowDeiconified(WindowEvent e) {

            }

            public void windowActivated(WindowEvent e) {
                System.out.println("激活");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });
    }
}
