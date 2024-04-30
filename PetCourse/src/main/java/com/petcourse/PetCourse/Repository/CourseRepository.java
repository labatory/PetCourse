package com.petcourse.PetCourse.Repository;

import com.petcourse.PetCourse.Domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,> {

}
