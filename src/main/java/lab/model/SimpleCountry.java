package lab.model;

import lombok.Value;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@Value
public class SimpleCountry implements Country {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column(name = "code_name")
    private String codeName;
}
