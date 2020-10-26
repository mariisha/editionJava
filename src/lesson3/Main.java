package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int control = 0;

        System.out.println("Игра УГАДАЙ ЧИСЛО начинаем ");

        while (control == 0){
            control = guessNam(control);
        }
        System.out.println("GAME OVER");
    }

        static int guessNam(int control){

            Scanner sc = new Scanner(System.in);
            int range = 9;
            int statnum = (int)(Math.random() * range);
            int attempt = 3;

            System.out.println("Введите число от 0 до " + range);
            int a = sc.nextInt();
            for (int i = 1; i <= attempt; i++) {

            if (a < statnum && i < attempt) {
                System.out.println("Ваше число меньше! Введите другое число!");
                a = sc.nextInt();
            } else if (a > statnum && i < attempt) {
                System.out.println("Ваше число больше! Введите другое число!");
                a = sc.nextInt();
            } else if (a != statnum && i == attempt) {
                System.out.println("Вы не угадали! Попыток больше нет!");
                System.out.println("Играть заново - 1, завершить  - 0 ");
                int b = sc.nextInt();
                if (b == 1) {
                    return 0;
                } else {
                    return 1;
                }
            }
              else {
                System.out.println("Вы угадали!");
                break;
                }
        }
            return 1;
    }
}

