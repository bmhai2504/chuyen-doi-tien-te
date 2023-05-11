import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien (USD): ");
        long usd = scanner.nextLong();

        long vnd = usd * 23000;
        System.out.printf("%d USD = %d VND", usd, vnd);
    }
}