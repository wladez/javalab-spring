import com.epam.jl.demo.ioc.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    @DisplayName("Name method works correctly")
    void Name() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person person = context.getBean("person", Person.class);

        System.out.println(person);
    }
}
