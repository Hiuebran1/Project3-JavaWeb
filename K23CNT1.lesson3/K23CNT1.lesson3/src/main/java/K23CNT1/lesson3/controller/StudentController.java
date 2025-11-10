package K23CNT1.lesson3.controller;

import K23CNT1.lesson3.entity.Student;
import K23CNT1.lesson3.service.serviceStudent; // ✅ import đúng package service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students") // ✅ URL gốc
public class StudentController {

    @Autowired
    private serviceStudent studentService; // ✅ inject service

    // Lấy toàn bộ danh sách sinh viên
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    // Lấy sinh viên theo ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    // Thêm sinh viên mới
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Cập nhật sinh viên
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // Xóa sinh viên
    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
