
import java.util.Scanner;

public class day1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter you name: ");
String Name = sc.nextLine();
System.out.println("Enter your age: ");
int age = sc.nextInt();
sc.nextLine();
System.out.println("Enter your city: ");
String city = sc.nextLine();
System.out.println("----- My Introduction -----");
System.out.println("Name: " + Name);
System.out.println("Age :" + age);
System.out.println("City :" + city);
System.out.println("---------------------------");
}
}
