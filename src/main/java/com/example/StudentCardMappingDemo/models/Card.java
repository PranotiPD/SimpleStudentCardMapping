package com.example.StudentCardMappingDemo.models;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "fine")
    private double fine;
    @OneToOne
    @JoinColumn(name = "Student_id")
    public Student student;

    public Card(){

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public double getFine(){
        return this.fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
}
