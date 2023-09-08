package cput.za.ac.repository;

import cput.za.ac.domain.Course;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

/*   CourseRepository.java
     Repository for the Course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022

public class CourseRepository implements ICourseRepository {
    private static CourseRepository repository = null; // Initialize the repo to null
    private Set<Course> courseDB = null;

    private CourseRepository() {
        courseDB = new HashSet<Course>(); // storing our data in a form of a set
    }

    public static CourseRepository getRepository() {
        // checking if the repository is null , if that is a case(which is true) create a repository
        if (repository == null) {
            repository = new CourseRepository();
        }
        return repository;
    }


    @Override
    public Course create(Course course) {
        //doing some testing to check if I was successful in adding Course to my Set
        boolean successful = courseDB.add(course);
        if (!successful) {
            return null; // if no course is added
        }
        return course;
    }

    @Override
    public Course read(String courseCode) {
        for (Course e : courseDB) {

            if (e.getCourse_code().equals(courseCode)) {
                return e;
            }
            return e;
        }
        return null;
    }

    @Override
    public Course update(Course course) {
        // read first the value you want to update
        Course previousCourse = read(course.getCourse_code());
        if (previousCourse == null) { // which is true
            courseDB.remove(previousCourse); // remove the previous course
            courseDB.add(course); // add a course with a new course_Code
        }
        return course; // if there is nothing to update
    }

    @Override
    public boolean delete(String course_code) {
        // read the value to delete
        Course courseToDelete = read(course_code);
        if (courseToDelete == null)
            return false;
        courseDB.remove(courseToDelete);
        return true;
    }

    @Override
    public Set<Course> getAll() {
        return courseDB;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Course> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Course> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Course> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Course getOne(String s) {
        return null;
    }

    @Override
    public Course getById(String s) {
        return null;
    }

    @Override
    public Course getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Course> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Course> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Course> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Course, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Course> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Course> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Course> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public List<Course> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Course entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Course> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Course> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Course> findAll(Pageable pageable) {
        return null;
    }
}

 */
