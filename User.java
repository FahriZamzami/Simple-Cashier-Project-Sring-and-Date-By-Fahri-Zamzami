import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User {

    public String username;
    String password;
    String logUser;
    String logPass;

    ArrayList <String> user_name = new ArrayList<>();
    ArrayList <String> pass_word = new ArrayList<>();

    public void namaPengguna(Scanner input){
        System.out.print("\nUsername: ");
        username = input.nextLine();
        user_name.add(username);
    }

    public void sandiPengguna(Scanner input){
        System.out.print("Password: ");
        password = input.nextLine();
        pass_word.add(password);
    }

    public void LogIn(Scanner input) {
        
    int i = 0;
        while (i < user_name.size()) {

            System.err.print("\nUsername: ");
            logUser = input.nextLine();

            System.err.print("Password: ");
            logPass = input.nextLine();

            // CAPTCHA generation
            String captcha = generateCaptcha();
            System.out.println("CAPTCHA: " + captcha);
            System.out.print("Masukkan CAPTCHA: ");
            String captchaInput = input.nextLine();

            if (user_name.get(i).equals(logUser) && pass_word.get(i).equals(logPass) && captcha.equals(captchaInput)) {
                System.out.println("\nLogIn Berhasil");
                System.out.println("\nSelamat Datang di Supermarket ElevenTwelve");
                break;
            }

            else if(!user_name.get(i).equals(logUser) || !pass_word.get(i).equals(logPass) || !captcha.equals(captchaInput)){
                System.out.println("\nLogIn Gagal. Silahkan Diulangi");
            }
        }
    }

    //Method string untuk captcha
    private String generateCaptcha() {
        int length = 6; // Panjang CAPTCHA
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }

}