import java.util.*;

public class Test{
public static void main(String[] args){
System.out.print("num = ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

int ram = new Random().nextInt(9);

if(num == ram){
System.out.println("OK");
}
else{
System.out.println("NG");
}
System.out.println("num = " + num);
System.out.println("ram = " + ram);
}
}
