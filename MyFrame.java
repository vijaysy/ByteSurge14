//package ByteSurge;

//package Browse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;





class backImage extends JComponent {
	private static final long serialVersionUID = 1L;
  Image i;

public backImage(Image i) {
this.i = i;
}
@Override
public void paintComponent(Graphics g) {
g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
}
}


class CodeFile{
	static String fname="VIJAY";
	static String path=new String("F:\\Browse\\");
	static float scoure=0;
	static String pl1,pl2,pn,tn,cl;
	static int w=1024;//(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	static int h=768;//(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
}





public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JButton b1 = new JButton("Submit");
	JButton b2=new JButton("Start The Quiz");
	
	JTextField tf1=new JTextField();     JLabel name1=new JLabel("Player 1:");
	JTextField tf2=new JTextField();     JLabel name2=new JLabel("Player 2:");
	JTextField phno=new JTextField();    JLabel phno2=new JLabel("Mobile No.:");
	JTextField codef=new JTextField();   JLabel code2=new JLabel("USN:");
	JTextField clg=new JTextField();     JLabel clg2=new JLabel("College:");
	JTextField teamt=new JTextField();    JLabel teaml=new JLabel("Team Name:");
	
	
	int i=0,kl=1;
	JLabel ql;
	JLabel qnoL;
	
	Boolean f1,f2,f3,f4,f5,f6;
	
	
  String q[]=new String[100];
  String q1[]=new String[100];
  String q2[]=new String[100];
  
  JLabel tim;
  int timeRemaining = 60*20;
  public static final DateFormat df = new SimpleDateFormat("hh:mm:ss");
  Timer countdownTimer;
  
  ButtonGroup bg=new ButtonGroup();
  JRadioButton rb1=new JRadioButton("A");
  JRadioButton rb2=new JRadioButton("B");
  JRadioButton rb3=new JRadioButton("C");
  JRadioButton rb4=new JRadioButton("D");

  
  
  void setQue(){
 	 
 	  File folder1=new File(CodeFile.path+"/qns1");
 	  //System.out.println(folder1.exists());
 	  q1=folder1.list();
 	  List<String> lst1=Arrays.asList(q1);
 	  Collections.shuffle(lst1);	
 	  
 	  File folder2=new File(CodeFile.path+"/qns2");
	  q2=folder2.list();
	  List<String> lst2=Arrays.asList(q2);
	  Collections.shuffle(lst2);	
	  
	 
 }
 


public MyFrame() throws IOException {

this.setSize(CodeFile.w,CodeFile.h);

this.setTitle("SIT CSE BROWSE LOGIN PAGE");

this.setDefaultCloseOperation(EXIT_ON_CLOSE);

this.addWindowListener(new WindowListener() {
	
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter(CodeFile.fname);
			BufferedWriter bw=new BufferedWriter(fw);
			
			Calendar cal = Calendar.getInstance();
	    	cal.getTime();
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    	bw.write( sdf.format(cal.getTime()) );
	    	bw.newLine();
	    	
      	bw.write("Player 1:  "+CodeFile.pl1);
      	bw.newLine();
      	bw.write("Player 2:  "+CodeFile.pl2);
      	bw.newLine();
      	bw.write("Mobile No:  "+CodeFile.pn);
      	bw.newLine();
      	bw.write("Team Name:  "+CodeFile.tn);
      	bw.newLine();
      	bw.write("Clg:  "+CodeFile.cl);
      	bw.newLine();
      	bw.write("Score: "+CodeFile.scoure);
      	bw.newLine();
      	bw.close();
      	tqFrame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter(CodeFile.fname);
			BufferedWriter bw=new BufferedWriter(fw);
			
			Calendar cal = Calendar.getInstance();
	    	cal.getTime();
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    	bw.write( sdf.format(cal.getTime()) );
	    	bw.newLine();
			
      	bw.write("Player 1:  "+CodeFile.pl1);
      	bw.newLine();
      	bw.write("Player 2:  "+CodeFile.pl2);
      	bw.newLine();
      	bw.write("Mobile No:  "+CodeFile.pn);
      	bw.newLine();
      	bw.write("Team Name:  "+CodeFile.tn);
      	bw.newLine();
      	bw.write("Clg:  "+CodeFile.cl);
      	bw.newLine();
      	bw.write("Score: "+CodeFile.scoure);
      	bw.newLine();
      	bw.close();
      	tqFrame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
});


File d=new File("vijay.txt");
CodeFile.path=d.getAbsolutePath().replace(d.getName(),"");//+"bin/ByteSurge";
//CodeFile.path=d.getAbsolutePath().replace(d.getName(),"").replace("\\", "\\\\");
//System.out.println(CodeFile.path);
BufferedImage bf = ImageIO.read(new File(CodeFile.path+"/sl.png"));
backImage bf2=new backImage(bf);
this.setContentPane(bf2);

name1.setBounds(318+700-320, 140+40,80,30);       name2.setBounds(318+700-320, 180+40,80,30);
tf1.setBounds(318+700+70+25-320, 145+40,180,20);  tf2.setBounds(318+700+70+25-320, 185+40,180,20);

clg2.setBounds(318+700-320,230+50+90,180,20);  clg.setBounds(318+700+70+25-320, 230+50+90,180,20);

code2.setBounds(318+700-320,230+50+140,180,20);  codef.setBounds(318+700+70+25-320, 230+50+140,180,20);

teaml.setBounds(318+700-320,230+40,180,20);  teamt.setBounds(318+700+70+25-320, 230+40,180,20);

phno2.setBounds(318+700-320,230+50+40,180,20);  phno.setBounds(318+700+70+25-320, 230+50+40,180,20);

b1.setBounds(318+700+50-320,230+50+140+50,180,40);

JPanel pan = new JPanel();


TitledBorder title=BorderFactory.createTitledBorder("Register");
title.setTitleColor(Color.BLACK);
Border rsi=BorderFactory.createRaisedBevelBorder();
Border comp1=BorderFactory.createCompoundBorder(rsi,title);
  pan.setBorder(comp1);
  pan.setBackground(Color.white);
  pan.setBounds(670, 100+40,325,400);
  
  
this.add(b1);  this.add(codef); this.add(clg);  this.add(clg2);
this.add(tf1); this.add(name1);this.add(name2);this.add(code2);this.add(tf1);this.add(tf2);
this.add(phno);this.add(phno);this.add(phno2);this.add(teamt);this.add(teaml); this.add(pan);

b1.setEnabled(false);
f1=f2=f3=f4=f5=f6=false;


tf1.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
tf1.setForeground(Color.BLACK);

tf2.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
tf2.setForeground(Color.BLACK);

phno.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
phno.setForeground(Color.BLACK);

codef.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
codef.setForeground(Color.BLACK);

clg.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
clg.setForeground(Color.BLACK);

teamt.setFont(new java.awt.Font("Verdana", Font.BOLD, 12));
teamt.setForeground(Color.BLACK);

tf1.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(tf1.getText()!="")
	    	f1=true;
	    else
	    	f1=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});

tf2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(tf2.getText()!="")
	    	f2=true;
	    else
	    	f2=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});

phno.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(phno.getText()!="")
	    	f3=true;
	    else
	    	f3=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});

codef.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(codef.getText()!="")
	    	f4=true;
	    else
	    	f4=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});

clg.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(clg.getText()!="")
	    	f5=true;
	    else
	    	f5=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});


teamt.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		    
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		chk();
		
	}
	
	void chk(){
		if(teamt.getText()!="")
	    	f6=true;
	    else
	    	f6=false;
	    
	    b1.setEnabled(f1&&f2&&f3&&f4&&f5&&f6);
	    
		
	}
	
});




b1.addActionListener(new ActionListener() {

  @Override
  public void actionPerformed(ActionEvent e) {
      try {
      	CodeFile.fname=CodeFile.path+codef.getText()+".txt";
      	CodeFile.pl1=tf1.getText();
      	CodeFile.pl2=tf2.getText();
      	CodeFile.pn=phno.getText();
      	CodeFile.tn=teamt.getText();
      	CodeFile.cl=clg.getText();
      	instFrame();
      } catch (Throwable ex) {
          Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
      
  }
});



f1=f2=f3=f4=f5=f6=true;




}

public static void main(String[] args) throws IOException, Exception {

MyFrame f = new MyFrame();
f.setVisible(true);
//f.StrtQuiz();
}


void instFrame() throws Exception{
	this.setTitle("Instruction Page");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	BufferedImage bf2 = ImageIO.read(new File(CodeFile.path+"/inst.png"));
	this.setContentPane(new backImage(bf2));
	b2.setBounds(1024-300, 230+100+40+250, 150, 30);
	add(b2);
	this.setVisible(true);
	b2.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        try {
	         
	        	StrtQuiz();
	        } catch (Throwable ex) {
	            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        
	    }
	});
	
}



void StrtQuiz() throws Exception{
	 this.setSize(CodeFile.w,CodeFile.h);
	 this.setVisible(true);
   ImageIcon n=new ImageIcon(CodeFile.path+"/nxt.jpg");
   JButton b3=new JButton(n);
   b3.setOpaque(false);
  
  bg.add(rb1);
  bg.add(rb2);
  bg.add(rb3);
  bg.add(rb4);
  
  
  final JTextArea qt=new JTextArea();
  final JLabel qno=new JLabel();
  
  this.setVisible(true);
this.setTitle("Round 1: MCQ");

this.setDefaultCloseOperation(EXIT_ON_CLOSE);

BufferedImage bf = ImageIO.read(new File(CodeFile.path+"/mcq.png"));

this.setContentPane(new backImage(bf));

b3.setBounds(1024-75-50, 230+80+270,75,75);

JLabel op2=new JLabel("Next Question");
op2.setBounds(1024-85-90, 230+290,150,75);
op2.setFont(new Font(null, NORMAL, 20));
op2.setForeground(Color.RED);
add(op2);

qno.setBounds(100,200,50,50);

qno.setText(String.valueOf(i));


qt.setBounds(30,85,1000,600);
qt.setEditable(false);
qt.setOpaque(true);
Border clr=BorderFactory.createLineBorder(Color.BLACK);
qt.setBorder(clr);
qt.setBackground(Color.WHITE);

JLabel op=new JLabel("Select your options");
op.setBounds(1024-200,230, 300, 100);
op.setFont(new Font(null, NORMAL, 20));
op.setForeground(Color.MAGENTA);
add(op);


rb1.setBounds(1024-130,180+130,50,20);
rb2.setBounds(1024-130,220+130,50,20);
rb3.setBounds(1024-130,260+130,50,20);
rb4.setBounds(1024-130,300+130,50,20);

rb1.setOpaque(false);
rb2.setOpaque(false);
rb3.setOpaque(false);
rb4.setOpaque(false);


setQue();
ql= new JLabel(new ImageIcon(CodeFile.path+"/qns1/"+q1[i]));
ql.setBounds(20,170,790,610);
add(ql);


qnoL= new JLabel(new ImageIcon(CodeFile.path+"/qno/"+"q"+(i+1)+".png"));
qnoL.setBounds(0,0,1024,120);
add(qnoL);



add(b3);add(rb1);add(rb2);add(rb3);add(op);
add(rb4);

tim=new JLabel();
tim.setBounds(1024-280, 130, 300, 30);
tim.setFont(new Font(null, NORMAL, 20));
tim.setForeground(Color.RED);
add(tim);




countdownTimer = new Timer(1000, new ActionListener(){
public void actionPerformed(ActionEvent e) {
     if (--timeRemaining > 0) {
  	   String frmt=new String();
  	   
  	   frmt=String.valueOf(timeRemaining/60)+":"+String.valueOf(timeRemaining%60);
  	   tim.setText("Time Remaining: "+frmt);
      } else { 
      	
         tim.setText("Time's up!");
         
     	try {
			FileWriter fw = new FileWriter(CodeFile.fname);
			BufferedWriter bw=new BufferedWriter(fw);
			
			Calendar cal = Calendar.getInstance();
	    	cal.getTime();
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    	bw.write( sdf.format(cal.getTime()) );
	    	bw.newLine();
			
      	bw.write("Player 1:  "+CodeFile.pl1);
      	bw.newLine();
      	bw.write("Player 2:  "+CodeFile.pl2);
      	bw.newLine();
      	bw.write("Mobile No:  "+CodeFile.pn);
      	bw.newLine();
      	bw.write("Team Name:  "+CodeFile.tn);
      	bw.newLine();
      	bw.write("Clg:  "+CodeFile.cl);
      	bw.newLine();
      	bw.write("Score: "+CodeFile.scoure);
      	bw.newLine();
      	bw.close();
      	tqFrame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    
      countdownTimer.stop();
      }
     
  }

}); countdownTimer.start();













b3.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
	
	  if(i<15){
	
	   if(rb1.isSelected()&&q1[i].charAt(1)=='a') CodeFile.scoure++;
	   if(rb1.isSelected()&&q1[i].charAt(1)!='a') CodeFile.scoure-=0.25;
	   
	   
     if(rb2.isSelected()&&q1[i].charAt(1)=='b') CodeFile.scoure++;
     if(rb2.isSelected()&&q1[i].charAt(1)!='b') CodeFile.scoure-=0.25;
     
     
     if(rb3.isSelected()&&q1[i].charAt(1)=='c') CodeFile.scoure++;
     if(rb3.isSelected()&&q1[i].charAt(1)!='c') CodeFile.scoure-=0.25;
     
     
     if(rb4.isSelected()&&q1[i].charAt(1)=='d') CodeFile.scoure++;
     if(rb4.isSelected()&&q1[i].charAt(1)!='d') CodeFile.scoure-=0.25;
     
	  }
	  
	  if(i>=15){
			
		   if(rb1.isSelected()&&q2[i-15].charAt(1)=='a') CodeFile.scoure+=2;
		   if(rb1.isSelected()&&q2[i-15].charAt(1)!='a') CodeFile.scoure-=0.50;
		   
		   
	       if(rb2.isSelected()&&q2[i-15].charAt(1)=='b') CodeFile.scoure+=2;
	       if(rb2.isSelected()&&q2[i-15].charAt(1)!='b') CodeFile.scoure-=0.50;
	       
	       
	       if(rb3.isSelected()&&q2[i-15].charAt(1)=='c') CodeFile.scoure+=2;
	       if(rb3.isSelected()&&q2[i-15].charAt(1)!='c') CodeFile.scoure-=0.50;
	       
	       
	       if(rb4.isSelected()&&q2[i-15].charAt(1)=='d') CodeFile.scoure+=2;
	       if(rb4.isSelected()&&q2[i-15].charAt(1)!='d') CodeFile.scoure-=0.50;
	       
		  }
	  
     System.out.println(CodeFile.scoure);
    // System.out.println(q[i].charAt(1));
     
	 i++;
  remove(ql);
  remove(qnoL);
  
  if(i<15){
  ql= new JLabel(new ImageIcon(CodeFile.path+"/qns1/"+q1[i]));
  ql.setBounds(20,170,790,610);
  add(ql);
  }
  
  if(i>=15){
      ql= new JLabel(new ImageIcon(CodeFile.path+"/qns2/"+q2[i-15]));
      ql.setBounds(20,170,790,610);
      add(ql);
      }
  

 qnoL= new JLabel(new ImageIcon(CodeFile.path+"/qno/"+"q"+(i+1)+".png"));
 qnoL.setBounds(0,0,1024,120);
  add(qnoL);
  bg.clearSelection();
  //System.out.println(i);

         
  repaint();
  if(i==20){
        
 
		try {
			//String rslt=CodeFile.path+"/"+CodeFile.fname;
			//System.out.println(rslt);
			FileWriter fw = new FileWriter(CodeFile.fname);
			BufferedWriter bw=new BufferedWriter(fw);
			
			
			Calendar cal = Calendar.getInstance();
	    	cal.getTime();
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    	bw.write( sdf.format(cal.getTime()) );
	    	bw.newLine();
			
      	bw.write("Player 1:  "+CodeFile.pl1);
      	bw.newLine();
      	bw.write("Player 2:  "+CodeFile.pl2);
      	bw.newLine();
      	bw.write("Mobile No:  "+CodeFile.pn);
      	bw.newLine();
      	bw.write("Team Name:  "+CodeFile.tn);
      	bw.newLine();
      	bw.write("Clg:  "+CodeFile.cl);
      	bw.newLine();
      	bw.write("Score: "+CodeFile.scoure);
      	bw.newLine();
      	bw.close();
      	tqFrame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		
		
      
  }
  
  
}
});


	
}



void tqFrame() throws Exception{
	this.setSize(CodeFile.w,CodeFile.h);
  this.setVisible(true);
  this.setTitle("Thank You");
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  BufferedImage bf3 = ImageIO.read(new File(CodeFile.path+"/tq.png"));
  this.setContentPane(new backImage(bf3));
  this.setVisible(true);
	//repaint();
}

}
