package game;
/*这是一个双人贪吃蛇游戏

*玩家一 A S D W 控制方向

*玩家二 上下左右 控制方向

*当某玩家无路可走的时候既输

*/

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class HsGame extends JFrame {

     HsGame(String str) {

         // 设置主面版

         this.setTitle(str);

         this.setSize(910, 630);

         this.setLocation(50, 50);

         MyPanel mp = new MyPanel();

         this.add(mp);

         this.addKeyListener(mp);

         new Thread(mp).start();

     }

     // 主线程

     public static void main(String[] args) {

         HsGame m = new HsGame("贪吃蛇竞技版");

         m.setVisible(true);

     }

}

class MyPanel extends JPanel implements Runnable, KeyListener {

     int[][] s1 = new int[180][120];

     int[][] s2 = new int[180][120];

     int x1 = 40;

     int y1 = 60;

     int x2 = 140;

     int y2 = 60;

     // 设置线程休眠时间

     int sleep = 50;

     // 设置初始方向

     int fangxiang1 = 2;

     int fangxiang2 = 0;

     // 构造函数

     MyPanel() {

         // 初始化界面

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 s1[ix][iy] = 0;

                 s2[ix][iy] = 0;

             }

         }

         // 设置边界

         // 上下边界

         for (int ix = 0; ix < 180; ix++) {

             s1[ix][0] = 1;

             s1[ix][119] = 1;

             s2[ix][0] = 1;

             s2[ix][119] = 1;

         }

         // 左右边界

         for (int iy = 0; iy < 120; iy++) {

             s1[0][iy] = 1;

             s1[179][iy] = 1;

             s2[0][iy] = 1;

             s2[179][iy] = 1;

         }

     }

     // 画板

     public void paint(Graphics g) {

         // 显示玩家一

         g.setColor(Color.red);

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 if (s1[ix][iy] == 1) {

                     g.fillRect(ix * 5, iy * 5, 5, 5);

                 }

             }

         }

         // 显示玩家二

         g.setColor(Color.blue);

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 if (s2[ix][iy] == 1) {

                     g.fillRect(ix * 5, iy * 5, 5, 5);

                 }

             }

         }

         // 画出边界

         g.setColor(Color.black);

         for (int i = 0; i < 180; i++) {

             g.fillRect(i * 5, 0, 5, 5);

             g.fillRect(i * 5, 119 * 5, 5, 5);

         }

         for (int i = 0; i < 120; i++) {

             g.fillRect(0, i * 5, 5, 5);

             g.fillRect(179 * 5, i * 5, 5, 5);

         }

     }

     public void run() {

         while (true) {

             switch (fangxiang1) {

             case 0:
                 x1--;
                 break;

             case 1:
                 y1--;
                 break;

             case 2:
                 x1++;
                 break;

             case 3:
                 y1++;

             }

             switch (fangxiang2) {

             case 0:
                 x2--;
                 break;

             case 1:
                 y2--;
                 break;

             case 2:
                 x2++;
                 break;

             case 3:
                 y2++;

             }

             // 判断死活

             if (s1[x1][y1] == 1 || s2[x1][y1] == 1) {

                 // 弹出player2胜利对话框

                 JOptionPane.showMessageDialog(null,

                 "player 2 win!",

                 "Game Over !", JOptionPane.ERROR_MESSAGE);

                 // 结束游戏

                 System.exit(0);

             } else {

                 s1[x1][y1] = 1;

             }

             if (s2[x2][y2] == 1 || s1[x2][y2] == 1) {

                 // 弹出player1胜利对话框

                 JOptionPane.showMessageDialog(null,

                 "player 1 win!",

                 "Game Over !", JOptionPane.ERROR_MESSAGE);

                 // 结束游戏

                 System.exit(0);

             } else {

                 s2[x2][y2] = 1;

             }

             try {

                 Thread.sleep(sleep);

             } catch (Exception e) {

                 e.printStackTrace();
             }

             // 重画

             this.repaint();

         }

     }

     public void keyTyped(KeyEvent e) {

     }

     public void keyPressed(KeyEvent e) {

         // 玩家一控制

         if (e.getKeyCode() == 65) {

             if (fangxiang1 != 2) {

                 fangxiang1 = 0;

                 System.out.println("player 1 left");

             }

         }

         if (e.getKeyCode() == 87) {

             if (fangxiang1 != 3) {

                 fangxiang1 = 1;

                 System.out.println("player 1 up");

             }

         }

         if (e.getKeyCode() == 68) {

             if (fangxiang1 != 0) {

                 fangxiang1 = 2;

                 System.out.println("player 1 right");

             }

         }

         if (e.getKeyCode() == 83) {

             if (fangxiang1 != 1) {

                 fangxiang1 = 3;

                 System.out.println("player 1 down");

             }

         }

         // 玩家二控制

         if (e.getKeyCode() == 37) {

             if (fangxiang2 != 2) {

                 fangxiang2 = 0;

                 System.out.println("player 2 left");

             }

         }

         if (e.getKeyCode() == 38) {

             if (fangxiang2 != 3) {

                 fangxiang2 = 1;

                 System.out.println("player 2 up");

             }

         }

         if (e.getKeyCode() == 39) {

             if (fangxiang2 != 0) {

                 fangxiang2 = 2;

                 System.out.println("player 2 right");

             }

         }

         if (e.getKeyCode() == 40) {

             if (fangxiang2 != 1) {

                 fangxiang2 = 3;

                 System.out.println("player 2 down");

             }

         }

     }

     public void keyReleased(KeyEvent e) {

     }

}