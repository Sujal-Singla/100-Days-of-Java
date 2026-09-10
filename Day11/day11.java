import java.util.Scanner;
public class day11{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers?");
int num = sc.nextInt();
int[] arr = new int[num];
int sum = 0;
int min =  Integer.MAX_VALUE;
int max = arr[0];
System.out.println("Enter " + num + " numbers");
for(int i = 0; i<num; i++){
arr[i] = sc.nextInt();
sum += arr[i];
if(max<arr[i]){
max = arr[i];
}
if(min>arr[i]){
min = arr[i];
}
}
System.out.println("Count: "+ num);
System.out.println("Sum: " + sum);
System.out.println("Minimum: " + min);
System.out.println("Maximum: " + max);
System.out.println("Average: " + (double)(sum/num));
}
}
