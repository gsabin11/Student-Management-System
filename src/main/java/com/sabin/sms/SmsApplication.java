package com.sabin.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabin.sms.entity.Student;
import com.sabin.sms.repository.StudentRepository;
import com.sabin.sms.service.StudentService;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student s1 = new Student();
//        s1.setFirstName("Sabin");
//        s1.setLastName("Ghimire");
//        s1.setEmail("gsabin180@gmail.com");
//        studentRepository.save(s1);
//        Student s2 = new Student();
//        s2.setFirstName("Laxmi");
//        s2.setLastName("Khatiwada");
//        s2.setEmail("laxmi180@gmail.com");
//        studentRepository.save(s2);
    }

}
