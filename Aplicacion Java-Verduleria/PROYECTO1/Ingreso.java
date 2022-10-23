import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Ingreso extends JFrame implements ActionListener{

private JMenuBar menu;
private JMenu menuOpcion;
private JMenuItem nuevo, salir;
private JTextField textfield1,textfield2,textfield3;
private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
private JButton boton1;
private JComboBox combo1;
public static String texto = "";


public Ingreso(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Bienvenidos");
getContentPane().setBackground(new Color(255,255,255));
setIconImage(new ImageIcon(getClass().getResource("images/iconfruta.png")).getImage());

menu = new JMenuBar();
menu.setBackground(new Color(255,104,29));
setJMenuBar(menu);

menuOpcion = new JMenu("Opciones");
menuOpcion.setBackground(new Color(0,0,0));
menuOpcion.setFont(new Font("Andale Mono",1,14));
menuOpcion.setForeground(new Color(255,255,255));
menu.add(menuOpcion);

nuevo = new JMenu("Nuevo");
nuevo.setFont(new Font("Andale Mono",1,14));
nuevo.setForeground(new Color(0,0,0));
menuOpcion.add(nuevo);
nuevo.addActionListener(this);

salir = new JMenuItem("Salir");
salir.setFont(new Font("Andale Mono",1,14));
salir.setForeground(new Color(0,0,0));
menuOpcion.add(salir);
salir.addActionListener(this);


label1 =new JLabel("Bienvenidos a ...");
label1.setBounds(20,50,300,30);
label1.setFont(new Font("Andale Mono", 3, 40));
label1.setForeground(new Color(80,150,80));
add(label1);

ImageIcon imagen = new ImageIcon("PROYECTO1/images/imaverdu.png");
label2 = new JLabel(imagen);
label2.setBounds(300,0,300,300);
add(label2);

label3 =new JLabel(" Por favor, completa tus datos: ");
label3.setBounds(20,110,600,40);
label3.setFont(new Font("Andale Mono", 1, 20));
label3.setForeground(new Color(0,0,0));
add(label3);

label4 =new JLabel("Nombre y Apellido: ");
label4.setBounds(20,150,200,40);
label4.setFont(new Font("Andale Mono", 1, 20));
label4.setForeground(new Color(80,150,80));
add(label4);

textfield1=new JTextField("");
textfield1.setBounds(20,190,300,30);
textfield1.setBackground(new Color(238,139,8));
textfield1.setFont(new Font("Andale Mono", 1,15));
textfield1.setForeground(new Color(255,255,255));
add(textfield1);

label5 =new JLabel("Direccion: ");
label5.setBounds(20,250,200,40);
label5.setFont(new Font("Andale Mono", 1, 20));
label5.setForeground(new Color(80,150,80));
add(label5);

textfield2=new JTextField("");
textfield2.setBounds(20,290,300,30);
textfield2.setBackground(new Color(238,139,8));
textfield2.setFont(new Font("Andale Mono", 1,15));
textfield2.setForeground(new Color(255,255,255));
add(textfield2);

label6 =new JLabel("Telefono: ");
label6.setBounds(20,350,200,40);
label6.setFont(new Font("Andale Mono", 1, 20));
label6.setForeground(new Color(80,150,80));
add(label6);

textfield3=new JTextField("");
textfield3.setBounds(20,390,300,30);
textfield3.setBackground(new Color(238,139,8));
textfield3.setFont(new Font("Andale Mono", 1,15));
textfield3.setForeground(new Color(255,255,255));
add(textfield3);

label7 =new JLabel("Elegir rango horario de entrega: ");
label7.setBounds(20,450,600,40);
label7.setFont(new Font("Andale Mono", 1, 20));
label7.setForeground(new Color(0,0,0));
add(label7);

combo1= new JComboBox();
combo1.setBounds(20,490,300,30);
combo1.setBackground(new java.awt.Color(238,139,8));
combo1.setFont(new Font("Andale Mono",1,14));
combo1.setForeground(new Color(255,255,255));
add(combo1);
combo1.addItem("");
combo1.addItem("9:00hs a 12:00hs");
combo1.addItem("12:00hs a 16:00hs");
combo1.addItem("16:00hs a 20:00hs");

boton1 = new JButton("Ingresar");
boton1.setBounds(450,600,120,30);
boton1.setBackground(new Color(80,150,80));
boton1.setFont(new Font("Andale Mono", 1, 14));
boton1.setForeground(new Color(0,0,0));
boton1.addActionListener(this);
add(boton1);

}

public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1) {

           String nombreCli= textfield1.getText();
           String Direccion =  textfield2.getText();
           String Telefono = textfield3.getText();
           String Horario = combo1.getSelectedItem().toString();
           
           if( nombreCli.equals("") || Direccion.equals("") || Telefono.equals("") || 
           Horario.equals("")){

           JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");
  }else{
texto = textfield1.getText().trim();

Calcula compras = new Calcula();
compras.setBounds(0,0,800,700);
compras.setVisible(true);
compras.setResizable(false);
compras.setLocationRelativeTo(null);
this.setVisible(false);
   }
  }
}

public static void main(String args[]){
Ingreso ingreventana= new Ingreso();
 ingreventana.setBounds(0,0,600,700);
 ingreventana.setVisible(true);
 ingreventana.setResizable(false);
 ingreventana.setLocationRelativeTo(null);
  }
}

