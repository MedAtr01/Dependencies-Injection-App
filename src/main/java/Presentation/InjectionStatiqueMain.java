package Presentation;
import Dao.DaoImpl;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

import java.time.LocalDate;

public class InjectionStatiqueMain {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        int age = metier.calculAge();
        System.out.println("Votre Age est : " +age);
    }
}
