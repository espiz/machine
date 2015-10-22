package javax;


import javax.swing.JOptionPane;


public class Javax {
public static void main (String args []){
	String fn= JOptionPane.showInputDialog("Inter the First Number");
	String sn= JOptionPane.showInputDialog("Inter Second Number");
	
	int number1=Integer.parseInt (fn); 
	int number2=Integer.parseInt (sn);
	int sum=number1+number2;
	
	JOptionPane.showMessageDialog(null,"The answer is"+sum,"The addition",JOptionPane.PLAIN_MESSAGE);
	
}
}
