import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Strategy_select strategySelect = new Strategy_select();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What encryption method would you like to use?:(1)AES (2)DES (3)Caesar Cipher");
        String method = read.readLine().trim();

        switch (method) {
            case "1":
                strategySelect.set_Strategy(new AES());
                break;
            case "2":
                strategySelect.set_Strategy(new DES());
                break;
            case "3":
                System.out.println("Enter Caesar Cipher shift value: ");
                int shift = Integer.parseInt(read.readLine().trim());
                strategySelect.set_Strategy(new Caesar_Cipher(shift));
                break;
            default:
                System.out.println("Invalid method selected.");
                return;
        }

        System.out.println("Enter file path to encrypt:");
        String filePath = scanner.next();
        String content = new String(Files.readAllBytes(Paths.get(filePath)));


        String encryptedData = strategySelect.encryptData(content);
        Files.write(Paths.get(filePath + ".enc"), encryptedData.getBytes());
        System.out.println("File encrypted and saved as: " + filePath + ".enc");


        System.out.println("Decrypting the file for validation...");
        String decryptedData = strategySelect.decryptData(encryptedData);
        System.out.println("Decrypted content: " + decryptedData);
    }
}
