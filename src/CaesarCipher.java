import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть повідомлення для шифрування: ");
        String message = input.nextLine();

        System.out.print("Введіть ключ шифрування (ціле число): ");
        int key = input.nextInt();

        String encryptedMessage = shifr(message, key);
        System.out.println("Зашифроване повідомлення: " + encryptedMessage);
    }

    public static String shifr(String message, int key) {
        String sifrMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char chan = message.charAt(i);

            if (Character.isLetter(chan)) {
                if (Character.isUpperCase(chan)) {
                    chan = (char) ((chan + key - 'А') % 33 + 'А');
                } else {
                    chan = (char) ((chan + key - 'а') % 33 + 'а');
                }
            }

            sifrMessage += chan;
        }

        return sifrMessage;
    }
}
