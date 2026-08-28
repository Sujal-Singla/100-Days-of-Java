import java.util.Scanner;
public class day3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the  first number: ");
double n1 = input.nextDouble();
System.out.println("Enter the operator(%,*,-,+,/)");
String operator = input.next();
input.nextLine();
System.out.println("Enter the  Second number: ");
double n2 = input.nextDouble();
switch (operator){
case "%":
System.out.println("Result: " + (n1%n2));
break;
case "*":
System.out.println("Result: " + (n1*n2));
break;
case "-":
System.out.println("Result: "+  (n1-n2));
break;
case "+":
System.out.println("Result: "+ (n1+n2));
break;
case "/":
System.out.println("Result: " + (n1/n2));
break;
default:
System.out.println("Invalid Operator");
}
}
}
