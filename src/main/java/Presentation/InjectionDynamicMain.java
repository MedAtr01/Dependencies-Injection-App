package Presentation;

import Dao.IDao;
import Ext.DaoImpl2;
import Metier.IMetier;
import Metier.MetierImpl;
import sun.util.resources.LocaleData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class InjectionDynamicMain {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(new File("src/main/config.txt"));
        String daoClassName = sc.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
       IDao dao = (IDao) cDao.newInstance();
        String metierClassName = sc.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        MetierImpl metier = (MetierImpl) cMetier.newInstance();
        metier.setDao(dao);
        System.out.println(metier.calculAge());





    }
}
