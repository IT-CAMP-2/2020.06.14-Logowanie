package pl.camp.it.gui;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.database.Repository;
import pl.camp.it.model.Sex;
import pl.camp.it.model.User;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMainManu() {
        System.out.println("1. Zaloguj");
        System.out.println("2. Zarejestruj");
        System.out.println("3. Exit");

        switch (scanner.nextLine()) {
            case "1":
                showLogin();
                showMainManu();
                break;
            case "2":
                showRegisterMenu();
                showMainManu();
                break;
            case "3":
                System.exit(0);
                break;
                default:
                    System.out.println("Nieprawidłowy wybór !");
                    showMainManu();
                    break;
        }
    }

    private static void showLogin() {
        System.out.println("Wpisz login:");
        String login = scanner.nextLine();
        System.out.println("Wpisz hasło:");
        String pass = scanner.nextLine();

        for(User user : Repository.getRepository().getUsers()) {
            if(user.getLogin().equals(login)) {
                String hashedPassword = DigestUtils.md5Hex(pass);
                if(hashedPassword.equals(user.getPass())) {
                    System.out.println("OK !!");
                } else {
                    System.out.println("Niepoprawne dane !!");
                }
                return;
            }
        }

        System.out.println("Niepoprawne dane !!");
    }

    private static void showRegisterMenu() {
        System.out.println("Podaj login:");
        String login = scanner.nextLine();

        System.out.println("Podaj hasło:");
        String pass = scanner.nextLine();

        Sex sex = readSex();

        String hasedPassword = DigestUtils.md5Hex(pass);

        Repository.getRepository().getUsers().add(new User(
                Repository.getRepository().getUsers().size()+1,
                login,
                hasedPassword,
                sex));

        System.out.println("Rejestracja zakończona powodzeniem !!");
    }

    private static Sex readSex() {
        System.out.println("Podaj płeć (M/W/O): ");
        switch (scanner.nextLine()) {
            case "M":
                return Sex.MAN;
            case "W":
                return Sex.WOMAN;
            case "O":
                return Sex.OTHER;
            default:
                readSex();
                break;
        }

        return null;
    }
}
