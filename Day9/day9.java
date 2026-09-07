import java.util.*;
public class day9{
public static void main(String[] args){
int exit = 0;
Scanner sc = new Scanner(System.in);
List <String> li = new ArrayList<>();
while(exit!=1){
System.out.println("========== PLAYLIST MANAGER ==========");
System.out.println("1. Add Song");
System.out.println("2. Remove Song");
System.out.println("3. Search Song");
System.out.println("4. Display Playlist");
System.out.println("5. Reverse Playlist");
System.out.println("6. Clear Playlist");
System.out.println("7. Exit");
System.out.println("Enter choice");
int num = sc.nextInt();
sc.nextLine();
switch(num){
case 1:
System.out.println("Enter Song");
String song = sc.nextLine();
li.add(song);
System.out.println("Song added");
break;
case 2:
System.out.println("song to remove?");
String removeSong = sc.nextLine();
if(li.remove(removeSong)){
System.out.println("Song removed successfully");
}else{
System.out.println("Song not found");
}
break;
case 4:
System.out.println("The playlist:");
for(int i = 0; i<li.size(); i++){
System.out.println((i+1) + " ." + li.get(i));
}
break;
case 3:
System.out.println("Search Song: ");
String searchSong = sc.nextLine();
if(li.contains(searchSong)){
System.out.println("Song found");
}else{
System.out.println("Song not  found");
}
break;
case 5:
Collections.reverse(li);
System.out.println("Playlist reversed");
break;
case 6:
li.clear();
System.out.println("The playlist is cleared!");
break;
case 7:
System.out.println("Playlist manager closed.");
exit = 1;
break;
default:
System.out.println("Invalid number entered");
}
}
}
}
