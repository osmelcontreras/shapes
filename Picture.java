import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JApplet;

import com.sun.org.apache.bcel.internal.generic.LAND;


public class Picture extends JApplet {

	private Circle firstCircle;					// place to store the sun which is a Circle
	private Square ground;				// place to store the ground which is a Square
	private Circle secondCircle;
	private Circle thirdCircle;
	private Square shoe1;
	private Square shoe2;
	private Square shoe3;
	private Square shoe4;
	private Square shoe5;
	private Square shoe6;
	private Square shoe7;
	private Square shoe8;
	private Square shoe9;
	private Square shoe10;
	private Square shoe11;
	private Square shoe12;
	private Square shoe13;
	private Square shoe14;
	private Square shoe15;
	private Square shoe16;
	private Square shoe17;
	private Square shoe18;
	private Square shoe19;
	private Square shoe20;
	private Square shoe21;
	private Square shoe22;
	private Square shoe23;
	private Square shoe24;
	private Square shoe25;
	private Square shoe26;
	private Square body1;
	private Square body2;
	private Square body3;
	private Square body4;
	private Square body5;
	private Square body6;
	private Square body7;
	private Square body8;
	private Square body9;
	private Square body10;
	private Square body11;
	private Square body12;
	private Square body13;
	private Square body14;
	private Square body15;
	private Square body16;
	private Square body17;
	private Square body18;
	private Square body19;
	private Square chest1;
	private Square chest2;
	private Square leftArm1;
	private Square leftArm2;
	private Square leftArm3;
	private Square leftArm4;
	private Square leftArm5;
	private Square leftArm6;
	private Square leftArm7;
	private Square rightArm1;
	private Square rightArm2;
	private Square rightArm3;
	private Square rightArm4;
	private Square rightArm5;
	private Square rightArm6;
	private Square head1;
	private Square head2;
	private Square head3;
	private Square head4;
	private Square head5;
	private Square head6;
	private Square head7;
	private Square head8;
	private Square head9;
	private Square head10;
	private Square head11;
	private Square head12;
	private Square head13;
	private Square head14;
	private Square head15;
	private Square head16;
	private Square head17;
	private Square head18;
	private Square head19;
	private Square head20;
	private Square head21;
	private Square head22;
	private Square head23;
	private Square head24;
	private Square head25;
	private Square head26;
	private Square head27;
	private Square head28;
	private Square head29;
	private Square hat1;
	private Square hat2;
	private Square hat3;
	private Square hat4;
	private Square hat5;
	private Square hat6;
	private Square hat7;
	
	
	public void init()
	{
		this.setSize(800, 800);
		this.setBackground(Color.blue);			//the background is set to be blue
		
		
		shoe1 = new Square();					//shoe starts from the right
		shoe1.setX(300);
		shoe1.setY(670);
		shoe1.setSize(30);
		shoe1.setFillColor(Color.black);
		
		shoe2 = new Square();
		shoe2.setX(270);
		shoe2.setY(670);
		shoe2.setSize(30);
		shoe2.setFillColor(Color.black);
		
		shoe3 = new Square();
		shoe3.setX(240);
		shoe3.setY(670);
		shoe3.setSize(30);
		shoe3.setFillColor(Color.black);
		
		shoe4 = new Square();
		shoe4.setX(210);
		shoe4.setY(670);
		shoe4.setSize(30);
		shoe4.setFillColor(Color.black);
		
		shoe5 = new Square();
		shoe5.setX(300);
		shoe5.setY(640);
		shoe5.setSize(30);
		shoe5.setFillColor(Color.black);
		
		shoe6 = new Square();
		shoe6.setX(270);
		shoe6.setY(640);
		shoe6.setSize(30);
		shoe6.setFillColor(Color.black);
		
		shoe7 = new Square();
		shoe7.setX(240);
		shoe7.setY(640);
		shoe7.setSize(30);
		shoe7.setFillColor(Color.black);
		
		shoe8 = new Square();
		shoe8.setX(300);
		shoe8.setY(610);
		shoe8.setSize(30);
		shoe8.setFillColor(Color.red);
		
		shoe9 = new Square();
		shoe9.setX(270);
		shoe9.setY(610);
		shoe9.setSize(30);
		shoe9.setFillColor(Color.red);
		
		shoe10 = new Square();
		shoe10.setX(330);
		shoe10.setY(610);
		shoe10.setSize(30);
		shoe10.setFillColor(Color.red);
		
		shoe11 = new Square();
		shoe11.setX(330);
		shoe11.setY(580);
		shoe11.setSize(30);
		shoe11.setFillColor(Color.red);
		
		shoe12 = new Square();
		shoe12.setX(300);
		shoe12.setY(580);
		shoe12.setSize(30);
		shoe12.setFillColor(Color.red);
		
		shoe13 = new Square();
		shoe13.setX(270);
		shoe13.setY(580);
		shoe13.setSize(30);
		shoe13.setFillColor(Color.red);
		
		shoe14 = new Square();
		shoe14.setX(360);
		shoe14.setY(580);
		shoe14.setSize(30);
		shoe14.setFillColor(Color.red);
		
		shoe15 = new Square();
		shoe15.setX(330);
		shoe15.setY(580);
		shoe15.setSize(30);
		shoe15.setFillColor(Color.red);
		
		shoe16 = new Square();
		shoe16.setX(390);
		shoe16.setY(580);
		shoe16.setSize(30);
		shoe16.setFillColor(Color.red);
		
		shoe17 = new Square();
		shoe17.setX(390);
		shoe17.setY(580);
		shoe17.setSize(30);
		shoe17.setFillColor(Color.red);
		
		shoe18 = new Square();
		shoe18.setX(390);
		shoe18.setY(580);
		shoe18.setSize(30);
		shoe18.setFillColor(Color.red);
		
		shoe19 = new Square();
		shoe19.setX(420);
		shoe19.setY(580);
		shoe19.setSize(60);
		shoe19.setFillColor(Color.red);
		
		shoe20 = new Square();
		shoe20.setX(450);
		shoe20.setY(640);
		shoe20.setSize(60);
		shoe20.setFillColor(Color.black);
		
		shoe21 = new Square();
		shoe21.setX(510);
		shoe21.setY(670);
		shoe21.setSize(30);
		shoe21.setFillColor(Color.black);
		
		shoe22 = new Square();
		shoe22.setX(480);
		shoe22.setY(640);
		shoe22.setSize(30);
		shoe22.setFillColor(Color.black);
		
		shoe23 = new Square();
		shoe23.setX(540);
		shoe23.setY(670);
		shoe23.setSize(30);
		shoe23.setFillColor(Color.black);
		
		shoe24 = new Square();
		shoe24.setX(510);
		shoe24.setY(640);
		shoe24.setSize(30);
		shoe24.setFillColor(Color.black);
		
		shoe25 = new Square();
		shoe25.setX(480);
		shoe25.setY(610);
		shoe25.setSize(30);
		shoe25.setFillColor(Color.red);
		
		shoe26 = new Square();					//the bottom part including both shoes
		shoe26.setX(480);
		shoe26.setY(580);
		shoe26.setSize(30);
		shoe26.setFillColor(Color.red);
		
		body1 = new Square();					//the main body starts
		body1.setX(450);
		body1.setY(550);
		body1.setSize(30);
		body1.setFillColor(Color.red);
		
		body2 = new Square();
		body2.setX(420);
		body2.setY(550);
		body2.setSize(30);
		body2.setFillColor(Color.red);
		
		body3 = new Square();
		body3.setX(390);
		body3.setY(550);
		body3.setSize(30);
		body3.setFillColor(Color.red);
		
		body4 = new Square();
		body4.setX(360);
		body4.setY(550);
		body4.setSize(30);
		body4.setFillColor(Color.red);
		
		body5 = new Square();
		body5.setX(330);
		body5.setY(550);
		body5.setSize(30);
		body5.setFillColor(Color.red);
		
		body6 = new Square();
		body6.setX(300);
		body6.setY(550);
		body6.setSize(30);
		body6.setFillColor(Color.red);
		
		body7 = new Square();
		body7.setX(300);
		body7.setY(520);
		body7.setSize(30);
		body7.setFillColor(Color.red);
		
		body8 = new Square();
		body8.setX(330);
		body8.setY(520);
		body8.setSize(30);
		body8.setFillColor(Color.yellow);
		
		body9 = new Square();
		body9.setX(360);
		body9.setY(520);
		body9.setSize(30);
		body9.setFillColor(Color.red);
		
		body10 = new Square();
		body10.setX(390);
		body10.setY(520);
		body10.setSize(30);
		body10.setFillColor(Color.red);
		
		body11 = new Square();
		body11.setX(420);
		body11.setY(520);
		body11.setSize(30);
		body11.setFillColor(Color.yellow);
		
		body12 = new Square();
		body12.setX(450);
		body12.setY(520);
		body12.setSize(30);
		body12.setFillColor(Color.red);
		
		body13 = new Square();
		body13.setX(420);
		body13.setY(490);
		body13.setSize(30);
		body13.setFillColor(Color.red);
		
		body14 = new Square();
		body14.setX(390);
		body14.setY(490);
		body14.setSize(30);
		body14.setFillColor(Color.red);
		
		body15 = new Square();
		body15.setX(360);
		body15.setY(490);
		body15.setSize(30);
		body15.setFillColor(Color.red);
		
		body16 = new Square();
		body16.setX(330);
		body16.setY(490);
		body16.setSize(30);
		body16.setFillColor(Color.red);
		
		body17 = new Square();
		body17.setX(330);
		body17.setY(460);
		body17.setSize(30);
		body17.setFillColor(Color.red);
		
		body18 = new Square();
		body18.setX(330);
		body18.setY(430);
		body18.setSize(30);
		body18.setFillColor(Color.red);
		
		body19 = new Square();
		body19.setX(420);
		body19.setY(460);
		body19.setSize(30);
		body19.setFillColor(Color.red);
		
		chest1 = new Square();
		chest1.setX(360);
		chest1.setY(430);
		chest1.setSize(60);
		chest1.setFillColor(Color.black);
		
		chest2 = new Square();						//the chest starts
		chest2.setX(420);
		chest2.setY(430);
		chest2.setSize(30);
		chest2.setFillColor(Color.black);
		
		leftArm1 = new Square();					//left arm and hand starts
		leftArm1.setX(450);
		leftArm1.setY(460);
		leftArm1.setSize(60);
		leftArm1.setFillColor(Color.black);
		
		leftArm2 = new Square();
		leftArm2.setX(510);
		leftArm2.setY(460);
		leftArm2.setSize(60);
		leftArm2.setFillColor(Color.black);
		
		leftArm3 = new Square();
		leftArm3.setX(540);
		leftArm3.setY(460);
		leftArm3.setSize(30);
		leftArm3.setFillColor(Color.blue);
		
		leftArm4 = new Square();
		leftArm4.setX(480);
		leftArm4.setY(520);
		leftArm4.setSize(60);
		leftArm4.setFillColor(Color.pink);
		
		leftArm5 = new Square();
		leftArm5.setX(480);
		leftArm5.setY(520);
		leftArm5.setSize(30);
		leftArm5.setFillColor(Color.black);
		
		leftArm6 = new Square();
		leftArm6.setX(510);
		leftArm6.setY(550);
		leftArm6.setSize(60);
		leftArm6.setFillColor(Color.pink);
		
		leftArm7 = new Square();
		leftArm7.setX(540);
		leftArm7.setY(520);
		leftArm7.setSize(30);
		leftArm7.setFillColor(Color.pink);
		
		rightArm1 = new Square();					// right arm and hand starts
		rightArm1.setX(240);
		rightArm1.setY(430);
		rightArm1.setSize(90);
		rightArm1.setFillColor(Color.black);
		
		rightArm2 = new Square();
		rightArm2.setX(240);
		rightArm2.setY(430);
		rightArm2.setSize(30);
		rightArm2.setFillColor(Color.blue);
		
		rightArm3 = new Square();
		rightArm3.setX(210);
		rightArm3.setY(490);
		rightArm3.setSize(30);
		rightArm3.setFillColor(Color.black);
		
		rightArm4 = new Square();
		rightArm4.setX(210);
		rightArm4.setY(520);
		rightArm4.setSize(90);
		rightArm4.setFillColor(Color.pink);
		
		rightArm5 = new Square();
		rightArm5.setX(270);
		rightArm5.setY(580);
		rightArm5.setSize(30);
		rightArm5.setFillColor(Color.red);
		
		rightArm6 = new Square();
		rightArm6.setX(270);
		rightArm6.setY(520);
		rightArm6.setSize(30);
		rightArm6.setFillColor(Color.black);
		
		head1 = new Square();						//the face starts
		head1.setX(270);
		head1.setY(370);
		head1.setSize(60);
		head1.setFillColor(Color.pink);
		
		head2 = new Square();
		head2.setX(270);
		head2.setY(370);
		head2.setSize(30);
		head2.setFillColor(Color.black);
		
		head3 = new Square();
		head3.setX(240);
		head3.setY(370);
		head3.setSize(30);
		head3.setFillColor(Color.black);
		
		head4 = new Square();
		head4.setX(240);
		head4.setY(340);
		head4.setSize(30);
		head4.setFillColor(Color.black);
		
		head5 = new Square();
		head5.setX(270);
		head5.setY(340);
		head5.setSize(30);
		head5.setFillColor(Color.pink);
		
		head6 = new Square();
		head6.setX(240);
		head6.setY(310);
		head6.setSize(30);
		head6.setFillColor(Color.black);
		
		head7 = new Square();
		head7.setX(270);
		head7.setY(310);
		head7.setSize(30);
		head7.setFillColor(Color.pink);
		
		head8 = new Square();
		head8.setX(300);
		head8.setY(310);
		head8.setSize(60);
		head8.setFillColor(Color.black);
		
		head9 = new Square();
		head9.setX(330);
		head9.setY(310);
		head9.setSize(30);
		head9.setFillColor(Color.pink);
		
		head10 = new Square();
		head10.setX(330);
		head10.setY(280);
		head10.setSize(30);
		head10.setFillColor(Color.black);
		
		head11 = new Square();
		head11.setX(300);
		head11.setY(280);
		head11.setSize(30);
		head11.setFillColor(Color.black);
	
		head12 = new Square();
		head12.setX(310);
		head12.setY(280);
		head12.setSize(30);
		head12.setFillColor(Color.black);
		
		head13 = new Square();
		head13.setX(270);
		head13.setY(280);
		head13.setSize(30);
		head13.setFillColor(Color.black);
		
		head14 = new Square();
		head14.setX(330);
		head14.setY(370);
		head14.setSize(60);
		head14.setFillColor(Color.pink);
		
		head15 = new Square();
		head15.setX(360);
		head15.setY(370);
		head15.setSize(60);
		head15.setFillColor(Color.pink);
		
		head16 = new Square();
		head16.setX(360);
		head16.setY(310);
		head16.setSize(60);
		head16.setFillColor(Color.pink);
		
		head17 = new Square();
		head17.setX(420);
		head17.setY(310);
		head17.setSize(120);
		head17.setFillColor(Color.pink);
		
		head18 = new Square();
		head18.setX(510);
		head18.setY(400);
		head18.setSize(30);
		head18.setFillColor(Color.blue);
		
		head19 = new Square();
		head19.setX(510);
		head19.setY(370);
		head19.setSize(30);
		head19.setFillColor(Color.black);
		
		head20 = new Square();
		head20.setX(480);
		head20.setY(370);
		head20.setSize(30);
		head20.setFillColor(Color.black);
		
		head21 = new Square();
		head21.setX(450);
		head21.setY(370);
		head21.setSize(30);
		head21.setFillColor(Color.black);
		
		head22 = new Square();
		head22.setX(420);
		head22.setY(370);
		head22.setSize(30);
		head22.setFillColor(Color.black);
		
		head23 = new Square();
		head23.setX(450);
		head23.setY(340);
		head23.setSize(30);
		head23.setFillColor(Color.black);
		
		head24 = new Square();
		head24.setX(540);
		head24.setY(340);
		head24.setSize(30);
		head24.setFillColor(Color.pink);
		
		head25 = new Square();
		head25.setX(420);
		head25.setY(310);
		head25.setSize(30);
		head25.setFillColor(Color.black);
		
		head26 = new Square();
		head26.setX(420);
		head26.setY(280);
		head26.setSize(30);
		head26.setFillColor(Color.black);
		
		head27 = new Square();
		head27.setX(390);
		head27.setY(280);
		head27.setSize(30);
		head27.setFillColor(Color.pink);
		
		head28 = new Square();
		head28.setX(360);
		head28.setY(280);
		head28.setSize(30);
		head28.setFillColor(Color.pink);
		
		head29 = new Square();
		head29.setX(450);
		head29.setY(280);
		head29.setSize(30);
		head29.setFillColor(Color.pink);
		
		hat1 = new Square();						//the hat starts
		hat1.setX(510);
		hat1.setY(250);
		hat1.setSize(30);
		hat1.setFillColor(Color.red);
		
		hat2 = new Square();
		hat2.setX(480);
		hat2.setY(250);
		hat2.setSize(30);
		hat2.setFillColor(Color.red);
		
		hat3 = new Square();
		hat3.setX(450);
		hat3.setY(250);
		hat3.setSize(30);
		hat3.setFillColor(Color.red);
		
		hat4 = new Square();
		hat4.setX(390);
		hat4.setY(220);
		hat4.setSize(60);
		hat4.setFillColor(Color.red);
		
		hat5 = new Square();
		hat5.setX(330);
		hat5.setY(220);
		hat5.setSize(60);
		hat5.setFillColor(Color.red);
		
		hat6 = new Square();
		hat6.setX(270);
		hat6.setY(220);
		hat6.setSize(60);
		hat6.setFillColor(Color.red);
		
		hat7 = new Square();
		hat7.setX(270);
		hat7.setY(220);
		hat7.setSize(30);
		hat7.setFillColor(Color.blue);
		
		firstCircle = new Circle();				//first circle is a part of a cloud
		firstCircle.setX(60);					
		firstCircle.setY(50);					
		firstCircle.setRadius(35);				
		firstCircle.setFillColor(Color.white);	
		
		secondCircle = new Circle();			//second circle is a part of a cloud
		secondCircle.setX(100);
		secondCircle.setY(70);
		secondCircle.setRadius(40);
		secondCircle.setFillColor(Color.white);
		
		thirdCircle = new Circle();				//third circle is a part of a cloud
		thirdCircle.setX(140);
		thirdCircle.setY(65);
		thirdCircle.setRadius(40);
		thirdCircle.setFillColor(Color.white);
		

		ground = new Square();			// the ground 
		ground.setX(0);					
		ground.setY(700);				
		ground.setSize(850);			
		ground.setFillColor(Color.green); 
		
	
		
	}
	
	public void paint(Graphics g)
	{
					
		shoe1.paintComponent(g);				//shoes are painted
		shoe2.paintComponent(g);
		shoe3.paintComponent(g);
		shoe4.paintComponent(g);
		shoe5.paintComponent(g);
		shoe6.paintComponent(g);
		shoe7.paintComponent(g);
		shoe8.paintComponent(g);
		shoe9.paintComponent(g);
		shoe10.paintComponent(g);
		shoe11.paintComponent(g);
		shoe12.paintComponent(g);
		shoe13.paintComponent(g);
		shoe14.paintComponent(g);
		shoe15.paintComponent(g);
		shoe16.paintComponent(g);
		shoe17.paintComponent(g);
		shoe18.paintComponent(g);
		shoe19.paintComponent(g);
		shoe20.paintComponent(g);
		shoe21.paintComponent(g);
		shoe22.paintComponent(g);
		shoe23.paintComponent(g);
		shoe24.paintComponent(g);
		shoe25.paintComponent(g);
		shoe26.paintComponent(g);
		body1.paintComponent(g);				//the body is painted
		body2.paintComponent(g);
		body3.paintComponent(g);
		body4.paintComponent(g);
		body5.paintComponent(g);
		body6.paintComponent(g);
		body7.paintComponent(g);
		body8.paintComponent(g);
		body9.paintComponent(g);
		body10.paintComponent(g);
		body11.paintComponent(g);
		body12.paintComponent(g);
		body13.paintComponent(g);
		body14.paintComponent(g);
		body15.paintComponent(g);
		body16.paintComponent(g);
		body17.paintComponent(g);
		body18.paintComponent(g);
		body19.paintComponent(g);
		chest1.paintComponent(g);
		chest2.paintComponent(g);
		leftArm1.paintComponent(g);					//the left arm is painted
		leftArm2.paintComponent(g);
		leftArm3.paintComponent(g);
		leftArm4.paintComponent(g);
		leftArm5.paintComponent(g);
		leftArm6.paintComponent(g);
		leftArm7.paintComponent(g);
		rightArm1.paintComponent(g);				//the right arm is painted
		rightArm2.paintComponent(g);
		rightArm3.paintComponent(g);
		rightArm4.paintComponent(g);
		rightArm5.paintComponent(g);
		rightArm6.paintComponent(g);
		head1.paintComponent(g);					//the head is painted	
		head2.paintComponent(g);
		head3.paintComponent(g);
		head4.paintComponent(g);
		head5.paintComponent(g);
		head6.paintComponent(g);
		head7.paintComponent(g);
		head8.paintComponent(g);
		head9.paintComponent(g);
		head10.paintComponent(g);
		head11.paintComponent(g);
		head12.paintComponent(g);
		head13.paintComponent(g);
		head14.paintComponent(g);
		head15.paintComponent(g);
		head16.paintComponent(g);
		head17.paintComponent(g);
		head18.paintComponent(g);
		head19.paintComponent(g);
		head20.paintComponent(g);
		head21.paintComponent(g);
		head22.paintComponent(g);
		head23.paintComponent(g);
		head24.paintComponent(g);
		head25.paintComponent(g);
		head26.paintComponent(g);
		head27.paintComponent(g);
		head28.paintComponent(g);
		head29.paintComponent(g);
		hat1.paintComponent(g);						//the hat is painted
		hat2.paintComponent(g);
		hat3.paintComponent(g);
		hat4.paintComponent(g);
		hat5.paintComponent(g);
		hat6.paintComponent(g);
		hat7.paintComponent(g);
		firstCircle.paintComponent(g);				//clouds are painted
		secondCircle.paintComponent(g);
		thirdCircle.paintComponent(g);
		ground.paintComponent(g);		// paints the ground
											
		
		      							
	}
	
}
