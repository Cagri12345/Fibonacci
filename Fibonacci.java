package Basic;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Fibonacci eleman sayısını girin: ");
        n = input.nextInt();

        //İlk iki fibonacci sayısı
        int f=0,s=1;

        //Fibonacci hesaplama
        for(int i = 0 ; i <= n ; i++){
            System.out.print(f + " ");

            int c = f + s;
            f = s;
            s = c;

        }
    }
}
