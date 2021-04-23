import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String Token = "abcdefghijklmnopqrstuvxy" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "!@#$%^&*()";
    private static final Random random = new Random();

    public static void main(String[] args) {

        int tokenLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will generate token of length 5/10/15 random characters. Please provide one of them: ");
        tokenLength = scanner.nextInt();
        switch (tokenLength) {
            case 5:
            case 15:
            case 10:
                System.out.println("Token: " + tokenGenerator(tokenLength));
                break;
            default:
                System.out.println("Please enter correct value, 5, 10 or 15");
        }
    }

    public static String tokenGenerator(int length) {
        StringBuilder sB = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomChar = random.nextInt(Token.length());
            char rndChar = Token.charAt(randomChar);

            sB.append(rndChar);
        }
        return sB.toString();
    }
}
