package lab.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import lab.dao.CountryDao;
import lab.model.Country;

@Repository
public class CountryJpaDaoImpl extends AbstractJpaDao implements CountryDao {

	@Override
	public void save(Country country) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

        em.merge(country);

		transaction.commit();

		if (em != null) {
			em.close();
		}
	}

	@Override
	public List<Country> getCountries() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		List<Country> countries = em.createQuery("SELECT c FROM SimpleCountry c" , Country.class)
                .getResultList();

		transaction.commit();

        if (em != null) {
            em.close();
        }
        return countries;
	}

	@Override
	public List<Country> getCountriesStartWith(String name) {
		return null;
	}

	@Override
	public void updateCountryName(String codeName, String newCountryName) {

	}

	@Override
	public void loadCountries() {

	}

	@Override
	public Country getCountryByCodeName(String codeName) {
		return null;
	}

	@Override
	public Country getCountryByName(String name) {
        EntityManager em = emf.createEntityManager();

	    Country country = em.createQuery("SELECT c FROM SimpleCountry c WHERE c.name LIKE :name",
                        Country.class).setParameter("name", name)
                .getSingleResult();

        if (em != null) {
            em.close();
        }

        return country;
	}

}
