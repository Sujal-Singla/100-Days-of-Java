import java.util.Scanner;
public class day10{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int exit = 1;
int num1;
int num2;
int n;
System.out.println("=== CALCULATOR ===");
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Remainder");
System.out.println("6. Exit");
while(exit != 0){
System.out.println("\nChoose: ");
n = sc.nextInt();
switch(n){
case 1:
System.out.println("Enter the first Number");
num1 = sc.nextInt();
System.out.println("Enter the second Number");
num2 = sc.nextInt();
System.out.println("Result: " + (num1 + num2));
break;
case 2:
System.out.println("Enter the first Number");
num1 = sc.nextInt();
System.out.println("Enter the second Number");
num2 = sc.nextInt();
System.out.println("Result: " + (num1 - num2));
break;
case 3:
System.out.println("Enter the first Number");
num1 = sc.nextInt();
System.out.println("Enter the second Number");
num2 = sc.nextInt();
System.out.println("Result: " + (num1 * num2));
break;
case 4:
System.out.println("Enter the first Number");
num1 = sc.nextInt();
System.out.println("Enter the second Number");
num2 = sc.nextInt();
if(num2 == 0){
System.out.println("Cannot Divide by 0");
}else{
System.out.println("Result: " + (double)(num1/num2));
}
break;
case 5:
System.out.println("Enter the first Number");
num1 = sc.nextInt();
System.out.println("Enter the second Number");
num2 = sc.nextInt();
System.out.println("Result: " + (num1%num2));
break;
case 6:
System.out.println("Calculator Closed");
exit = 0;
break;
default:
System.out.println("Invalid Number Entered");
break;
}
}
}
}
