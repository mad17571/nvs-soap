package at.spengergasse.soap;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Repository
public class CountryRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final Map<String, Country> countries = new HashMap<>();

    public List<Country> findAll(){
        return jdbcTemplate.query(
                "select * from Country",
                (rs, rowNum) ->
                        new Country(
                                rs.getString("name"),
                                rs.getInt("population"),
                                rs.getString("capital"),
                                rs.getString("currency")
                        )
        );
    }

    @PostConstruct
    public void initData() {

       countries.put(findAll().get(0).getName(), findAll().get(0));
        countries.put(findAll().get(1).getName(), findAll().get(1));
        /*
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);++
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);
        */

    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}