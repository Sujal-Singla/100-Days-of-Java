import java.util.Scanner;
public class day4{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the price: ");
double price = sc.nextDouble();
System.out.print("Enter quantity: ");
double quan = sc.nextDouble();
System.out.print("Enter discount (%): ");
double disc = sc.nextDouble();
System.out.print("Enter tax (%): ");
double tax = sc.nextDouble();
System.out.println();
double subtotal = price*quan;
double discount = subtotal*(disc/100);
double taxAmount = (subtotal - discount)*(tax/100);
System.out.println("Subtotal: " + subtotal);
System.out.println("Discount: " + discount);
System.out.println("Tax: " + taxAmount);
System.out.println("Final Total: " + (subtotal - discount + taxAmount));

}
}
