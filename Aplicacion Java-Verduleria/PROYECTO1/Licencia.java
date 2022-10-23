import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

private JButton boton1,boton2;
private JLabel label1, label2;
private JCheckBox check1;
private JTextArea textarea1;
private JScrollPane scrollpane1;
String nombre = "";

public Licencia(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Licencia de uso");
getContentPane().setBackground(new Color(255,255,255));
setIconImage(new ImageIcon(getClass().getResource("images/iconfruta.png")).getImage());

label1 = new JLabel("TERMINOS Y CONDICIONES" );
label1.setBounds(215,5,200,30);
label1.setFont(new Font("Andale Mono", 1, 14));
label1.setForeground(new Color(0,0,0));
add(label1);

textarea1= new JTextArea();
textarea1.setEditable(false);
textarea1.setBackground(new Color(208,236,204));
textarea1.setFont(new Font("Andale Mono", 0, 9));
textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                               "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN LA AUTORIZACION RESPECTIVA." +                              
                               "\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISE�O DE LAS INTERFACES GRAFICAS."+
                               "\n          C. EL AUTOR NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                               "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE," +
                               "\n          EL AUTOR NO SE RESPONSABILIZA DEL USO QUE USTED HAGA DEL SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR" +
                               "\n          PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO). SI USTED NO ACEPTA LOS MISMOS, HAGA CLICK EN" +
                               "\n          (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.") ;    
              
scrollpane1 = new JScrollPane(textarea1);
scrollpane1.setBounds(10,40,575,200);
add(scrollpane1);

check1 = new JCheckBox(" Acepto");
check1.setBounds(10,250,80,30);
check1.setBackground(new Color(208,236,204));
check1.addChangeListener(this);
add(check1);

boton1 = new JButton("Continuar");
boton1.setBounds(10,290,100,30);
boton1.addActionListener(this);
boton1.setEnabled(false);
add(boton1);

boton2 = new JButton("No Acepto");
boton2.setBounds(120,290,100,30);
boton2.addActionListener(this);
boton2.setEnabled(true);
add(boton2);

ImageIcon imagen = new ImageIcon("PROYECTO1/images/marca.png");
label2 = new JLabel(imagen);
label2.setBounds(315,220,250,150);
add(label2);
}

public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
   }else{
      boton1.setEnabled(false);
      boton2.setEnabled(true);
  }
}

public void actionPerformed(ActionEvent e){
 if(e.getSource()== boton1){
  Ingreso ingreventana= new Ingreso();
 ingreventana.setBounds(0,0,600,700);
 ingreventana.setVisible(true);
 ingreventana.setResizable(false);
 ingreventana.setLocationRelativeTo(null);
 this.setVisible(false);     
 }else if(e.getSource()== boton2){
 Apertura aper= new Apertura();
 aper.setBounds(0,0,450,550);
 aper.setVisible(true);
 aper.setResizable(false);
 aper.setLocationRelativeTo(null);
 this.setVisible(false);     
 }
}
public static void main(String args[]){
Licencia ventanalicencia = new Licencia();
ventanalicencia.setBounds(0,0,600,360);
ventanalicencia.setVisible(true);
ventanalicencia.setResizable(false);
ventanalicencia.setLocationRelativeTo(null);
  }
}