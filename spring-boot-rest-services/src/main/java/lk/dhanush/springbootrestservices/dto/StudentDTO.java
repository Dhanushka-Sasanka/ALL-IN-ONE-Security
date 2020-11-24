package lk.dhanush.springbootrestservices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private Integer sid;
    private String name;
    private String nic;
    private String address;
    private Integer age;

}
