package com.example.demo.models.Producers.reopsitories;
import com.example.demo.models.Producers.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
