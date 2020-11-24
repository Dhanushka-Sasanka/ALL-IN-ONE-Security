package lk.dhanush.springbootrestservices.controller;

import lk.dhanush.springbootrestservices.dto.StudentDTO;
import lk.dhanush.springbootrestservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RestAPIController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO ){
        System.out.println("studentDTO = [" + studentDTO + "]");
        return studentService.createStudent(studentDTO);
    }

    @PutMapping("/students/{sid}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable("sid") int sid ,
                                                    @RequestBody StudentDTO studentDTO ){

        return studentService.updateStudent(sid , studentDTO);
    }

    @DeleteMapping("/students/{sid}")
    public Map<String, Boolean> deleteStudent(@PathVariable("sid") int sid  ){
        return studentService.deleteStudent(sid);
    }

    @GetMapping("/students/{sid}")
    public ResponseEntity<StudentDTO> searchStudent(@PathVariable("sid")int sid){
        return studentService.searchStudent(sid);
    }




}
