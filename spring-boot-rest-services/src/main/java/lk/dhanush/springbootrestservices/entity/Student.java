package lk.dhanush.springbootrestservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer sid;
    private String name;
    private String nic;
    private String address;
    private Integer age;

}
