import java.util.Scanner;

public class wether {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите количество дней");
        int x =scan.nextInt();
        int y;
        int col = 0;
        int max =0;
        for(int i=0;x>i;++i){
            System.out.println("Введите колличество осадков в "+( i+1)+" день");
             y =scan.nextInt();
        col=col+ y;
        if(max<y) {
            max = y;
            }

        }
        double sr =col/x;
        System.out.println("Количество дней="+x);
        System.out.println("Сумма осадков="+col);
        System.out.println("Среднее количество за этот период"+sr);
        System.out.println("Максимальное колличество осадков в день"+max);
    }
}
