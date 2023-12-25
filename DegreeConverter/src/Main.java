import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер температуры!");
        // Приоброзование градусов по Цельсию в градусы по Фаренгейту. Формула: (F = C * 1.8 + 32).

        System.out.println("Введите градусы по цельсию:");
        int degreeCelsius = new Scanner(System.in).nextInt();

        double coof1 = 1.8;
        int coof2 = 32;

        System.out.println(degreeCelsius + " градусов по Цельсию это: " + (degreeCelsius * coof1 + coof2) + " градусов по Фаренгейту.");
    }
} 