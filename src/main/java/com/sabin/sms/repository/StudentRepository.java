package com.sabin.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sabin.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
