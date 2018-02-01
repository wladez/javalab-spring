package commons;

import lab.model.Person;
import lab.model.SimpleContact;
import lab.model.SimpleCountry;
import lab.model.UsualPerson;

import java.util.Arrays;

public interface Tests {

    String APPLICATION_CONTEXT_XML_FILE_NAME = "ioc.xml";

    static Person getExpectedPerson() {
        return new UsualPerson(
                1,
                "John",
                "Smith",
                new SimpleCountry(1, "Russia", "RU"),
                35,
                1.78f,
                true,
                Arrays.asList(
                        new SimpleContact("TELEPHONE", "222-33-22"),
                        new SimpleContact("EMAIL", "jkhafg@kjhsd.ru")));
    }
}
