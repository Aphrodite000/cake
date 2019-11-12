import java.util.Scanner;

public class 最小公倍数 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int i=1;
        while (i<=a*b){
            if(i%a==0&&i%b==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
