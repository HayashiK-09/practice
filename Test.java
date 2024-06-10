import java.util.*;

public class Test{
public static void main(String[] args){
System.out.print("1桁の数字を入力してください＞");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

int ram = new ramdom().nextInt(9);

if(num == ram){
System.out.println("一致");
}
else{
System.out.println("不一致");
}
System.out.println("num = " + num);
System.out.println("ram = " + ram);
}
}
