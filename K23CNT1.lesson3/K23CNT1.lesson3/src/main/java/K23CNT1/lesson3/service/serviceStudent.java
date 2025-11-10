package K23CNT1.lesson3.service;

import K23CNT1.lesson3.entity.Student;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class serviceStudent {
    private List<Student> students = new ArrayList<>();

    public serviceStudent() {
        students.addAll(Arrays.asList(
                new Student(1L, "quachduchuy 1", 20, "Nam", "Số 25 VNP", "0123456789", "huychuoi05@gmail.com"),
                new Student(2L, "quachduchuy 2", 25, "Nữ", "Số 28 Cầu Giấy", "0987654321", "contact@devmaster.edu.vn"),
                new Student(3L, "quachduchuy 3", 22, "Nam", "Số 15 Trần Duy Hưng", "0911222333", "dev3@devmaster.edu.vn"),
                new Student(4L, "quachduchuy 4", 21, "Nữ", "Số 99 Kim Mã", "0909090909", "dev4@devmaster.edu.vn"),
                new Student(5L, "quachduchuy 5", 23, "Nam", "Số 68 Thái Hà", "0977554433", "dev5@devmaster.edu.vn")
        ));
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(Long id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = getStudent(id);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setAddress(student.getAddress());
            existing.setEmail(student.getEmail());
            existing.setPhone(student.getPhone());
            existing.setAge(student.getAge());
            existing.setGender(student.getGender());
        }
        return existing;
    }

    public boolean deleteStudent(Long id) {
        Student check = getStudent(id);
        return check != null && students.remove(check);
    }
}
