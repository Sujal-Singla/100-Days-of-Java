import java.util.Scanner;
public class day6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("=== UNIT CONVERTER ===");
System.out.println("1. Kilometres to Metres");
System.out.println("2. Metres to Centimetres");
System.out.println("3. Celsius to Fahrenheit");
System.out.println("Choose any number from above to convert");
int num = sc.nextInt();
if(num>3 || num<0){
System.out.println("Invalid Choice");
return;
}
System.out.println("Enter the value to convert");
double val = sc.nextDouble();
switch(num){
case 1:
System.out.println("Result: " + (val*1000) + " KM");
break;
case 2:
System.out.println("Result: " +(val*100) + " CM");
break;
case 3:
System.out.println("Result: " + ((9*(val))/5 + 32) + "F");
break;
default:
System.out.println("Some error occured");
break;
}
}
}
