import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Напишіть програму на мові Java, яка задає довільний текст, що складається з\n" +
                "декількох речень і рядків, та виконує його зміну (обробку) відповідно варіанту завдання\n" +
                "(таблиця 1.2).";
        System.out.println("Текст для обробки: ");
        System.out.println(text);
        System.out.println("Введіть перший символ: ");
        String temp = new Scanner(System.in).next();
        char firstChar = temp.charAt(temp.length()-1);
        System.out.println("Введіть другий символ: ");
        temp = new Scanner(System.in).next();
        char lastChar = temp.charAt(temp.length()-1);
        System.out.println(replace(text, firstChar, lastChar));
    }
    public static String replace(String text, char firstChar, char lastChar){
        int firstIndex = text.indexOf(firstChar);
        int lastIndex = text.lastIndexOf(lastChar);
        StringBuffer replaced = new StringBuffer(text);
        replaced.delete(firstIndex+1, lastIndex);
        return  replaced.toString();
    }
}