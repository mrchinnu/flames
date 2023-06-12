package com.company;
import java.lang.String;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Myframe extends JFrame implements ActionListener{
    JButton button = new JButton("F,L,A,M,E,S");
    public static void Main(String args[])
    {
      Myframe m=new Myframe();
    }

     Myframe(){ JFrame frame = new JFrame();

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("Heart2.png");

        label.setOpaque(true);
        label.setBounds(0, 0, 500, 530);
        label.setBackground(Color.pink);
        label.setForeground(Color.white);
        label.setIcon(icon);
        button.setBounds(200, 200, 100, 50);
        button.setFocusable(false);
        button.setBackground(Color.white);
        button.setForeground(Color.red);
        button.addActionListener( this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
        frame.setSize(500, 530);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);



        // write your code here
    }

@Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==button){
         String name = JOptionPane.showInputDialog("what is your name..?");
          String name1 = JOptionPane.showInputDialog("what is your crush's name..?");
              int i,j,l1,l2,p=0,q=0,s;
              char[] arr1= new char[100];
              String f = null;
             l1=name.length();
              l2=name1.length();
              char[] arr= new char[100];
              for(i=0;i<l1;i++)
              {
               arr[i]=name.charAt(i);
              }

              for(j=0;j<l2;j++)
              {


                      arr1[j]=name1.charAt(j);

              }
              for(i=0;i<l1;i++)
              {
                  for(j=0;j<l2;j++)
                  {
                      if(arr[i]==arr1[j])                 {
                          arr[i] ='0';
                        arr[j]='0';
                          break;
                      }
                  }
              }
              for(i=0;i<l1;i++)
              {
                  if(arr[i]!='0')
                  {
                      p++;
                  }
              }
              for(j=0;j<l2;j++)
              {
                  if(arr1[j]!=0)
                  {
                      q++;
                  }
              }
              s=p+q;
              if(s==1||s%6==1){
                  f = "F-friends";
              }
              else if(s==2||s%6==2){
                  f ="L-love";}
              else if(s==3||s%6==3){
                  f ="A-affection"  ;}
              else if(s==4||s%6==4){
                   f="M-marriage";}
              else if(s==5||s%6==5){
                 f ="E-enemy";}
              else if(s%6==0){
               f ="S-sister";}

              String[] k={f};
              String[] h ={"ok,cool!","no!"};
              ImageIcon heart = new ImageIcon("Heart .png");

                      JOptionPane.showOptionDialog(null,"Relation btw you and your crush is"+" "+f,f,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,heart,h,0);


          }
    }
}
