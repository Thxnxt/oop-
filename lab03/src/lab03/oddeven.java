import java.util.*;
public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;
        while (num != -1){
            num = sc.nextInt();
            if (num%2 == 0){
                even += 1;
            }else{
                odd += 1;
            }
        }
        System.out.print("Odd number = ");
        System.out.print(odd);
        System.out.print(" Even number = ");
        System.out.println(even);
    }
}
