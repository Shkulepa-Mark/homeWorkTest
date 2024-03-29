import Lesson0.HelloUser;
import Lesson2.Calculator;
import Lesson2.NumberInterval;
import Lesson2.ParityOfNumbers;
import Lesson2.Translator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задачи");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
            {
                HelloUser helloUser = new HelloUser();//0
                helloUser.userName();
                break;
            }
            case 2:
            {
                Calculator calculator = new Calculator();//1
                calculator.calculate();
                break;
            }
            case 3:
            {
                NumberInterval numberInterval = new NumberInterval();//2
                numberInterval.interval();
                break;
            }
            case 4:
            {
                Translator translator = new Translator();//3
                translator.translate();
                break;
            }
            case 5:
            {
                ParityOfNumbers parityOfNumbers = new ParityOfNumbers();//4
                parityOfNumbers.parity();
                break;
            }
        }
    }
}
