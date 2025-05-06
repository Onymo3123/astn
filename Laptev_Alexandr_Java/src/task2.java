import java.io.*;

/*

Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
 В результате сравнения в консоль должно быть выведено одно из сообщений:
 "Строки неидентичны" или "Строки идентичны"

*/


public class task2 {
    public static void main(String[] args){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String stringFirst, stringSecond;

        try {
            System.out.println("Введите значение первой строки:");
            stringFirst = bufferedReader.readLine(); //читаем значение с клавиатуры
        } catch (IOException e) {
            System.err.println("Ошибка ввода");
            return;
        }

        try {
            System.out.println("Введите значение второй строки:");
            stringSecond = bufferedReader.readLine(); //читаем значение с клавиатуры
        } catch (IOException e) {
            System.err.println("Ошибка ввода");
            return;
        }
        if((stringFirst == null)|(stringSecond == null)){
            System.err.println("Ошибка ввода");
            return;
        }
        if(stringFirst.equals(stringSecond)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }

    }
}
