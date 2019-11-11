package sergey.lesson1;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51

для перевода веса тела с планета1 в вес тела на планета2, используется формула:
ускорение свободного падения дланета2 / ускорение свободного падения дланета1

*/
class TaskC3 {


    private static double getWeight(int weight) {
        double rezultat = Math.round(3.86/9.81*weight*100);
        return rezultat/100;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес человека на Земле");
        int weight = scanner.nextInt();
        System.out.println("Вес на мерсе = " + getWeight(weight));


    }


}
