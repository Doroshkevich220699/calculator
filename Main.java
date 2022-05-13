

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        ArrayList<Integer> var = new ArrayList<>();
        Conventer sc = new Conventer();
        String[] sr = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример: ");
        String s = in.nextLine();
        String[] d = s.split(" ");
        for (String f : d) {
            if (b > 2) {
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                           }
            b++;
            sr[a] = f;
            a++;
        }
        for (a = 0; a < 3; a++) {
            if (sr[a] == null) {
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
        sc.stringToInt(sr[0], sr[2], var);
        for (a = 0; a < 2; a++) {
            if (var.get(a) < 1 | var.get(a) > 10) {
                throw new RuntimeException("диапозон работы от 1 до 10");
            }
        }
        Calculator calculator = new Calculator(var.get(0), var.get(1), sr[1]);
        a = calculator.calculation();
        if (sc.x == 1){
            if (a < 1){
                throw new RuntimeException("в римской системе нет чисел меньше еденицы");
            }
            String m = sc.arToRoman(a);
            System.out.println("Результат " + m);
        }
        else {
            System.out.println("Результат " + a);
        }
    }
}



