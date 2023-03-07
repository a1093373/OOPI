import java.util.*;

public class A1093373_0224_2{
    public static void main(String args[]) {
        System.out.printf("請輸入攝氏溫度： ");
        Scanner temp = new Scanner(System.in);
        int temp2 = temp.nextInt();
        System.out.println("換算為華氏溫度為：" + (temp2 * 9 / 5 + 32));
    }
}
