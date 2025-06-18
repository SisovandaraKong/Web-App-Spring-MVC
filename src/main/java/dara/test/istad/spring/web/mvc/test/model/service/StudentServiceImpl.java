package dara.test.istad.spring.web.mvc.test.model.service;
import dara.test.istad.spring.web.mvc.test.Repository.Data;
import dara.test.istad.spring.web.mvc.test.model.Student;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class StudentServiceImpl {
    private final Data data;

    public List<Student> getAllStudents() {
        return data.getAllStudents();
    }

}
