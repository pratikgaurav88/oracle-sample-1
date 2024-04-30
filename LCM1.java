import java.util.*;
public class LCM1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int lcm=0;
        for(int i=Math.max(a,b);i<=(a*b);i++){
            System.out.println("Value of I :: " + i);
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
        scanner.close();
    }
}