package Lesson2;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    public void calculate(){
        System.out.println("Введите два числа: ");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();

        System.out.println("Выберите операцию: ");
        System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int sign = scanner.nextInt();

        switch (sign)
        {
            case 1:
            {
                System.out.println("Сумма " + operand1 + " и " + operand2 + " равна: " + (operand1+operand2));
                break;
            }
            case 2:
            {
                System.out.println("Разность " + operand1 + " и " + operand2 + " равна: " + (operand1-operand2));
                break;
            }
            case 3:
            {
                System.out.println("Произведение " + operand1 + " и " + operand2 + " равна: " + (operand1*operand2));
                break;
            }
            case 4:
            {
                if(operand2 == 0)
                {
                    System.out.println("Ошибка! На ноль делить нельзя!");
                    break;
                }
                else
                {
                    System.out.println("Частное " + operand1 + " и " + operand2 + " равна: " + (operand1/operand2));
                }
                break;
            }
            default:
            {
                System.out.println("Такого пункта в меню калькулятора нет");
                break;
            }
        }
    }
}
