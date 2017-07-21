
package WUZIchess;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ZYYr
 */
public class StartChessJFrame extends JFrame{
    private JPanel toolbar;
    private JButton btnStart;
    private JButton btnBack;
    private JButton btnExit;
    private JMenuBar menuBar;
    private JMenu sysMenu;
    private JMenuItem startMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuItem backMenuItem;
    
    public StartChessJFrame(){
        setTitle("单机版五子棋");
        menuBar=new JMenuBar();
        sysMenu=new JMenu("系统");
        startMenuItem=new JMenuItem("重新开始");
        exitMenuItem=new JMenuItem("退出");
        backMenuItem=new JMenuItem("悔棋");
        sysMenu.add(startMenuItem);
        sysMenu.add(backMenuItem);
        sysMenu.add(exitMenuItem);
        this.startMenuItem.addActionListener(lis);
        backMenuItem.addActionListener(lis);
        exitMenuItem.addActionListener(lis);
        menuBar.add(sysMenu);
        setJMenuBar(menuBar);
        toolbar=new JPanel();
        btnStart=new JButton("重新开始");
        btnBack=new JButton("悔棋");
        btnExit=new JButton("退出");
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        toolbar.add(btnStart);
        toolbar.add(btnBack);
        toolbar.add(btnExit);
        btnStart.addActionListener(lis);
        btnBack.addActionListener(lis);
        btnExit.addActionListener(lis);
        add(toolbar,BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,650);
        pack();    
    }
    private class MyItemListener implements ActionListener{
     public void actionPerformed(ActionEvent e){
        Object obj=e.getSource();
        if(obj==StartChessJFrame.this.startMenuItem || obj==btnStart){
            System.out.println("重新开始...");
        }else if(obj==exitMenuItem || obj==btnExit){
            System.exit(0);
        }  else if(obj==backMenuItem || obj==btnBack){
            System.out.println("悔棋...");
        }
    }
}
    MyItemListener lis=new MyItemListener();
    public static void main(String[] args){
        StartChessJFrame f=new StartChessJFrame();
        f.setVisible(true);
    }
}

