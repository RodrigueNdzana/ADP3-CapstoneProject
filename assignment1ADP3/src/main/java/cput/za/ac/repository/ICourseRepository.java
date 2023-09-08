package cput.za.ac.repository;

import cput.za.ac.domain.Course;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ICourseRepository extends JpaRepository<Course, String> {
}
