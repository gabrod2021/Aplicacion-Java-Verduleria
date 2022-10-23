import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Apertura extends JFrame implements ActionListener{

private JLabel label1, label2, label3;
private JButton boton1;
public static String texto = "";


public Apertura(){

setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("GS");
  getContentPane().setBackground(new Color(255,255,255));
  setIconImage(new ImageIcon(getClass().getResource("images/iconfruta.png")).getImage());

label1 =new JLabel("GreenSoft");
label1.setBounds(110,40,300,60);
label1.setFont(new Font("Colona MT", 3, 40));
label1.setForeground(new Color(80,150,80));
add(label1);

ImageIcon imagen = new ImageIcon("PROYECTO1/images/iconfruta.png");
label2 =new JLabel(imagen);
label2.setBounds(30,90,412,333);
add(label2);

boton1= new JButton("Ingresar");
boton1.setBounds(170,432,100,20);
boton1.setFont(new Font("Colona MT",1,15));
boton1.setBackground(new Color(80,150,80));
boton1.setForeground(new Color(255,255,255));
boton1.addActionListener(this);
add(boton1);

label3 =new JLabel("2020 GreenSoft Limited Company");
label3.setBounds(120,485,300,30);
label3.setFont(new Font("Colona MT", 2, 12));
label3.setForeground(new Color(0,0,0));
add(label3);
}

public void actionPerformed(ActionEvent e){
if(e.getSource() ==boton1){
Licencia ventanalicencia = new Licencia();
ventanalicencia.setBounds(0,0,600,360);
ventanalicencia.setVisible(true);
ventanalicencia.setResizable(false);
ventanalicencia.setLocationRelativeTo(null);
 this.setVisible(false);
}

}

public static void main(String args[]){
 Apertura aper= new Apertura();
 aper.setBounds(0,0,450,550);
 aper.setVisible(true);
 aper.setResizable(false);
 aper.setLocationRelativeTo(null);
 } 

}