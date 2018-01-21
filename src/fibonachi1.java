import java.util.Scanner;

public class fibonachi1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scan.nextInt();
        int y = 1;
        int z = 2;
        for (int i = 0; z < x; i++) {
            y += y;
            z += z;
        }
        System.out.println(y);

    }

}
