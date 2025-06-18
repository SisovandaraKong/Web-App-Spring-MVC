package dara.test.istad.spring.web.mvc.test.Repository;

import dara.test.istad.spring.web.mvc.test.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Data {

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>(List.of(new Student(1, "Rin Sanom", "male", 99.00),
                new Student(2, "Sophea Chhay", "female", 95.50),
                new Student(3, "Bora Sok", "male", 89.75),
                new Student(4, "Nita Srey", "female", 92.00),
                new Student(5, "Dara Kim", "male", 85.25),
                new Student(6, "Sreyneang Lim", "female", 97.80),
                new Student(7, "Vuthy Heng", "male", 88.60),
                new Student(8, "Leakena Mao", "female", 91.20),
                new Student(9, "Piseth Sun", "male", 93.40),
                new Student(10, "Monika Chea", "female", 96.90))
        );
        return students;
    }

}
