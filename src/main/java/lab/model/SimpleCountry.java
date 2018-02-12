package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SimpleCountry implements Country {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column(name = "code_name")
    private String codeName;
}
