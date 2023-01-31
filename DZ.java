import java.util.Scanner;

public class DZ {
   
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Это не палиндром");
                return;
            }
        }
        System.out.println("Это палиндром");
    } 
}
