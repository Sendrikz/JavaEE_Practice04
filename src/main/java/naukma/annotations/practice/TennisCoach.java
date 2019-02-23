package naukma.annotations.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TennisCoach {

    @Value("${tennis.name}")
    private String name;

    @Value("${tennis.email}")
    private String email;

    @Autowired
    private List<String> studentList;

    TennisCoach(List<String> studentList) {
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "TennisCoach{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
