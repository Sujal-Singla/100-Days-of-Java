import java.util.Scanner;
public class day12{
public static void isPrime(int n1, int n2){
if(n1>n2){
int temp = n1;
n1 = n2;
n2 = temp;
}

System.out.println("Prime numbers between " + n1 + " and " + n2 + ":");

for(int num = n1; num <= n2; num++){
if(num<2){
continue;
}

boolean prime = true;
for(int i = 2; i<num; i++){
if(num % i == 0){
prime = false;
break;
}
}
if(prime){
System.out.println(num);
}
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number 1: ");
int num1 = sc.nextInt();
System.out.println("Enter the number 2: ");
int num2 = sc.nextInt();
isPrime(num1, num2);

sc.close();
}
}

