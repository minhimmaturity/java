package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int size;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[size++] = new Student(newStudent.getName(), newStudent.getId(), newStudent.getEmail());
        System.out.println("Thêm sinh viên thành công!");
    }

    public String studentsByGroup() {
        StringBuilder sb = new StringBuilder();
        // Use a HashMap to efficiently group students
        HashMap<String, List<Student>> studentsByGroupMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String group = students[i].getGroup();
            List<Student> studentList = studentsByGroupMap.get(group);
            if (studentList == null) {
                studentList = new ArrayList<>();
                studentsByGroupMap.put(group, studentList);
            }
            studentList.add(students[i]);
        }

        // Iterate through the HashMap and build the output string
        for (Map.Entry<String, List<Student>> entry : studentsByGroupMap.entrySet()) {
            String group = entry.getKey();
            sb.append(group).append("\n");
            for (Student student : entry.getValue()) {
                sb.append(student.getInfo()).append("\n");
            }
            sb.append("\n"); // Add an empty line between groups
        }

        return sb.toString().trim(); // Remove leading/trailing whitespace
    }
}
