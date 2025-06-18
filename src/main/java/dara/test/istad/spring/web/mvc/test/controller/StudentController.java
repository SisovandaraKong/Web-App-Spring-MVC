package dara.test.istad.spring.web.mvc.test.controller;

import dara.test.istad.spring.web.mvc.test.model.Student;
import dara.test.istad.spring.web.mvc.test.model.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/")
    public String index(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index"; // This means: render templates/index.html
    }
}
