package naukma.annotations.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(myCoach);
    }
}
