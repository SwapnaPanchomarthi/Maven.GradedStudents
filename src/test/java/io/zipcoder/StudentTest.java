package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
        //Assert.assertEquals(1, 2);
    }

    @Test
    public void getNumberOfExamsTaken() {
    }
    @Test
    public void addExamScoreTest(){
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = { };
    Student student = new Student(firstName, lastName, examScores);

    // When
    student.addExamScore(100.0);
    String output = student.getExamScores();

    // Then
    System.out.println(output); }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(90);
        student.setExamScore(1, 150.0);

        String output = student.getExamScores();

        // Then
        System.out.println(output);

    }

    @Test
    public void getAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }
}
