import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Matrica matrica = new Matrica(4, 4);
        System.out.println();
        matrica.clogenie(matrica.mas1, matrica.mas2);
        System.out.println("Введите число, на которое вы хотите умножить матрицу: ");
        int a = in.nextInt();
        matrica.ymnNaCh(a, matrica.mas2);
        System.out.println("Результат перемножения матриц: ");
        matrica.ymnNaMat(matrica.mas1, matrica.mas2);
    }
}
