package lesson44;

import java.util.Arrays;

public class ChekTikTok {
    //static final char[][] map = {{1,1,1,0,0},{1,0,0,0,0},{1,0,0,0,0},{1,0,0,0,0},{1,0,0,0,0}};
    static final char[][] map = {{1,1,1,0,0},{1,1,0,0,0},{1,1,0,0,0},{1,0,0,0,0},{1,0,0,0,0}};
    static final int CHEK_SIZE = 3;
    static final int SIZE = 5;

    public static void main(String[] args) {


        System.out.println(chekAll(1,1));
    }

    private static boolean chekAll(int rowNamber,int colNamber) {
                return chekStri(rowNamber,colNamber);
    }

    private static boolean chekStri(int rowNamber,int colNamber) {
        if (rowNamber == 1) {
            return chekTwoLR(rowNamber, colNamber, 2);
        }
        if (rowNamber == SIZE) {
            return chekTwoLR(rowNamber, colNamber, -2);
        }
        if (rowNamber != 1 && rowNamber != SIZE) {
            return chekTwoLR(rowNamber, colNamber, 0);
        }
        return false;
    }
    private static boolean chekTwoLR(int rowNamber,int colNamber,int shiftNumber){
        if (shiftNumber > 0) {
            for (int i = 0; i < CHEK_SIZE-1 ; i++) {
                if (map[rowNamber-1][i+shiftNumber-1] != map[rowNamber-1][colNamber-1]){
                    return false;
                }
            }
            return true;
        } else{
            for (int i = SIZE; i > SIZE-CHEK_SIZE ; i--) {
                if (map[rowNamber-1][i+shiftNumber-1] != map[rowNamber-1][colNamber-1]){
                    return false;
                }
            }
        }
        return true;
    }

}
