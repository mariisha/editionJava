package lesson2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int ASIZE ;

        //урок 2 задание 1
        array_invers();

        //урок 2 задание 2
        arrayPlusThree();

        //урок 2 задание 3
        arrayMultiply();

        //урок 2 задание 4
        arrayDiag();

        //урок 2 задание 5
        arrayMinMax();

        //урок 2 задание 6
        int[] arrayTwoo = {2,2,2,1,2,2,10,1};
        System.out.println(arrayEqually(arrayTwoo));
        int[] arrayTwooo = {1,1,1,2,1};
        System.out.println(arrayEqually(arrayTwooo));

        //урок 2 задание 7
        int[] arrayTw = {1,2,3,4,5,6,7};
        arrayShift(arrayTw,5);
    }
    static void array_invers() {

        int ASIZE = 10;
        int[] arrayInvers = new int[ASIZE];
        arrayInvers[0] = 1;
        arrayInvers[1] = 1;
        arrayInvers[4] = 1;
        arrayInvers[6] = 1;
        arrayInvers[7] = 1;

        System.out.println(Arrays.toString(arrayInvers));

        for (int i = 0; i < ASIZE; i++) {
            if (arrayInvers[i] == 1) {
                arrayInvers[i] = 0;
            } else {
                arrayInvers[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arrayInvers));
    }

    static void arrayPlusThree(){

        int ASIZE = 8;
        final int STEP = 3;
        int[] arrayThree = new int[ASIZE];

        for (int i = 1; i < ASIZE; i++) {
            arrayThree[i] = arrayThree[i-1] + STEP;
        }

        System.out.println(Arrays.toString(arrayThree));

        }

        static void arrayMultiply(){

            int ASIZE = 12;
            int[] arrayTwoo = {1,5,3,2,11,4,5,2,4,8,9,1};

            for (int i = 0; i < ASIZE; i++) {
                if (arrayTwoo[i] < 6)
                    arrayTwoo[i] = arrayTwoo[i] * 2;
            }
            System.out.println(Arrays.toString(arrayTwoo));
        }

        static void arrayDiag(){

            int ASAIZ = 5;
            int[][] arrayDiag = new int[ASAIZ][ASAIZ];
            int j;

            for (int i = 0; i < ASAIZ; i++) {
                j = ASAIZ-1-i;
                arrayDiag[i][i] = 1;
                arrayDiag[i][j] = 1;

            }
            System.out.println(Arrays.deepToString(arrayDiag));
        }

        static void arrayMinMax(){
            int ASIZE = 10;
            int[] arrayMinMax = {10,5,20,5,25,-1,20,10,30,40};
            int aMin = 0;
            int aMax = 0;

            int i=0;
            while (i < ASIZE){
                if (aMax < arrayMinMax[i]){
                    aMax = arrayMinMax[i];
                }
                if (aMin > arrayMinMax[i]){
                    aMin = arrayMinMax[i];
                }
                i++;
            }
            System.out.println(aMax);
            System.out.println(aMin);
        }

        static boolean arrayEqually(int[] arrayEqually){

            int i ;

            for ( i=0; i < arrayEqually.length; i++) {
                int sumleft = 0;
                int sumright = 0;

                for (int j = 0; j <= i; j++) {
                    sumleft = sumleft + arrayEqually[j];
                }
                for (int j = i+1; j < arrayEqually.length; j++) {
                    sumright = sumright + arrayEqually[j];
                }
                if (sumleft == sumright){
                    System.out.println("Граница после элемента "+ (i+1));
                    return true;
                }
            }
            return false;
        }

        static void arrayShift(int[] arrayShift, int num){
            int i;
            int prom;
            int promIndN;

            promIndN = arrayShift.length-1;
            if (num < 0){
               num = arrayShift.length + num;
            }

            System.out.println(Arrays.toString(arrayShift));

            for (int j = 1; j <= num ; j++) {
                prom = arrayShift[promIndN];

                for ( i = promIndN; i > 0 ;i--) {
                    arrayShift[i] = arrayShift[i-1];
                }
                arrayShift[i] = prom;
            }
            System.out.println(Arrays.toString(arrayShift));
        }
    }
