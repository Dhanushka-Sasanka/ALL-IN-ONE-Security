package lk.dhanush.springbootrestservices.service.impl;

import lk.dhanush.springbootrestservices.dto.StudentDTO;
import lk.dhanush.springbootrestservices.entity.Student;
import lk.dhanush.springbootrestservices.mapper.mapperCustom.StudentMapper;
import lk.dhanush.springbootrestservices.mapper.mapperCustom.mapperImpl.StudentMapperImpl;
import lk.dhanush.springbootrestservices.repository.StudentRepo;
import lk.dhanush.springbootrestservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentMapperImpl studentMapper;

    @Override
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return new ResponseEntity(studentRepo.findAll(), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<StudentDTO> createStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        Student currentSavedStudent = studentRepo.save(student);
        StudentDTO dto = studentMapper.toDto(currentSavedStudent);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentDTO> updateStudent(Integer sid, StudentDTO studentDTO) {

        if (studentRepo.findById(sid).isPresent()) {
            Optional<Student> student1 = studentRepo.findById(sid);

            student1.get().setName(studentDTO.getName());
            student1.get().setNic(studentDTO.getNic());
            student1.get().setAddress(studentDTO.getAddress());
            student1.get().setAge(studentDTO.getAge());

            Student studentUpdate = studentRepo.save(student1.get());
            return new ResponseEntity(studentUpdate, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @Override
    public Map<String, Boolean> deleteStudent(Integer studentID) {
        Map<String, Boolean> map = new HashMap<>();
        if (studentRepo.findById(studentID).isPresent()) {
            studentRepo.deleteById(studentID);

            map.put("isDeleted", Boolean.TRUE);
            return map;
        }

        map.put("isDeleted", Boolean.FALSE);
        return map;

    }

    @Override
    public ResponseEntity<StudentDTO> searchStudent(Integer studentID) {

        return new ResponseEntity(studentRepo.findById(studentID), HttpStatus.OK);
    }
}
