import commons.Tests;
import lab.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    @DisplayName("Name method works correctly")
    void Name() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person person = context.getBean("person", Person.class);

        assertEquals(person, Tests.getExpectedPerson());

        System.out.println(person);
    }
}
