package game;
/*����һ��˫��̰������Ϸ

*���һ A S D W ���Ʒ���

*��Ҷ� �������� ���Ʒ���

*��ĳ�����·���ߵ�ʱ�����

*/

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class HsGame extends JFrame {

     HsGame(String str) {

         // ���������

         this.setTitle(str);

         this.setSize(910, 630);

         this.setLocation(50, 50);

         MyPanel mp = new MyPanel();

         this.add(mp);

         this.addKeyListener(mp);

         new Thread(mp).start();

     }

     // ���߳�

     public static void main(String[] args) {

         HsGame m = new HsGame("̰���߾�����");

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

     // �����߳�����ʱ��

     int sleep = 50;

     // ���ó�ʼ����

     int fangxiang1 = 2;

     int fangxiang2 = 0;

     // ���캯��

     MyPanel() {

         // ��ʼ������

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 s1[ix][iy] = 0;

                 s2[ix][iy] = 0;

             }

         }

         // ���ñ߽�

         // ���±߽�

         for (int ix = 0; ix < 180; ix++) {

             s1[ix][0] = 1;

             s1[ix][119] = 1;

             s2[ix][0] = 1;

             s2[ix][119] = 1;

         }

         // ���ұ߽�

         for (int iy = 0; iy < 120; iy++) {

             s1[0][iy] = 1;

             s1[179][iy] = 1;

             s2[0][iy] = 1;

             s2[179][iy] = 1;

         }

     }

     // ����

     public void paint(Graphics g) {

         // ��ʾ���һ

         g.setColor(Color.red);

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 if (s1[ix][iy] == 1) {

                     g.fillRect(ix * 5, iy * 5, 5, 5);

                 }

             }

         }

         // ��ʾ��Ҷ�

         g.setColor(Color.blue);

         for (int ix = 0; ix < 180; ix++) {

             for (int iy = 0; iy < 120; iy++) {

                 if (s2[ix][iy] == 1) {

                     g.fillRect(ix * 5, iy * 5, 5, 5);

                 }

             }

         }

         // �����߽�

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

             // �ж�����

             if (s1[x1][y1] == 1 || s2[x1][y1] == 1) {

                 // ����player2ʤ���Ի���

                 JOptionPane.showMessageDialog(null,

                 "player 2 win!",

                 "Game Over !", JOptionPane.ERROR_MESSAGE);

                 // ������Ϸ

                 System.exit(0);

             } else {

                 s1[x1][y1] = 1;

             }

             if (s2[x2][y2] == 1 || s1[x2][y2] == 1) {

                 // ����player1ʤ���Ի���

                 JOptionPane.showMessageDialog(null,

                 "player 1 win!",

                 "Game Over !", JOptionPane.ERROR_MESSAGE);

                 // ������Ϸ

                 System.exit(0);

             } else {

                 s2[x2][y2] = 1;

             }

             try {

                 Thread.sleep(sleep);

             } catch (Exception e) {

                 e.printStackTrace();
             }

             // �ػ�

             this.repaint();

         }

     }

     public void keyTyped(KeyEvent e) {

     }

     public void keyPressed(KeyEvent e) {

         // ���һ����

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

         // ��Ҷ�����

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