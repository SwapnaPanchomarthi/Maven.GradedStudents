package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageExamScore() {
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};

        Classroom classroom = new Classroom(students);


        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);


        // When

        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
       String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
       // System.out.println("===========================");
        //System.out.println(postEnrollmentAsString);
    }


    @Test
    public void removeStudent() {

            // : Given
            int maxNumberOfStudents = 2;
            Classroom classroom = new Classroom(maxNumberOfStudents);
            Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
            Double[] examScores1 = { 110.0, 150.0, 250.0, 0.0 };
            Student student = new Student("Leon", "Hunter", examScores);
            Student student1 = new Student("Kris", "Hunter", examScores1);


        // When

                Student[] preEnrollment = classroom.getStudents();
                classroom.addStudent(student);
                classroom.addStudent(student1);
                System.out.println(preEnrollment.length);

                //Arrays.toString(classroom.getStudents());


                classroom.removeStudent("Leon", "Hunter");
                 System.out.println(preEnrollment.length);
               // System.out.println("*******AfterRemove********");
                //System.out.println(Arrays.toString(classroom.getStudents()));


    }

    @Test
    public void getStudentsByScore() {

        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScores1 = { 110.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Student student1 = new Student("Kris", "Hunter", examScores1);


        // When

        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.getStudentsByScore();


    }

    @Test
    public void getGradeBook() {
        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScores1 = { 110.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Student student1 = new Student("Kris", "Hunter", examScores1);


        // When

        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.getAverageExamScore();
        classroom.getGradeBook();
    }

    @Test
    public void getGradeBook2() {
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};

        Classroom classroom = new Classroom(students);


        // When
        double output = classroom.getAverageExamScore();
        classroom.getGradeBook();

        // Then
        System.out.println(output);
    }
}
