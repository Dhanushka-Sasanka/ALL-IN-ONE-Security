package lk.dhanush.springbootrestservices.service;

import lk.dhanush.springbootrestservices.dto.StudentDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface StudentService {

    ResponseEntity<List<StudentDTO>>getAllStudents();

    ResponseEntity<StudentDTO> createStudent(StudentDTO studentDTO);

    ResponseEntity<StudentDTO> updateStudent(Integer sid ,StudentDTO studentDTO);

    Map<String , Boolean> deleteStudent(Integer studentID);

    ResponseEntity<StudentDTO> searchStudent(Integer studentID);

}
