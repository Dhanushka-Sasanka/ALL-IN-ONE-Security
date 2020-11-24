package lk.dhanush.springbootrestservices.mapper.mapperCustom;

import lk.dhanush.springbootrestservices.dto.StudentDTO;
import lk.dhanush.springbootrestservices.entity.Student;
import lk.dhanush.springbootrestservices.mapper.SuperMapper;
import org.springframework.stereotype.Component;


public interface StudentMapper extends SuperMapper<Student , StudentDTO> {
}
