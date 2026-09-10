import java.util.Scanner;
public class day13{

static int fact(int n1){
if(n1 == 0 || n1 == 1){
return 1;
}
return n1 * fact(n1-1);
}


static void fibo(int n1){
int firstTerm = 0;
int secondTerm = 1;

for(int i = 0; i<n1; i++){
System.out.print(firstTerm + ", ");
int nextTerm = firstTerm + secondTerm;

firstTerm = secondTerm;
secondTerm = nextTerm;
}
System.out.println();
}


static int gcd(int n1, int n2){
n1 = Math.abs(n1);
n2 = Math.abs(n2);

while(n2!=0){
int remainder = n1%n2;
n1 = n2;
n2 = remainder;
}
return n1;
}


static int lcm(int n1, int n2){
if(n1 == 0 || n2 == 0){
System.out.println("LCM: 0");
return 0;
}
int gcdValue = gcd(n1,n2);
int lcmValue = Math.abs((n1/gcdValue)*n2);

return lcmValue;
}



static double power(double n1, double n2){
if(n1 == 0){
return 0;
}
if(n1 == 1){
return 1;
}
return Math.pow(n1,n2);
}


static int digitSum(int n1){
int sum = 0;
n1 = Math.abs(n1);
while(n1 != 0){
sum = sum + (n1%10);
n1 = n1/10;
}
return sum;
}


public static void main(String[] args){


Scanner sc = new Scanner(System.in);
int n1,n2;

System.out.println("=== NUMBER TOOLKIT ===");
System.out.println("1. Factorial");
System.out.println("2. Fibonacci");
System.out.println("3. GCD");
System.out.println("4. LCM");
System.out.println("5. Power");
System.out.println("6. Digit Sum");
System.out.println("7. Exit");


int exit = 0;
double result;

while(exit != 1){
System.out.println("Choose: ");
int num = sc.nextInt();
switch(num){

case 1:
System.out.println("Enter the number: ");
n1 = sc.nextInt();
result = fact(n1);
System.out.println("Factorial: " + result);
break;

case 2:
System.out.println("Enter the number: ");
n1 = sc.nextInt();
fibo(n1);
break;

case 3:
System.out.println("Enter first number: ");
n1 = sc.nextInt();
System.out.println("Enter the second Number: ");
n2 = sc.nextInt();
result = gcd(n1,n2);
System.out.println("GCD: " + result);
break;

case 4:
System.out.println("Enter first number: ");
n1 = sc.nextInt();
System.out.println("Enter the second Number: ");
n2 = sc.nextInt();
result = lcm(n1,n2);
System.out.println("LCM: " + result);
break;

case 5:
System.out.println("Enter first number: ");
n1 = sc.nextInt();
System.out.println("Enter the second Number: ");
n2 = sc.nextInt();
result = power(n1,n2);
System.out.println("Power: " + result);
break;

case 6:
System.out.println("Enter the number ");
n1 = sc.nextInt();
result = digitSum(n1);
System.out.println("Digit Sum: " + result);
break;

case 7:
System.out.println("Mathematical Number Toolkit Exited Successfully");
exit = 1;
break;

default:
System.out.println("Invalid Number Chosen");
break;
}
}
}
}
