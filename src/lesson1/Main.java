package lesson1;

public class Main {
    public static void main(String[] args) {

        //урок 1 задание 2
        LessonOneExerciseTwo();

        //урок 1 задание 3
        LessonOneExerciseThree(1,2,3,4);
        LessonOneExerciseThree(1,2,3,0);

        //урок 1 задание 4
        System.out.println("Результат: " +LessonOneExerciseFour(10,5));
        System.out.println("Результат: " +LessonOneExerciseFour(10,11));

        //урок 1 задание 5
        LessonOneExerciseFive(0);
        LessonOneExerciseFive(-6);

        //урок 1 задание 6
        System.out.println("Результат: " +LessonOneExerciseSix(10));
        System.out.println("Результат: " +LessonOneExerciseSix(-10));

        //урок 1 задание 7
        LessonOneExerciseSeven("Марина");
        LessonOneExerciseSeven("TF");

        //урок 1 задание 8
        LessonOneExerciseEight(1999);
        LessonOneExerciseEight(2020);
    }
    static void LessonOneExerciseTwo(){
        byte a = 1;
        int b = 1;
        float c = 1;
        double d = 1;
        String e = "1";
        char f= 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    static void LessonOneExerciseThree(double a,double b,double c,double d){
        if (d != 0)
            System.out.println("Результат: " + a * (b +(c/d)));
         else
            System.out.println("Ошибка!! Деление на 0");
      }

    static boolean LessonOneExerciseFour(double a,double b){
        return (a+b) >= 10 && (a+b) <=20;
    }

    static void LessonOneExerciseFive(int a){
        if (a >= 0)
            System.out.println("Результат : число положительное");
        else
            System.out.println("Результат : число отрицательное");
    }

    static boolean LessonOneExerciseSix(int a){
        return a < 0;
    }

    static void LessonOneExerciseSeven(String name){
        System.out.println("Привет, "+name);
    }

    static void LessonOneExerciseEight(int god){
        if ((god % 4 == 0 || god % 400 == 0) && (god %100 !=0))
            System.out.println("Результат:  "+ god + " високосный");
        else
            System.out.println("Результат:  "+ god + " не високосный");
    }
}
