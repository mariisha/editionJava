package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final int SIZE = 5;
    static final char DOT_EMPTY = '.';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final String FERST_EMPTY = "j";
    static final String EMPTY = " ";
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    static char[][] map = new char[SIZE][SIZE];

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        private static void printMap() {
            mapHeader();
            mapMapRow();
        }

     private static void mapHeader() {
         System.out.print(FERST_EMPTY);
         for (int i = 0; i < SIZE; i++) {
            System.out.print(EMPTY + (i + 1));
         }
         System.out.println();
    }

    private static void mapMapRow() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        humanTurn();
        printMap();
        chekEnd(DOT_HUMAN);

        //   aiTurn();
        //  printMap();
        //   chekEnd();
    }

        private static void humanTurn() {
        int rowNamber;
        int colNamber;
        do {
            System.out.println();
            System.out.println("Ход человека. Введите номер строки ");
            rowNamber = scanner.nextInt();
            System.out.println("Ход человека. Введите номер столбца ");
            colNamber = scanner.nextInt();
        } while (!isCellValid(rowNamber,colNamber));
            map[rowNamber-1][colNamber-1] = DOT_HUMAN;

    }

    private static boolean isCellValid(int rowNamber, int colNamber,boolean isAi){
        if (!isAi && (rowNamber < 1) || (rowNamber > SIZE) || (colNamber < 1) || (colNamber > SIZE)){
            System.out.printf(" Неверное число. Введите еще раз! Введите числа от 1 до %d",SIZE);
            return false;
        }
        if (map[rowNamber][colNamber] != DOT_EMPTY) {
            System.out.println("Ячейка занята! Введите другие значения");
            return false;
        }
        return true;
    }

    private static boolean isCellValid(int rowNamber, int colNamber) {
        return isCellValid(rowNamber,colNamber,false);
    }
    private static void chekEnd(char symbol) {
        boolean isEnd = false;



        if (!isEnd && isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }


        if (isEnd) {
           System.exit(0);
        }
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
