import java.util.Scanner;
public class day5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int total = 0;
double percentage;
System.out.println("Enter the marks for 5 Subjects");
int arr[] = new int[5];
for(int i = 0; i<5; i++){
 arr[i] = sc.nextInt();
if(arr[i]<33){
System.out.println("Fail");
return;
}
else{
	total += arr[i];
}
}
percentage = ((double)total/500)*100;
System.out.println("Total: " + total+"/500");
System.out.println("Percentage: " + percentage);
System.out.println("Pass");
if(percentage>90){
System.out.println("Grade: A");
}else if(percentage>75){
System.out.println("Grade: B");
}else if(percentage>50){
System.out.println("Grade: C");
}else{
System.out.println("Grade: D");
}
}
}
