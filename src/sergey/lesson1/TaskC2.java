package sergey.lesson1;


import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        String binA = Integer.toBinaryString(a);
        String octA = Integer.toOctalString(a);
        String hexA = Integer.toHexString(a);

        String binnB = Integer.toBinaryString(b);
        String octB = Integer.toOctalString(b);
        String hexB = Integer.toHexString(b);

        String binnC = Integer.toBinaryString(c);
        String octC = Integer.toOctalString(c);
        String hexC = Integer.toHexString(c);


        System.out.printf("DEC:%d+%d=%d%n", a, b, c);
        System.out.printf("BIN:%s+%s=%s%n", binA, binnB, binnC);
        System.out.printf("HEX:%s+%s=%s%n", hexA, hexB, hexC);
        System.out.printf("OCT:%s+%s=%s%n", octA, octB, octC);

    }
}
