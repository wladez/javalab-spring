package demo.model;

import lab.model.Person;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.Delegate;

import java.util.Collection;

import static lombok.AccessLevel.NONE;

@Value
public class SimpleAuthor implements Author {
    Collection<Book> books;

    @Delegate
    @Getter(NONE)
    Person person;
}
