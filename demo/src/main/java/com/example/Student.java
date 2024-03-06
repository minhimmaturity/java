package com.example;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    // Default constructor (no arguments)
    public Student() {
        this.name = "Nguyen Van An";
        this.id = "17020001";
        this.group = "K62CC";
        this.email = "17020001@vnu.edu.vn";
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for group
    public String getGroup() {
        return group;
    }

    // Setter for group (intentionally omitted as group is set in constructors)

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Constructor with name, id, and email arguments
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    // Copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    // getInfo method to return student information in a specific format
    public String getInfo() {
        return String.format("%s - %s - %s - %s", name, id, group, email);
    }
}
