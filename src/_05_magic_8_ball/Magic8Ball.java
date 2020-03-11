//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randy=new Random();
int num=randy.nextInt(4);
	// 3. Print out this variable
System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null,"enter a question");
	// 5. If the random number is 0
if(num==0) {
	JOptionPane.showMessageDialog(null,"dont ask me ask your mom");
}

	// -- tell the user "Yes"

	// 6. If the random number is 1
if(num==1) {
	JOptionPane.showMessageDialog(null,"try again");
}
	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
if(num==2) {
	JOptionPane.showMessageDialog(null,"to addicted google is smatter then you ask google please");
}

	// 8. If the random number is 3
if(num==3) {
	JOptionPane.showMessageDialog(null,"the answer was a answer");
}
	
	// -- write your own answer
}
}
