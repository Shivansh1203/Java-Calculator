import java.awt.*;
import java.awt.event.*;
class Cal extends Frame implements ActionListener
{
Button b1, b2, b3,b4,b5;
Label L1,L2, L3;
TextField t1,t2, t3;
Cal()
{
setVisible(true);
setSize(200,200);
b1=new Button("Add");
b2=new Button("Substract");
b3=new Button("Multiply");
b4=new Button("Division");
b5=new Button("Close");
L1=new Label("Enter the first number");
L2=new Label("Enter the second number");
L3=new Label("Result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
setBackground(Color.BLUE);
setLayout(new FlowLayout());
add(L1); add(t1); add(L2);add(t2); add(b1);add(b2);add(b3); add(b4); add(L3); add(t3); add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1){int a=Integer.parseInt(t1.getText()); int b=Integer.parseInt(t2.getText()); t3.setText(Integer.toString(a+b));}
if(obj.getSource()==b2){int a=Integer.parseInt(t1.getText()); int b=Integer.parseInt(t2.getText()); t3.setText(Integer.toString(a-b));}
if(obj.getSource()==b3){int a=Integer.parseInt(t1.getText()); int b=Integer.parseInt(t2.getText()); t3.setText(Integer.toString(a*b));}
if(obj.getSource()==b4){int a=Integer.parseInt(t1.getText()); int b=Integer.parseInt(t2.getText()); t3.setText(Integer.toString(a/b));}
if(obj.getSource()==b5){dispose();}
}
public static void main(String args[])
{
Cal obj1 =new Cal();}
}

