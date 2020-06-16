package pl.camp.it;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.database.Repository;
import pl.camp.it.gui.GUI;
import pl.camp.it.model.Konsola;
import pl.camp.it.model.Sex;
import pl.camp.it.model.User;

import java.util.Set;

public class App {
    public static void main(String[] args) {
        GUI.showMainManu();

        /*Repository.getRepository().getUsers().add(new User(jsdyf));
        Konsola k = Konsola.PS;
        Konsola k2 = Konsola.PS;

        System.out.println(Sex.MAN == Sex.MAN);
        System.out.println(Sex.MAN.equals(Sex.MAN));

        System.out.println(k == k2);*/
    }
}
