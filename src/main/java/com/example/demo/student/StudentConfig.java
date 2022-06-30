package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return  args -> {
            Student nic = new Student(
                    "Nic",
                    "nicolasjosino@gmail.com",
                    LocalDate.of(1999, FEBRUARY, 24)
            );

            Student vini = new Student(
                    "Vinicius",
                    "vjlima@gmail.com",
                    LocalDate.of(2003, FEBRUARY, 15)
            );

            repository.saveAll(List.of(nic, vini));
        };
    }
}
