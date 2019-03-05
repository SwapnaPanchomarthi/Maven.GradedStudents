package io.zipcoder;

import java.util.ArrayList;



public class Student {
    private String firstName;
    private String  lastName;
    private ArrayList<Double> examScores=new ArrayList<>();
    //private Double examScore;
    //private int examNumber;
    //private double newScore;

    @Override
    public String toString() {
        return "Student Name " + firstName + lastName + "\n" + "> "+"Average Score"+"\n"+getAverageExamScore()+"\n"+getExamScores();

    }



    public Student(){

    }

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        for(Double d: testScores){
            this.examScores.add(d);
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getExamScores() {
        System.out.println("Exam Scores:");
            String answer ="";
            for(int i=0;i<examScores.size();i++)
            {

                answer=answer+"Exam "+(i+1)+"-> "+examScores.get(i)+"\n";

            }
        return answer;
    }

    public void addExamScore(double examScore){

            examScores.add(examScore);

    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        Double avg =0.0;

        for(int i=0;i<examScores.size();i++){
            avg = avg+examScores.get(i);
        }
        return avg/examScores.size();
    }
    public int getNumberOfExamsTaken(){
        return 0;
    }






}
