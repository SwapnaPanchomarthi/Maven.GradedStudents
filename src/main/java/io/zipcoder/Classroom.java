package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] studentsarr;


    private int maxNumberOfStudents;
    //private Student student = new Student();
    private Double[] examScore;
    private Student student;

    public Classroom(Student student, Double[] examScore) {
        this.examScore = examScore;
        this.student = new Student("", "", examScore);

    }

    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.studentsarr = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] student) {
        this.studentsarr = student;
        this.examScore = examScore;

    }

    public Classroom() {
        this.studentsarr = new Student[30];

    }

    public Student[] getStudent() {
        return studentsarr;
    }

    public double getAverageExamScore() {


        double avg = 0.0;

        for (Student s : studentsarr) {
            if(s != null) {
                avg = avg + s.getAverageExamScore();
            }
        }


        return avg / studentsarr.length;
    }

    public Student[] addStudent(Student student) {


        List<Student> s= new ArrayList(Arrays.asList(studentsarr));

             s.add(student);

            studentsarr=s.toArray(new Student[0]);

            return studentsarr;
    }



    public Student[] getStudents() {

        return studentsarr;
    }

        public void removeStudent(String firstName, String lastName) {
            List<Student> s= new ArrayList(Arrays.asList(studentsarr));
            //for(int i=0;i<studentsarr.length;i++){
                for (Student st:s) {
                    if(st != null) {
                          if((st.getFirstName().equals(firstName))&&(st.getLastName().equals(lastName)))
                        s.remove(st);
                    }
            }
                studentsarr=s.toArray(studentsarr);

    }


    public void getStudentsByScore()

    {
        List<Student> s= new ArrayList(Arrays.asList(studentsarr));
        Student[] score = new Student[s.size()];
        for (Student st:s)
              {
                  if(st != null) {
                      st.getExamScores();
                      score = s.toArray(score);
                      System.out.println(score);
                  }
        }


    }

    public void getGradeBook()
    {

         Student sClass = new Student();

        double avg = sClass.getAverageExamScore();

        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }



    }

