package lab.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static lombok.AccessLevel.PRIVATE;

@Data
@Entity
@Table(name = "Country")
@NoArgsConstructor
@AllArgsConstructor
public class SimpleCountry implements Country {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String codeName;
}
