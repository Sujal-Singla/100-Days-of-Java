import java.util.Scanner;
public class day7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("=== NUMBER UTILITY ===");
System.out.println("1. Count 1 to N");
System.out.println("2. Sum 1 to N");
System.out.println("3. Show Even Numbers");
System.out.println("4. Exit");
int exit = 0;
while(exit != 1){

System.out.println("Enter the number you choose");
int num = sc.nextInt();
int n;
switch(num){
//System.out.println("Enter the number to count");
//int n = sc.nextInt();
case 1:
System.out.println("Enter the number to count");
n = sc.nextInt();
for(int i = 1; i<=n; i++){
System.out.println(i);
}
break;
case 2:
int sum = 0;
System.out.println("Enter the number to sum");
n = sc.nextInt();
for(int  i = 0; i<=n; i++)
{
sum = sum + i;
}
System.out.println("Sum :" + sum);
break;
case 3:
System.out.println("Enter the number to show even numbers");
n = sc.nextInt();
for (int i = 0; i<=n; i+=2){
System.out.println(i);
}
break;
case 4:
System.out.println("Utility closed");
exit = 1;
break;
default:
System.out.print("Invalid number choosed");
}
}
}
}
