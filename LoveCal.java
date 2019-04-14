import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginFrame extends JFrame implements ActionListener
{
   Container c;
     JLabel cal=new JLabel("LOVE CALCULATOR");
   JLabel userlabel=new JLabel("ENTER YOUR NAME");
   JLabel passlabel=new JLabel("ENTER NAME OF YOUR  LOVER");
   JTextField usertf=new JTextField();
    JTextField passtf=new JTextField();
	JButton login=new JButton("RESULT");
	JLabel percentage=new JLabel("PERCENTAGES");
	JTextField pertf=new JTextField();
	 JLabel label=new JLabel("your score is");
	LoginFrame()
	 {
	    c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		cal.setBounds(200,20,200,30);
		userlabel.setBounds(100,70,400,40);
		passlabel.setBounds(100,120,400,40);
		usertf.setBounds(450,70,150,40);
		passtf.setBounds(450,120,150,40);
		login.setBounds(200,250,200,50);
		percentage.setBounds(200,300,250,50);
		pertf.setBounds(200,350,200,40);
		Font f=new Font("Arial",Font.BOLD,20);
		cal.setFont(f);
		userlabel.setFont(f);
		passlabel.setFont(f);
		usertf.setFont(f);
		passtf.setFont(f);
		login.setFont(f);
		percentage.setFont(f);
		pertf.setFont(f);
		c.add(cal);
		c.add(userlabel);
		c.add(passlabel);
		c.add(passtf);
		c.add(usertf);
		c.add(login);
		c.add(percentage);
		c.add(pertf);
		c.add(label);
		login.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent event)
	 {
		 if(event.getSource()==login)
		 {
			 String username=usertf.getText();
			 String passname=passtf.getText();
			 int sum1=0,sum2=0;
			 for(int i=0;i<username.length();i++){
				 char ch=username.charAt(i);
				 int ascii=ch;
				 sum1=sum1+ascii;
			 }
			  for(int i=0;i<passname.length();i++){
				 char ch=passname.charAt(i);
				 int ascii=ch;
				 sum2=sum2+ascii;
			 }
			 int total=sum1+sum2;
			 int love=total/100;
			 pertf.setText(Integer.toString(love)+"%");
			 if(love>75)
			 {
				 label.setText("you guys are meant for each other");
			 }
			 else
			 {
				 label.setText("YOU GUYS SHOULD SPEND MORE QUALITY TIME TOGETHER");
			 }
				 
		
	 }
}
}
class LoveCal
{
	public static void main(String[]args)
	{
	    LoginFrame f=new LoginFrame();
		f.setTitle("LOVE CALCULATOR");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,200,500);
	}
}