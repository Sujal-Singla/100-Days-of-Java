import java.util.Scanner;
public class day8{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n;
System.out.println("=== PATTERN & TABLE ===");
System.out.println("1. Star Triangle");
System.out.println("2. Multiplication Table");
System.out.println("Choose the number to perform task");
int num = sc.nextInt();
switch(num){
case 1:
System.out.println("Enter the number of rows");
n = sc.nextInt();
for(int i = 1; i<=n; i++){
for(int j = 1; j<=i; j++){
System.out.print("*");
}
System.out.println();
}
break;
case 2:
System.out.println("Enter the number to get table");
n= sc.nextInt();
for(int i = 1; i<=10; i++){
System.out.println(n + " x " + i + " = " + (n*i));
}
break;
default:
System.out.println("Invalid Number chosen");
}
}
}
