package lk.dhanush.springbootrestservices.mapper.mapperCustom.mapperImpl;

import lk.dhanush.springbootrestservices.dto.StudentDTO;
import lk.dhanush.springbootrestservices.entity.Student;
import lk.dhanush.springbootrestservices.mapper.mapperCustom.StudentMapper;
import org.springframework.stereotype.Component;


@Component
public class StudentMapperImpl implements StudentMapper {


    @Override
    public Student toEntity(StudentDTO studentDTO) {
        if(studentDTO == null){
            return null;
        }
        return new Student(studentDTO.getSid(),
                studentDTO.getName(),
                studentDTO.getNic(),
                studentDTO.getAddress(),
                studentDTO.getAge());


    }

    @Override
    public StudentDTO toDto(Student student) {

        if(student == null){
            return null;
        }
        return new StudentDTO(student.getSid(),
                student.getName(),
                student.getNic(),
                student.getAddress(),
                student.getAge());
    }
}
