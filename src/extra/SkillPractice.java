package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	//skills.skill1();
          	//skills.skill2();
          	//skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
	
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int d = Integer.parseInt(dimes);


// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, d*10);



// Ask the user how tall they are (inches)
String inches = JOptionPane.showInputDialog("How tall are you (in inches)?");
int i = Integer.parseInt(inches);


// If they are shorter than 36 inches, tell them to eat their Wheaties
if (i > 36) {
	JOptionPane.showMessageDialog(null, "You need to eat your Wheaties.");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i < 31; i+=3) {
	System.out.println(i);
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random randy = new Random();
int randint = randy.nextInt(20);
System.out.println(randint);
// Get another random number that is less than 10 and print it to the console 
Random robot = new Random();
int robint = robot.nextInt(10);
System.out.println(robint);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, (randint-robint));


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}


// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 3;
if (cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
else {
	JOptionPane.showMessageDialog(null, "");
}


// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is a fantastic school.");


}
}

