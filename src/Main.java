import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , toplam = 0, mod = 0;

        System.out.println("Bir sayı giriniz:");

        a = sc.nextInt();

        while(a != 0){
            mod = a % 10;
            a /= 10;
            toplam += mod;

        }
        System.out.println(toplam);

    }
}
