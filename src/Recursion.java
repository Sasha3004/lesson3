import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scan.nextInt();
        System.out.println(fibonachi(x));
    }

    static int fibonachi(int x){

        if (x==0){
            return 0;
        }
    if (x==1){
            return 1;
    }
    else {

            return fibonachi(x-1)+fibonachi(x-2);
    }
    }
}
