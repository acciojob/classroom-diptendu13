package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepositorys;
    public void addStudent(Student student) {
        studentRepositorys.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepositorys.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        studentRepositorys.addStudentTeacherPair(student, teacher);
    }

    public Student getStudentByName(String name) {
        return studentRepositorys.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name) {
        return studentRepositorys.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        return studentRepositorys.getStudentsByTeacherName(teacher);
    }

    public List<String> getAllStudents() {
        return studentRepositorys.getAllStudents();
    }

    public void deleteTeacherByName(String teacher) {
        studentRepositorys.deleteTeacherByName(teacher);
    }

    public void deleteAllTeachers() {
        studentRepositorys.deleteAllTeachers();
    }
}
