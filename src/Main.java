

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Calculator myCalc = new Calculator();
        Integer result = 0;
        do {
            Scanner myInput = new Scanner(System.in);
            System.out.println("Input:");

            if (myInput.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)")
            != null) {    // Проверка нужного ли формата строка
                if (myInput.match().group(1) != null) {  // Первое число выражения
                    Integer num1 = Integer.parseInt(myInput.match().group(1));  // Первое число выражения
                    Integer num2 = Integer.parseInt(myInput.match().group(3));  // Второе число выражения
                    result = myCalc.action(num1, num2, myInput.match().group(2));   //Операнд
                }
                else {
                    Integer num2 = Integer.parseInt(myInput.match().group(3));  //Запись в переменную второго числа
                    result = myCalc.action(result, num2, myInput.match().group(2));    //Вывод результатаа
                }
                System.out.println("Output:");
                System.out.println(result); //вывод результата
                }
            else {
                System.out.println("Неверное выражение!");  //Вывод ошибки
                System.exit(0); //Выход
            }
        }
        while (true); //Выполнение цикла
    }
}
