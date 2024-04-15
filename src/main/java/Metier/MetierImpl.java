package Metier;

import Dao.DaoImpl;
import Dao.IDao;

import java.time.LocalDate;
import java.time.Period;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public int calculAge() {

        LocalDate dateNaissance = dao.getData();
        LocalDate currentDate = LocalDate.now();
        Period difference = Period.between(dateNaissance,currentDate);
        return difference.getYears();

    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
