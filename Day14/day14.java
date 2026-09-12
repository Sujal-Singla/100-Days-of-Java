import java.util.Scanner;
public class day14{
public static void main(String[] args){
int total = 0;
double avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of student: ");
int stdNum = sc.nextInt();
int[] arr = new int[stdNum];
int highest = 0;
int lowest = Integer.MAX_VALUE;
System.out.println("Enter the marks of the student: ");
for(int i = 0; i<stdNum; i++){
arr[i] = sc.nextInt();
total = total + arr[i];
if(highest<arr[i]){
highest = arr[i];
}
if(lowest>arr[i]){
lowest = arr[i];
}
}
avg = ((double)total/stdNum);

System.out.println("Average: " + avg);
System.out.println("Highest: " + highest);
System.out.println("Lowest: " + lowest);
}
}
