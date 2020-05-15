import java.util.Scanner;
import java.lang.Math;

public class Final_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в двоичном формате: ");
        int num = in.nextInt();        //Запись введённого с клавиатуры двоичного числа в переменную
        int result = 0;          //Создаём переменную результата перевода
        int stepen = 0;         //Создаём переменную для возведения в степень числа 2
        int x;
        boolean it_binary = true;
        while (num != 0) {
            x = num % 10;         //Получаем остаток от деления введённого числа на 10
            if (x > 1 || x < 0) {
                System.out.println("Число не является двоичным");
                it_binary = false;
                break;
            } else {
                result += x * Math.pow(2, stepen);        //Остаток от деления умножаем на 2 в степени, складываем с результатом
                stepen++;             //Степень увеличивается на единицу
                num = num / 10;        //Сокращаем число делением на 10
            }
        }
           if (it_binary){
            System.out.println("Ваше число в десятичном формате: " + result);}
        }
    }