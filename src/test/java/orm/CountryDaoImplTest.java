package orm;

import lab.dao.CountryDao;
import lab.dao.CountryNotFoundException;
import lab.model.Country;
import lab.model.SimpleCountry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Illustrates basic use of Hibernate as a JPA provider.
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:orm.xml")
class CountryDaoImplTest {

    private Country exampleCountry = new SimpleCountry(1L, "Australia", "AU");

    @Autowired
    @Qualifier("countryJpaDaoImpl")
    private CountryDao countryDao;

    private int size;

    @Test
    void testSaveCountry() {
        countryDao.save(exampleCountry);
        size++;

        List<Country> countries = countryDao.getCountries();
        assertEquals(1, countries.size());
        assertEquals(exampleCountry, countries.get(0));
    }

    @Test
    void testGtAllCountries() {
        countryDao.save(new SimpleCountry(1L, "Canada", "CA"));
        size++;

<<<<<<< HEAD:src/test/java/CountryDaoImplTest.java
        countryDao.save(new SimpleCountry(1, "Canada", "CA"));
        size++;

        List<Country> countryList = countryDao.getCountries();
        assertEquals(size, countryList.size());
=======
        assertEquals(size, countryDao.getCountries().size());
>>>>>>> upstream/master:src/test/java/orm/CountryDaoImplTest.java
    }

    @Test
    void testGetCountryByName() throws CountryNotFoundException {
        countryDao.save(exampleCountry);
        size++;
<<<<<<< HEAD:src/test/java/CountryDaoImplTest.java

        Country country = countryDao.getCountryByName("Australia");
        assertEquals(exampleCountry, country);
    }
=======
>>>>>>> upstream/master:src/test/java/orm/CountryDaoImplTest.java

        assertEquals(exampleCountry, countryDao.getCountryByName(exampleCountry.getName()));
    }
}
