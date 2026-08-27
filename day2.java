import java.util.Scanner;
public class day2{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter your Name");
String name = in.nextLine();
System.out.println("Enter your Age");
int age = in.nextInt();
System.out.println("Enter Your height");
double height = in.nextDouble();
System.out.println("Are you a Student");
boolean student = in.nextBoolean();
in.nextLine();
System.out.println("What are your grade");
String grade = in.nextLine();
System.out.println();
System.out.println("===== PERSONAL INFO =====");
System.out.println("Name: " + name);
System.out.println("Age: "+ age);
System.out.println("Height: " + height);
System.out.println("Student: " +student);
System.out.println("Grade: " +grade);
System.out.println	 ("=========================");
System.out.println();
System.out.println("Enter your marks in Subject 1");
int subject1= in.nextInt();
System.out.println("Enter your makrs in Subject 2");
int subject2 = in.nextInt();
System.out.println("Enter Your marks in subject 3");
int subject3 = in.nextInt();
double total = subject1 + subject2 + subject3;
System.out.println();
System.out.println("Subject 1: " + subject1);
System.out.println("Subject 2: "+ subject2);
System.out.println("Subject 3: " + subject3);
System.out.println("Total: " +total);
System.out.println("Average: " +(total/3));
System.out.println();
System.out.println("Enter the original fees");
double fees = in.nextDouble();
System.out.println("Original Fees: " + fees);
System.out.println("Converted Fees: " + (int)fees);
System.out.println();
System.out.println("Enter the number 1");
double number1 = in.nextDouble();
System.out.println("Enter the second number");
double number2 = in.nextDouble();
System.out.println();
System.out.println("Number 1 :" + number1);
System.out.println("Number 2 :" + number2);
System.out.println("Addition: " + (number1 + number2));
System.out.println("Subtraction: " +(number1 - number2));
System.out.println("Multiplication: " +( number1*number2));
if(number2 == 0){
System.out.println("Cannot divide by 0");
}else{
System.out.println("Division: " +(number1/number2));
}
System.out.println("Remainder: " + (number1%number2));
}
}
