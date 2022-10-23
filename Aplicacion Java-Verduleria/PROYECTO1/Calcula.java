import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import java.net.URI;

public class Calcula extends JFrame implements ActionListener, ChangeListener{

private JMenuBar menu;
private JMenu menuOpcion;
private JMenuItem creadora,salir, Instagram,Direccion;
private JLabel labelmensaje, labelarticulospeso,labelarticuloscant,labelpreciok,labelpeso,labelcant, labelpreciocant, labelTotal,labelImagen,labelTotal1,labelTotalTotal, labelImagenTotal,labelContacto,labelFace,labelInstagram;
private JCheckBox check1kilo, check2kilo,check3kilo,check4kilo,check5kilo, check6kilo,check7kilo, check8kilo,check9kilo,check10kilo,check11kilo,check12kilo,check13kilo,check1uni,check2uni,
check3uni,check4uni,check5uni,check6uni,check7uni,check8uni,check9uni,check10uni,
check11uni,check12uni,check13uni;
private JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6,textfield7,textfield8,textfield9,textfield10,textfield11,textfield12,textfield13,textfield14,textfield15,textfield16,textfield17,textfield18,textfield19,textfield20,textfield21,textfield22,textfield23,textfield24,textfield25,
textfield26;
private JButton  botonUnicompras, botonPesoCompras,botonTotal;
private JComboBox comboPeso1, comboPeso2, comboPeso3, comboPeso4,comboPeso5,comboPeso6,comboPeso7,comboPeso8,comboPeso9,comboPeso10,comboPeso11,comboPeso12,comboPeso13,comboCant1,comboCant2,comboCant3,comboCant4,comboCant5,comboCant6,comboCant7,comboCant8,comboCant9,comboCant10,comboCant11,comboCant12,comboCant13;
int kilo=0, kilo1=0, kilo2=0,kilo3=0,kilo4 =0, kilo5=0, kilo6=0, kilo7=0, kilo8=0 ,kilo9=0 ,kilo10=0 ,kilo11=0, kilo12=0,kilo13=0,kilo14=0,kilo15=0,kilo16=0,kilo17=0,kilo18=0,kilo19=0,kilo20=0,kilo21=0,kilo22=0,kilo23=0,kilo24=0,kilo25=0;
int valor1= 0 , valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0,valor6 = 0,valor7 = 0,valor8 = 0,valor9 = 0, valor10 = 0, valor11 = 0, valor12 = 0, valor13 = 0, valor14 = 0,valor15= 0 , valor16 = 0, valor17 = 0, valor18 = 0, valor19 = 0,valor20 = 0,valor21 = 0,valor22 = 0,valor23 = 0, valor24 = 0, valor25 = 0, valor26 = 0;
int subtotal1 = 0, subtotal2 = 0, subtotal3 = 0, subtotal4 = 0,subtotal5 = 0,subtotal6 = 0,subtotal7 = 0,subtotal8 = 0,subtotal9 = 0,subtotal10 = 0, subtotal11=0,subtotal12=0,subtotal13=0,subtotal14, subtotal15,subtotal16, subtotal17, subtotal18, subtotal19, subtotal20,subtotal21, subtotal22, subtotal23, subtotal24, subtotal25, subtotal26;
int resulTotal = 0 , resulTotal1= 0;
int resulTotalTotal = 0;
String nombreCliente="";

public Calcula(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Pedidos");
getContentPane().setBackground(new Color(255,255,255));
setIconImage(new ImageIcon(getClass().getResource("/images/iconfruta.png")).getImage());
Ingreso ingreventana = new Ingreso();
nombreCliente= ingreventana.texto;


menu = new JMenuBar();
menu.setBackground(new Color(255,104,29));
setJMenuBar(menu);

menuOpcion = new JMenu("Opciones");
menuOpcion.setBackground(new Color(0,0,0));
menuOpcion.setFont(new Font("Andale Mono",1,14));
menuOpcion.setForeground(new Color(255,255,255));
menu.add(menuOpcion);


creadora = new JMenuItem("La Creadora");
creadora.setFont(new Font("Andale Mono",1,14));
creadora.setForeground(new Color(0,0,0));
menuOpcion.add(creadora);
creadora.addActionListener(this);

salir = new JMenuItem("Salir");
salir.setFont(new Font("Andale Mono",1,14));
salir.setForeground(new Color(0,0,0));
menuOpcion.add(salir);
salir.addActionListener(this);

labelmensaje= new JLabel( nombreCliente +" ,ya podes estimar el importe de tu compra!");
labelmensaje.setFont(new Font("Andale Mono",1,18));
labelmensaje.setBounds(150,10,700,20);
labelmensaje.setForeground(new Color(0,0,0));
add(labelmensaje);

labelarticulospeso= new JLabel("POR PESO");
labelarticulospeso.setFont(new Font("Andale Mono",1,14));
labelarticulospeso.setBounds(10,40,200,20);
labelarticulospeso.setForeground(new Color(0,0,0));
add(labelarticulospeso);

labelpreciok=new JLabel("PRECIO");
labelpreciok.setFont(new Font("Andale Mono",1,14));
labelpreciok.setBounds(120,40,150,20);
labelpreciok.setForeground(new Color(0,0,0));
add(labelpreciok);

labelpeso=new JLabel("KILOS");
labelpeso.setFont(new Font("Andale Mono",1,14));
labelpeso.setBounds(210,40,150,20);
labelpeso.setForeground(new Color(0,0,0));
add(labelpeso);

ImageIcon imagen = new ImageIcon("PROYECTO1/images/imaverdu.png");
labelImagen = new JLabel(imagen);
labelImagen.setBounds(275,130,230,230);
add(labelImagen);

labelarticuloscant= new JLabel("POR UNIDAD");
labelarticuloscant.setFont(new Font("Andale Mono",1,14));
labelarticuloscant.setBounds(520,40,200,20);
labelarticuloscant.setForeground(new Color(0,0,0));
add(labelarticuloscant);

labelpreciocant=new JLabel("PRECIO");
labelpreciocant.setFont(new Font("Andale Mono",1,14));
labelpreciocant.setBounds(630,40,150,20);
labelpreciocant.setForeground(new Color(0,0,0));
add(labelpreciocant);

labelcant=new JLabel("CANTIDAD");
labelcant.setFont(new Font("Andale Mono",1,14));
labelcant.setBounds(710,40,150,20);
labelcant.setForeground(new Color(0,0,0));
add(labelcant);

labelContacto= new JLabel("Pedidos al: 11-3890-1830");
labelContacto.setFont(new Font("Andale Mono",1,14));
labelContacto.setBounds(10,600,250,20);
labelContacto.setForeground(new Color(0,0,0));
add(labelContacto);

labelContacto= new JLabel("");
labelContacto.setFont(new Font("Andale Mono",1,14));
labelContacto.setBounds(10,620,500,20);
labelContacto.setForeground(new Color(50,100,255));
add(labelContacto);




labelContacto= new JLabel("https://twitter.com/");
labelContacto.setFont(new Font("Andale Mono",1,14));
labelContacto.setBounds(10,640,500,20);
labelContacto.setForeground(new Color(50,100,255));
add(labelContacto);


check1kilo = new JCheckBox("Papa");
check1kilo.setBounds(10,70,100,20);
check1kilo.setForeground(new Color(0,0,0));
check1kilo.setBackground(new Color(180,240,20));
add(check1kilo);
check1kilo.addChangeListener(this);

textfield1 = new JTextField("");
textfield1.setBounds(120,70,70,20);
textfield1.setFont(new Font("Andale Mono",1,14));
textfield1.setForeground(new Color(255,255,255));
textfield1.setBackground(new Color(0,0,0));
add(textfield1);

comboPeso1 = new JComboBox();
comboPeso1.setBounds(210,70,50,20);
for(int i = 0; i <=20; i++){
comboPeso1.addItem(String.valueOf(i));
   }
add(comboPeso1);

check2kilo = new JCheckBox("Batata");
check2kilo.setBounds(10,100,100,20);
check2kilo.setForeground(new Color(0,0,0));
check2kilo.setBackground(new Color(180,240,20));
add(check2kilo);
check2kilo.addChangeListener(this);

textfield2 = new JTextField("");
textfield2.setBounds(120,100,70,20);
textfield2.setFont(new Font("Andale Mono",1,14));
textfield2.setForeground(new Color(255,255,255));
textfield2.setBackground(new Color(0,0,0));
add(textfield2);

comboPeso2 = new JComboBox();
comboPeso2.setBounds(210,100,50,20);
for(int i = 0; i <=20; i++){
comboPeso2.addItem(String.valueOf(i));
   }
add(comboPeso2);


check3kilo = new JCheckBox("Cebolla");
check3kilo.setBounds(10,130,100,20);
check3kilo.setForeground(new Color(0,0,0));
check3kilo.setBackground(new Color(180,240,20));
add(check3kilo);
check3kilo.addChangeListener(this);

textfield3 = new JTextField("");
textfield3.setBounds(120,130,70,20);
textfield3.setFont(new Font("Andale Mono",1,14));
textfield3.setForeground(new Color(255,255,255));
textfield3.setBackground(new Color(0,0,0));
add(textfield3);

comboPeso3 = new JComboBox();
comboPeso3.setBounds(210,130,50,20);
for(int i = 0; i <=20; i++){
comboPeso3.addItem(String.valueOf(i));
   }
add(comboPeso3);

check4kilo = new JCheckBox("Zanahoria");
check4kilo.setBounds(10,160,100,20);
check4kilo.setForeground(new Color(0,0,0));
check4kilo.setBackground(new Color(180,240,20));
add(check4kilo);
check4kilo.addChangeListener(this);

textfield4 = new JTextField("");
textfield4.setBounds(120,160,70,20);
textfield4.setFont(new Font("Andale Mono",1,14));
textfield4.setForeground(new Color(255,255,255));
textfield4.setBackground(new Color(0,0,0));
add(textfield4);

comboPeso4 = new JComboBox();
comboPeso4.setBounds(210,160,50,20);
for(int i = 0; i <=20; i++){
comboPeso4.addItem(String.valueOf(i));
   }
add(comboPeso4);

check5kilo = new JCheckBox("Mandioca");
check5kilo.setBounds(10,190,100,20);
check5kilo.setForeground(new Color(0,0,0));
check5kilo.setBackground(new Color(180,240,20));
add(check5kilo);
check5kilo.addChangeListener(this);

textfield5 = new JTextField("");
textfield5.setBounds(120,190,70,20);
textfield5.setFont(new Font("Andale Mono",1,14));
textfield5.setForeground(new Color(255,255,255));
textfield5.setBackground(new Color(0,0,0));
add(textfield5);

comboPeso5 = new JComboBox();
comboPeso5.setBounds(210,190,50,20);
for(int i = 0; i <=20; i++){
comboPeso5.addItem(String.valueOf(i));
   }
add(comboPeso5);

check6kilo = new JCheckBox("Anco");
check6kilo.setBounds(10,220,100,20);
check6kilo.setForeground(new Color(0,0,0));
check6kilo.setBackground(new Color(180,240,20));
add(check6kilo);
check6kilo.addChangeListener(this);

textfield6 = new JTextField("");
textfield6.setBounds(120,220,70,20);
textfield6.setFont(new Font("Andale Mono",1,14));
textfield6.setForeground(new Color(255,255,255));
textfield6.setBackground(new Color(0,0,0));
add(textfield6);

comboPeso6 = new JComboBox();
comboPeso6.setBounds(210,220,50,20);
for(int i = 0; i <=20; i++){
comboPeso6.addItem(String.valueOf(i));
   }
add(comboPeso6);

check7kilo = new JCheckBox("Cabutia");
check7kilo.setBounds(10,250,100,20);
check7kilo.setForeground(new Color(0,0,0));
check7kilo.setBackground(new Color(180,240,20));
add(check7kilo);
check7kilo.addChangeListener(this);

textfield7 = new JTextField("");
textfield7.setBounds(120,250,70,20);
textfield7.setFont(new Font("Andale Mono",1,14));
textfield7.setForeground(new Color(255,255,255));
textfield7.setBackground(new Color(0,0,0));
add(textfield7);

comboPeso7 = new JComboBox();
comboPeso7.setBounds(210,250,50,20);
for(int i = 0; i <=20; i++){
comboPeso7.addItem(String.valueOf(i));
   }
add(comboPeso7);

check8kilo = new JCheckBox("Morron");
check8kilo.setBounds(10,280,100,20);
check8kilo.setForeground(new Color(0,0,0));
check8kilo.setBackground(new Color(180,240,20));
add(check8kilo);
check8kilo.addChangeListener(this);

textfield8 = new JTextField("");
textfield8.setBounds(120,280,70,20);
textfield8.setFont(new Font("Andale Mono",1,14));
textfield8.setForeground(new Color(255,255,255));
textfield8.setBackground(new Color(0,0,0));
add(textfield8);

comboPeso8 = new JComboBox();
comboPeso8.setBounds(210,280,50,20);
for(int i = 0; i <=20; i++){
comboPeso8.addItem(String.valueOf(i));
   }
add(comboPeso8);

check9kilo = new JCheckBox("Tomate");
check9kilo.setBounds(10,310,100,20);
check9kilo.setForeground(new Color(0,0,0));
check9kilo.setBackground(new Color(180,240,20));
add(check9kilo);
check9kilo.addChangeListener(this);

textfield9 = new JTextField("");
textfield9.setBounds(120,310,70,20);
textfield9.setFont(new Font("Andale Mono",1,14));
textfield9.setForeground(new Color(255,255,255));
textfield9.setBackground(new Color(0,0,0));
add(textfield9);

comboPeso9 = new JComboBox();
comboPeso9.setBounds(210,310,50,20);
for(int i = 0; i <=20; i++){
comboPeso9.addItem(String.valueOf(i));
   }
add(comboPeso9);

check10kilo = new JCheckBox("Berenjena");
check10kilo.setBounds(10,340,100,20);
check10kilo.setForeground(new Color(0,0,0));
check10kilo.setBackground(new Color(180,240,20));
add(check10kilo);
check10kilo.addChangeListener(this);

textfield10 = new JTextField("");
textfield10.setBounds(120,340,70,20);
textfield10.setFont(new Font("Andale Mono",1,14));
textfield10.setForeground(new Color(255,255,255));
textfield10.setBackground(new Color(0,0,0));
add(textfield10);

comboPeso10 = new JComboBox();
comboPeso10.setBounds(210,340,50,20);
for(int i = 0; i <=20; i++){
comboPeso10.addItem(String.valueOf(i));
   }
add(comboPeso10);

check11kilo = new JCheckBox("Zapallito");
check11kilo.setBounds(10,370,100,20);
check11kilo.setForeground(new Color(0,0,0));
check11kilo.setBackground(new Color(180,240,20));
add(check11kilo);
check11kilo.addChangeListener(this);

textfield11 = new JTextField("");
textfield11.setBounds(120,370,70,20);
textfield11.setFont(new Font("Andale Mono",1,14));
textfield11.setForeground(new Color(255,255,255));
textfield11.setBackground(new Color(0,0,0));
add(textfield11);

comboPeso11 = new JComboBox();
comboPeso11.setBounds(210,370,50,20);
for(int i = 0; i <=20; i++){
comboPeso11.addItem(String.valueOf(i));
   }
add(comboPeso11);

check12kilo = new JCheckBox("Chaucha");
check12kilo.setBounds(10,400,100,20);
check12kilo.setForeground(new Color(0,0,0));
check12kilo.setBackground(new Color(180,240,20));
add(check12kilo);
check12kilo.addChangeListener(this);

textfield12 = new JTextField("");
textfield12.setBounds(120,400,70,20);
textfield12.setFont(new Font("Andale Mono",1,14));
textfield12.setForeground(new Color(255,255,255));
textfield12.setBackground(new Color(0,0,0));
add(textfield12);

comboPeso12 = new JComboBox();
comboPeso12.setBounds(210,400,50,20);
for(int i = 0; i <=20; i++){
comboPeso12.addItem(String.valueOf(i));
   }
add(comboPeso12);

check13kilo = new JCheckBox("Lechuga");
check13kilo.setBounds(10,430,100,20);
check13kilo.setForeground(new Color(0,0,0));
check13kilo.setBackground(new Color(180,240,20));
add(check13kilo);
check13kilo.addChangeListener(this);

textfield13 = new JTextField("");
textfield13.setBounds(120,430,70,20);
textfield13.setFont(new Font("Andale Mono",1,14));
textfield13.setForeground(new Color(255,255,255));
textfield13.setBackground(new Color(0,0,0));
add(textfield13);

comboPeso13 = new JComboBox();
comboPeso13.setBounds(210,430,50,20);
for(int i = 0; i <=20; i++){
comboPeso13.addItem(String.valueOf(i));
   }
add(comboPeso13);

check1uni = new JCheckBox("Brocoli");
check1uni.setBounds(520,70,100,20);
check1uni.setForeground(new Color(0,0,0));
check1uni.setBackground(new Color(180,240,20));
add(check1uni);
check1uni.addChangeListener(this);

textfield14 = new JTextField("");
textfield14.setBounds(630,70,70,20);
textfield14.setFont(new Font("Andale Mono",1,14));
textfield14.setForeground(new Color(255,255,255));
textfield14.setBackground(new Color(0,0,0));
add(textfield14);

comboCant1 = new JComboBox();
comboCant1.setBounds(720,70,50,20);
for(int i = 0; i <=20; i++){
comboCant1.addItem(String.valueOf(i));
   }
add(comboCant1);

check2uni = new JCheckBox("Alcaucil");
check2uni.setBounds(520,100,100,20);
check2uni.setForeground(new Color(0,0,0));
check2uni.setBackground(new Color(180,240,20));
add(check2uni);
check2uni.addChangeListener(this);

textfield15 = new JTextField("");
textfield15.setBounds(630,100,70,20);
textfield15.setFont(new Font("Andale Mono",1,14));
textfield15.setForeground(new Color(255,255,255));
textfield15.setBackground(new Color(0,0,0));
add(textfield15);

comboCant2 = new JComboBox();
comboCant2.setBounds(720,100,50,20);
for(int i = 0; i <=20; i++){
comboCant2.addItem(String.valueOf(i));
   }
add(comboCant2);

check3uni = new JCheckBox("Coliflor");
check3uni.setBounds(520,130,100,20);
check3uni.setForeground(new Color(0,0,0));
check3uni.setBackground(new Color(180,240,20));
add(check3uni);
check3uni.addChangeListener(this);

textfield16 = new JTextField("");
textfield16.setBounds(630,130,70,20);
textfield16.setFont(new Font("Andale Mono",1,14));
textfield16.setForeground(new Color(255,255,255));
textfield16.setBackground(new Color(0,0,0));
add(textfield16);

comboCant3 = new JComboBox();
comboCant3.setBounds(720,130,50,20);
for(int i = 0; i <=20; i++){
comboCant3.addItem(String.valueOf(i));
   }
add(comboCant3);

check4uni = new JCheckBox("Champignon");
check4uni.setBounds(520,160,100,20);
check4uni.setForeground(new Color(0,0,0));
check4uni.setBackground(new Color(180,240,20));
add(check4uni);
check4uni.addChangeListener(this);

textfield17 = new JTextField("");
textfield17.setBounds(630,160,70,20);
textfield17.setFont(new Font("Andale Mono",1,14));
textfield17.setForeground(new Color(255,255,255));
textfield17.setBackground(new Color(0,0,0));
add(textfield17);

comboCant4 = new JComboBox();
comboCant4.setBounds(720,160,50,20);
for(int i = 0; i <=20; i++){
comboCant4.addItem(String.valueOf(i));
   }
add(comboCant4);

check5uni = new JCheckBox("Brotes soja");
check5uni.setBounds(520,190,100,20);
check5uni.setForeground(new Color(0,0,0));
check5uni.setBackground(new Color(180,240,20));
add(check5uni);
check5uni.addChangeListener(this);

textfield18 = new JTextField("");
textfield18.setBounds(630,190,70,20);
textfield18.setFont(new Font("Andale Mono",1,14));
textfield18.setForeground(new Color(255,255,255));
textfield18.setBackground(new Color(0,0,0));
add(textfield18);

comboCant5 = new JComboBox();
comboCant5.setBounds(720,190,50,20);
for(int i = 0; i <=20; i++){
comboCant5.addItem(String.valueOf(i));
   }
add(comboCant5);

check6uni = new JCheckBox("Repollo");
check6uni.setBounds(520,220,100,20);
check6uni.setForeground(new Color(0,0,0));
check6uni.setBackground(new Color(180,240,20));
add(check6uni);
check6uni.addChangeListener(this);

textfield19 = new JTextField("");
textfield19.setBounds(630,220,70,20);
textfield19.setFont(new Font("Andale Mono",1,14));
textfield19.setForeground(new Color(255,255,255));
textfield19.setBackground(new Color(0,0,0));
add(textfield19);

comboCant6 = new JComboBox();
comboCant6.setBounds(720,220,50,20);
for(int i = 0; i <=20; i++){
comboCant6.addItem(String.valueOf(i));
   }
add(comboCant6);

check7uni = new JCheckBox("Palta");
check7uni.setBounds(520,250,100,20);
check7uni.setForeground(new Color(0,0,0));
check7uni.setBackground(new Color(180,240,20));
add(check7uni);
check7uni.addChangeListener(this);

textfield20 = new JTextField("");
textfield20.setBounds(630,250,70,20);
textfield20.setFont(new Font("Andale Mono",1,14));
textfield20.setForeground(new Color(255,255,255));
textfield20.setBackground(new Color(0,0,0));
add(textfield20);

comboCant7 = new JComboBox();
comboCant7.setBounds(720,250,50,20);
for(int i = 0; i <=20; i++){
comboCant7.addItem(String.valueOf(i));
   }
add(comboCant7);

check8uni = new JCheckBox("R�cula");
check8uni.setBounds(520,280,100,20);
check8uni.setForeground(new Color(0,0,0));
check8uni.setBackground(new Color(180,240,20));
add(check8uni);
check8uni.addChangeListener(this);

textfield21 = new JTextField("");
textfield21.setBounds(630,280,70,20);
textfield21.setFont(new Font("Andale Mono",1,14));
textfield21.setForeground(new Color(255,255,255));
textfield21.setBackground(new Color(0,0,0));
add(textfield21);

comboCant8 = new JComboBox();
comboCant8.setBounds(720,280,50,20);
for(int i = 0; i <=20; i++){
comboCant8.addItem(String.valueOf(i));
   }
add(comboCant8);

check9uni = new JCheckBox("Radicheta");
check9uni.setBounds(520,310,100,20);
check9uni.setForeground(new Color(0,0,0));
check9uni.setBackground(new Color(180,240,20));
add(check9uni);
check9uni.addChangeListener(this);

textfield22 = new JTextField("");
textfield22.setBounds(630,310,70,20);
textfield22.setFont(new Font("Andale Mono",1,14));
textfield22.setForeground(new Color(255,255,255));
textfield22.setBackground(new Color(0,0,0));
add(textfield22);

comboCant9 = new JComboBox();
comboCant9.setBounds(720,310,50,20);
for(int i = 0; i <=20; i++){
comboCant9.addItem(String.valueOf(i));
   }
add(comboCant9);

check10uni = new JCheckBox("Acelga");
check10uni.setBounds(520,340,100,20);
check10uni.setForeground(new Color(0,0,0));
check10uni.setBackground(new Color(180,240,20));
add(check10uni);
check10uni.addChangeListener(this);

textfield23 = new JTextField("");
textfield23.setBounds(630,340,70,20);
textfield23.setFont(new Font("Andale Mono",1,14));
textfield23.setForeground(new Color(255,255,255));
textfield23.setBackground(new Color(0,0,0));
add(textfield23);

comboCant10 = new JComboBox();
comboCant10.setBounds(720,340,50,20);
for(int i = 0; i <=20; i++){
comboCant10.addItem(String.valueOf(i));
   }
add(comboCant10);

check11uni = new JCheckBox("Espinaca");
check11uni.setBounds(520,370,100,20);
check11uni.setForeground(new Color(0,0,0));
check11uni.setBackground(new Color(180,240,20));
add(check11uni);
check11uni.addChangeListener(this);

textfield24 = new JTextField("");
textfield24.setBounds(630,370,70,20);
textfield24.setFont(new Font("Andale Mono",1,14));
textfield24.setForeground(new Color(255,255,255));
textfield24.setBackground(new Color(0,0,0));
add(textfield24);

comboCant11 = new JComboBox();
comboCant11.setBounds(720,370,50,20);
for(int i = 0; i <=20; i++){
comboCant11.addItem(String.valueOf(i));
   }
add(comboCant11);

check12uni = new JCheckBox("Albahaca");
check12uni.setBounds(520,400,100,20);
check12uni.setForeground(new Color(0,0,0));
check12uni.setBackground(new Color(180,240,20));
add(check12uni);
check12uni.addChangeListener(this);

textfield25 = new JTextField("");
textfield25.setBounds(630,400,70,20);
textfield25.setFont(new Font("Andale Mono",1,14));
textfield25.setForeground(new Color(255,255,255));
textfield25.setBackground(new Color(0,0,0));
add(textfield25);

comboCant12 = new JComboBox();
comboCant12.setBounds(720,400,50,20);
for(int i = 0; i <=20; i++){
comboCant12.addItem(String.valueOf(i));
   }
add(comboCant12);

check13uni = new JCheckBox("Apio");
check13uni.setBounds(520,430,100,20);
check13uni.setForeground(new Color(0,0,0));
check13uni.setBackground(new Color(180,240,20));
add(check13uni);
check13uni.addChangeListener(this);

textfield26 = new JTextField("");
textfield26.setBounds(630,430,70,20);
textfield26.setFont(new Font("Andale Mono",1,14));
textfield26.setForeground(new Color(255,255,255));
textfield26.setBackground(new Color(0,0,0));
add(textfield26);

comboCant13 = new JComboBox();
comboCant13.setBounds(720,430,50,20);
for(int i = 0; i <=20; i++){
comboCant13.addItem(String.valueOf(i));
   }
add(comboCant13);

botonPesoCompras = new JButton("Cuenta 1");
botonPesoCompras.setBounds(10,470,100,20);
botonPesoCompras.setFont(new Font("Andale Mono",1,12));
botonPesoCompras.setForeground(new Color(0,0,0));
botonPesoCompras.setBackground(new Color(255,104,29));
add(botonPesoCompras);
botonPesoCompras.addActionListener(this);

 labelTotal = new JLabel("");
 labelTotal.setBounds(130,470,100,20);
 labelTotal.setFont(new Font("Andale Mono",1,14));
 labelTotal.setForeground(new Color(0,0,0));
 labelTotal.setBackground(new Color(0,0,0));
 add(labelTotal);

botonTotal = new JButton("TOTAL...");
botonTotal.setBounds(330,570,100,30);
botonTotal.setFont(new Font("Andale Mono",1,14));
botonTotal.setForeground(new Color(255,255,0));
botonTotal.setBackground(new Color(255,0,0));
add(botonTotal);
botonTotal.addActionListener(this);

labelTotalTotal = new JLabel("");
 labelTotalTotal.setBounds(360,470,100,30);
 labelTotalTotal.setFont(new Font("Andale Mono",1,18));
 labelTotalTotal.setForeground(new Color(255,0,0));
 labelTotalTotal.setBackground(new Color(0,0,0));
 add(labelTotalTotal);

ImageIcon imagen1 = new ImageIcon("PROYECTO1/images/bang.png");
labelImagenTotal = new JLabel(imagen1);
labelImagenTotal.setBounds(280,380,200,200);
add(labelImagenTotal);


botonUnicompras = new JButton("Cuenta 2");
botonUnicompras.setBounds(520,470,100,20);
botonUnicompras.setFont(new Font("Andale Mono",1,12));
botonUnicompras.setForeground(new Color(0,0,0));
botonUnicompras.setBackground(new Color(255,104,29));
add(botonUnicompras);
botonUnicompras.addActionListener(this);

 labelTotal1 = new JLabel("");
 labelTotal1.setBounds(630,470,100,20);
 labelTotal1.setFont(new Font("Andale Mono",1,14));
 labelTotal1.setForeground(new Color(0,0,0));
// labelTotal1.setBackground(new Color(0,0,0));
 add(labelTotal1);
}

public void actionPerformed(ActionEvent e){
if(e.getSource() == botonPesoCompras && check1kilo.isSelected()==true){
String cad1 = comboPeso1.getSelectedItem().toString();
kilo = Integer.parseInt(cad1);
valor1=Integer.parseInt(textfield1.getText());
subtotal1=kilo*valor1;
}
if(e.getSource() == botonPesoCompras && check2kilo.isSelected()==true){
String cad2 = comboPeso2.getSelectedItem().toString();
kilo1 = Integer.parseInt(cad2);
valor2=Integer.parseInt(textfield2.getText());
subtotal2=kilo1*valor2;
}
if(e.getSource() == botonPesoCompras && check3kilo.isSelected()==true){
String cad3 = comboPeso3.getSelectedItem().toString();
kilo2 = Integer.parseInt(cad3);
valor3=Integer.parseInt(textfield3.getText());
subtotal3=kilo2*valor3;
}
if(e.getSource() == botonPesoCompras && check4kilo.isSelected()==true){
String cad4 = comboPeso4.getSelectedItem().toString();
kilo3 = Integer.parseInt(cad4);
valor4=Integer.parseInt(textfield4.getText());
subtotal4=kilo3*valor4;
}
if(e.getSource() == botonPesoCompras && check5kilo.isSelected()==true){
String cad5 = comboPeso5.getSelectedItem().toString();
kilo4 = Integer.parseInt(cad5);
valor5=Integer.parseInt(textfield5.getText());
subtotal5=kilo4*valor5;
}
if(e.getSource() == botonPesoCompras && check6kilo.isSelected()==true){
String cad6 = comboPeso6.getSelectedItem().toString();
kilo5 = Integer.parseInt(cad6);
valor6=Integer.parseInt(textfield6.getText());
subtotal6=kilo5*valor6;
}
if(e.getSource() == botonPesoCompras && check7kilo.isSelected()==true){
String cad7 = comboPeso7.getSelectedItem().toString();
kilo6 = Integer.parseInt(cad7);
valor7=Integer.parseInt(textfield7.getText());
subtotal7=kilo6*valor7;
}
if(e.getSource() == botonPesoCompras && check8kilo.isSelected()==true){
String cad8 = comboPeso8.getSelectedItem().toString();
kilo7 = Integer.parseInt(cad8);
valor8=Integer.parseInt(textfield8.getText());
subtotal8=kilo7*valor8;
}
if(e.getSource() == botonPesoCompras && check9kilo.isSelected()==true){
String cad9 = comboPeso9.getSelectedItem().toString();
kilo8 = Integer.parseInt(cad9);
valor9=Integer.parseInt(textfield9.getText());
subtotal9=kilo8*valor9;
}
if(e.getSource() == botonPesoCompras && check10kilo.isSelected()==true){
String cad10 = comboPeso10.getSelectedItem().toString();
kilo9 = Integer.parseInt(cad10);
valor10=Integer.parseInt(textfield10.getText());
subtotal10=kilo9*valor10;
}
if(e.getSource() == botonPesoCompras && check11kilo.isSelected()==true){
String cad11 = comboPeso11.getSelectedItem().toString();
kilo10 = Integer.parseInt(cad11);
valor11=Integer.parseInt(textfield11.getText());
subtotal11=kilo10*valor11;
}
if(e.getSource() == botonPesoCompras && check12kilo.isSelected()==true){
String cad12 = comboPeso12.getSelectedItem().toString();
kilo11 = Integer.parseInt(cad12);
valor12=Integer.parseInt(textfield12.getText());
subtotal12=kilo11*valor12;
}
if(e.getSource() == botonPesoCompras && check13kilo.isSelected()==true){
String cad13 = comboPeso13.getSelectedItem().toString();
kilo12 = Integer.parseInt(cad13);
valor13=Integer.parseInt(textfield13.getText());
subtotal13=kilo12*valor13;
}
resulTotal=subtotal1+subtotal2+subtotal3+subtotal4+subtotal5+subtotal6+subtotal7+subtotal8+subtotal9+subtotal10+subtotal11+subtotal12+subtotal13;
labelTotal.setText("$"+ resulTotal);


if(e.getSource() == botonUnicompras && check1uni.isSelected()==true){
String cad14 = comboCant1.getSelectedItem().toString();
kilo13 = Integer.parseInt(cad14);
valor14=Integer.parseInt(textfield14.getText());
subtotal14=kilo13*valor14;
}
if(e.getSource() == botonUnicompras && check2uni.isSelected()==true){
String cad15 = comboCant2.getSelectedItem().toString();
kilo14 = Integer.parseInt(cad15);
valor15=Integer.parseInt(textfield15.getText());
subtotal15=kilo14*valor15;
 }
if(e.getSource() == botonUnicompras && check3uni.isSelected()==true){
String cad16 = comboCant3.getSelectedItem().toString();
kilo15 = Integer.parseInt(cad16);
valor16=Integer.parseInt(textfield16.getText());
subtotal16=kilo15*valor16;
 }
if(e.getSource() == botonUnicompras && check4uni.isSelected()==true){
String cad17 = comboCant4.getSelectedItem().toString();
kilo16 = Integer.parseInt(cad17);
valor17=Integer.parseInt(textfield17.getText());
subtotal17=kilo16*valor17;
 }
if(e.getSource() == botonUnicompras && check5uni.isSelected()==true){
String cad18 = comboCant5.getSelectedItem().toString();
kilo17 = Integer.parseInt(cad18);
valor18=Integer.parseInt(textfield18.getText());
subtotal18=kilo17*valor18;
 }
if(e.getSource() == botonUnicompras && check6uni.isSelected()==true){
String cad19 = comboCant6.getSelectedItem().toString();
kilo18 = Integer.parseInt(cad19);
valor19=Integer.parseInt(textfield19.getText());
subtotal19=kilo18*valor19;
 }
if(e.getSource() == botonUnicompras && check7uni.isSelected()==true){
String cad20 = comboCant7.getSelectedItem().toString();
kilo19 = Integer.parseInt(cad20);
valor20=Integer.parseInt(textfield20.getText());
subtotal20=kilo19*valor20;
 }
if(e.getSource() == botonUnicompras && check8uni.isSelected()==true){
String cad21 = comboCant8.getSelectedItem().toString();
kilo20 = Integer.parseInt(cad21);
valor21=Integer.parseInt(textfield21.getText());
subtotal21=kilo20*valor21;
 }
if(e.getSource() == botonUnicompras && check9uni.isSelected()==true){
String cad22 = comboCant9.getSelectedItem().toString();
kilo21 = Integer.parseInt(cad22);
valor22=Integer.parseInt(textfield22.getText());
subtotal22=kilo21*valor22;
 }
if(e.getSource() == botonUnicompras && check10uni.isSelected()==true){
String cad23 = comboCant10.getSelectedItem().toString();
kilo22 = Integer.parseInt(cad23);
valor23=Integer.parseInt(textfield23.getText());
subtotal23=kilo22*valor23;
 }
if(e.getSource() == botonUnicompras && check11uni.isSelected()==true){
String cad24 = comboCant11.getSelectedItem().toString();
kilo23 = Integer.parseInt(cad24);
valor24=Integer.parseInt(textfield24.getText());
subtotal24=kilo23*valor24;
 }
if(e.getSource() == botonUnicompras && check12uni.isSelected()==true){
String cad25 = comboCant12.getSelectedItem().toString();
kilo24 = Integer.parseInt(cad25);
valor25=Integer.parseInt(textfield25.getText());
subtotal25=kilo24*valor25;
 }
if(e.getSource() == botonUnicompras && check13uni.isSelected()==true){
String cad26 = comboCant13.getSelectedItem().toString();
kilo25 = Integer.parseInt(cad26);
valor26=Integer.parseInt(textfield26.getText());
subtotal26=kilo25*valor26;
 }
resulTotal1=subtotal14 + subtotal15 +subtotal16 +subtotal17 + subtotal18 + subtotal19 +subtotal20+ subtotal21 + subtotal22 + subtotal23 +subtotal24 + subtotal25 + subtotal26;
labelTotal1.setText("$"+ resulTotal1);

if(e.getSource() == botonTotal){
resulTotalTotal=resulTotal + resulTotal1;
getContentPane().setBackground(new Color(52,221,29));
 }
labelTotalTotal.setText("$" + resulTotalTotal);
if(resulTotalTotal==0){
getContentPane().setBackground(new Color(255,255,255));
}
 if(e.getSource() == salir) {

 Apertura aper= new Apertura();
 aper.setBounds(0,0,450,550);
 aper.setVisible(true);
 aper.setResizable(false);
 aper.setLocationRelativeTo(null);
 this.setVisible(false);
           
       }
       if(e.getSource() == creadora) {

           JOptionPane.showMessageDialog(null, "Desarrollado por Gabriela Cristina Rodriguez");
        
       }

 }

public void stateChanged(ChangeEvent e){
String cad= "";
  if(check1kilo.isSelected() == true){ 
  cad += "Papa";//14 espacios en total con el signo $
   cad+=check1kilo.getText() + "\n";
   check1kilo.setText("Papa");
   textfield1.setText("35");
   }else{
   cad += "Papa";
   cad+=check1kilo.getText() + "\n";
   check1kilo.setText("Papa");
   textfield1.setText("");
   valor1=0;
   subtotal1=kilo*valor1;
   subtotal1=0;
   labelTotal.setText("   " + resulTotal);
  }
 if(check2kilo.isSelected() == true){
   cad += "Batata";
   cad+=check2kilo.getText() + "\n";
   check2kilo.setText("Batata");
   textfield2.setText("45");
   }else{
   cad += "Batata";
   cad+=check2kilo.getText() + "\n";
   check2kilo.setText("Batata");
   textfield2.setText("");
   valor2=0;
   subtotal2=kilo1*valor2;
   labelTotal.setText("   " + resulTotal);
  }
 if(check3kilo.isSelected() == true){
   cad += "Cebolla";
   cad+=check3kilo.getText() + "\n";
   check3kilo.setText("Cebolla");
   textfield3.setText("30");
   }else{
   cad += "Cebolla";
   cad+=check3kilo.getText() + "\n";
   check3kilo.setText("Cebolla");
   textfield3.setText("");
   valor3=0;
   subtotal3=kilo2*valor3;
   labelTotal.setText("   " + resulTotal);
  }
 if(check4kilo.isSelected() == true){
   cad += "Zanahoria";
   cad+=check4kilo.getText() + "\n";
   check4kilo.setText("Zanahoria");
   textfield4.setText("35");
   }else{
   cad += "Zanahoria";
   cad+=check4kilo.getText() + "\n";
   check4kilo.setText("Zanahoria");
   textfield4.setText("");
   valor4=0;
   subtotal4=kilo3*valor4;
   labelTotal.setText("   " + resulTotal);
  }
 if(check5kilo.isSelected() == true){
   cad += "Mandioca";
   cad+=check5kilo.getText() + "\n";
   check5kilo.setText("Mandioca");
   textfield5.setText("55");
   }else{
   cad += "Mandioca";
   cad+=check5kilo.getText() + "\n";
   check5kilo.setText("Mandioca");
   textfield5.setText("");
   valor5=0;
   subtotal5=kilo4*valor5;
   labelTotal.setText("   " + resulTotal);
  }
 if(check6kilo.isSelected() == true){
   cad += "Anco";
   cad+=check6kilo.getText() + "\n";
   check6kilo.setText("Anco");
   textfield6.setText("60");
   }else{
   cad += "Anco";
   cad+=check6kilo.getText() + "\n";
   check6kilo.setText("Anco");
   textfield6.setText("");
   valor6=0;
   subtotal6=kilo5*valor6;
   labelTotal.setText("   " + resulTotal);
  }
 if(check7kilo.isSelected() == true){
   cad += "Cabutia";
   cad+=check7kilo.getText() + "\n";
   check7kilo.setText("Cabutia");
   textfield7.setText("55");
   }else{
   cad += "Cabutia";
   cad+=check7kilo.getText() + "\n";
   check7kilo.setText("Cabutia");
   textfield7.setText("");
   valor7=0;
   subtotal7=kilo6*valor7;
   labelTotal.setText("   " + resulTotal);
  }
if(check8kilo.isSelected() == true){
   cad += "Morron";
   cad+=check8kilo.getText() + "\n";
   check8kilo.setText("Morron");
   textfield8.setText("85");
   }else{
   cad += "Morron";
   cad+=check8kilo.getText() + "\n";
   check8kilo.setText("Morron");
   textfield8.setText("");
   valor8=0;
   subtotal8=kilo7*valor8;
   labelTotal.setText("   " + resulTotal);
  }
if(check9kilo.isSelected() == true){
   cad += "Tomate";
   cad+=check9kilo.getText() + "\n";
   check9kilo.setText("Tomate");
   textfield9.setText("65");
   }else{
   cad += "Tomate";
   cad+=check9kilo.getText() + "\n";
   check9kilo.setText("Tomate");
   textfield9.setText("");
   valor9=0;
   subtotal9=kilo8*valor9;
   labelTotal.setText("   " + resulTotal);
  }
if(check10kilo.isSelected() == true){
   cad += "Berenjena";
   cad+=check10kilo.getText() + "\n";
   check10kilo.setText("Berenjena");
   textfield10.setText("40");
   }else{
   cad += "Berenjena";
   cad+=check10kilo.getText() + "\n";
   check10kilo.setText("Berenjena");
   textfield10.setText("");
   valor10=0;
   subtotal10=kilo9*valor10;
   labelTotal.setText("   " + resulTotal);
  }
if(check11kilo.isSelected() == true){
   cad += "Zapallito";
   cad+=check11kilo.getText() + "\n";
   check11kilo.setText("Zapallito");
   textfield11.setText("50");
   }else{
   cad += "Zapallito";
   cad+=check11kilo.getText() + "\n";
   check11kilo.setText("Zapallito");
   textfield11.setText("");
   valor11=0;
   subtotal11=kilo10*valor11;
   labelTotal.setText("   " + resulTotal);
  }
if(check12kilo.isSelected() == true){
   cad += "Chaucha";
   cad+=check12kilo.getText() + "\n";
   check12kilo.setText("Chaucha");
   textfield12.setText("90");
   }else{
   cad += "Chaucha";
   cad+=check12kilo.getText() + "\n";
   check12kilo.setText("Chaucha");
   textfield12.setText("");
   valor12=0;
   subtotal12=kilo11*valor12;
   labelTotal.setText("   " + resulTotal);
 }
if(check13kilo.isSelected() == true){
   cad += "Lechuga";
   cad+=check13kilo.getText() + "\n";
   check13kilo.setText("Lechuga");
   textfield13.setText("100");
   }else{
   cad += "Lechuga";
   cad+=check13kilo.getText() + "\n";
   check13kilo.setText("Lechuga");
   textfield13.setText("");
   valor13=0;
   subtotal13=kilo12*valor13;
   labelTotal.setText("   " + resulTotal);
 }
if(check1uni.isSelected() == true){
   cad += "Br�coli";
   cad+=check1uni.getText() + "\n";
   check1uni.setText("Br�coli");
   textfield14.setText("100");
   }else{
   cad += "Br�coli";
   cad+=check1uni.getText() + "\n";
   check1uni.setText("Br�coli");
   textfield14.setText("");
   valor14=0;
   subtotal14=kilo13*valor14;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check2uni.isSelected() == true){
   cad += "Alcaucil";
   cad+=check2uni.getText() + "\n";
   check2uni.setText("Alcaucil");
   textfield15.setText("55");
   }else{
   cad += "Alcaucil";
   cad+=check2uni.getText() + "\n";
   check2uni.setText("Alcaucil");
   textfield15.setText("");
   valor15=0;
   subtotal15=kilo14*valor15;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check3uni.isSelected() == true){
   cad += "Coliflor";
   cad+=check3uni.getText() + "\n";
   check3uni.setText("Coliflor");
   textfield16.setText("65");
   }else{
   cad += "Coliflor";
   cad+=check3uni.getText() + "\n";
   check3uni.setText("Coliflor");
   textfield16.setText("");
   valor16=0;
   subtotal16=kilo15*valor16;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check4uni.isSelected() == true){
   cad += "Champignon";
   cad+=check4uni.getText() + "\n";
   check4uni.setText("Champignon");
   textfield17.setText("150");
   }else{
   cad += "Champignon";
   cad+=check4uni.getText() + "\n";
   check4uni.setText("Champignon");
   textfield17.setText("");
   valor17=0;
   subtotal17=kilo16*valor17;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check5uni.isSelected() == true){
   cad += "Brotes soja";
   cad+=check5uni.getText() + "\n";
   check5uni.setText("Brotes soja");
   textfield18.setText("120");
   }else{
   cad += "Brotes soja";
   cad+=check5uni.getText() + "\n";
   check5uni.setText("Brotes soja");
   textfield18.setText("");
   valor18=0;
   subtotal18=kilo17*valor18;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check6uni.isSelected() == true){
   cad += "Repollo";
   cad+=check6uni.getText() + "\n";
   check6uni.setText("Repollo");
   textfield19.setText("50");
   }else{
   cad += "Repollo";
   cad+=check6uni.getText() + "\n";
   check6uni.setText("Repollo");
   textfield19.setText("");
   valor19=0;
   subtotal19=kilo18*valor19;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check7uni.isSelected() == true){
   cad += "Palta";
   cad+=check7uni.getText() + "\n";
   check7uni.setText("Palta");
   textfield20.setText("45");
   }else{
   cad += "Palta";
   cad+=check7uni.getText() + "\n";
   check7uni.setText("Palta");
   textfield20.setText("");
   valor20=0;
   subtotal20=kilo19*valor20;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check8uni.isSelected() == true){
   cad += "Rucula";
   cad+=check8uni.getText() + "\n";
   check8uni.setText("Rucula");
   textfield21.setText("20");
   }else{
   cad += "Rucula";
   cad+=check8uni.getText() + "\n";
   check8uni.setText("Rucula");
   textfield21.setText("");
   valor21=0;
   subtotal21=kilo20*valor21;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check9uni.isSelected() == true){
   cad += "Radicheta";
   cad+=check9uni.getText() + "\n";
   check9uni.setText("Radicheta");
   textfield22.setText("25");
   }else{
   cad += "Radicheta";
   cad+=check9uni.getText() + "\n";
   check9uni.setText("Radicheta");
   textfield22.setText("");
   valor22=0;
   subtotal22=kilo21*valor22;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check10uni.isSelected() == true){
   cad += "Acelga";
   cad+=check10uni.getText() + "\n";
   check10uni.setText("Acelga");
   textfield23.setText("35");
   }else{
   cad += "Acelga";
   cad+=check10uni.getText() + "\n";
   check10uni.setText("Acelga");
   textfield23.setText("");
   valor23=0;
   subtotal23=kilo22*valor23;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check11uni.isSelected() == true){
   cad += "Espinaca";
   cad+=check11uni.getText() + "\n";
   check11uni.setText("Espinaca");
   textfield24.setText("45");
   }else{
   cad += "Espinaca";
   cad+=check11uni.getText() + "\n";
   check11uni.setText("Espinaca");
   textfield24.setText("");
   valor24=0;
   subtotal24=kilo23*valor24;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check12uni.isSelected() == true){
   cad += "Albahaca";
   cad+=check12uni.getText() + "\n";
   check12uni.setText("Albahaca");
   textfield25.setText("35");
   }else{
   cad += "Albahaca";
   cad+=check12uni.getText() + "\n";
   check12uni.setText("Albahaca");
   textfield25.setText("");
   valor25=0;
   subtotal25=kilo24*valor25;
   labelTotal1.setText("   " + resulTotal1);
 }
if(check13uni.isSelected() == true){
   cad += "Apio";
   cad+=check13uni.getText() + "\n";
   check13uni.setText("Apio");
   textfield26.setText("40");
   }else{
   cad += "Apio";
   cad+=check13uni.getText() + "\n";
   check13uni.setText("Apio");
   textfield26.setText("");
   valor26=0;
   subtotal26=kilo25*valor26;
   labelTotal1.setText("   " + resulTotal1);
 }
}
public static void main(String args[]){
Calcula compras = new Calcula();
compras.setBounds(0,0,800,720);
compras.setVisible(true);
compras.setResizable(false);
compras.setLocationRelativeTo(null);
  }
}