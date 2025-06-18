package dara.test.istad.spring.web.mvc.test.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Double score;
}
