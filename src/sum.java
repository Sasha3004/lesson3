import java.util.Random;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        int y=0;
        int z=0;
        for (int i = 0; x>0; i++) {
           z=x%10;
           x=x/10;
           y=y+z;
        }
        System.out.print(y);
    }
}







