/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aurorita;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author CAOS
 */
public class Course {
    private int mId;
    private ArrayList<Student> mStudents;
    private Teacher mTeacher;
    private HashMap<Integer, Grade> mGrades;

    public Course(int mId) {
        this.mId = mId;
        this.mStudents = new ArrayList<>();
        this.mGrades = new HashMap<>();
    }

    public int getmId() {
        return mId;
    }
    
    public void addStudent(Student s){
        mStudents.add(s);
    }
    
    public void addTeacher(Teacher mTeacher){
        this.mTeacher=mTeacher;
        this.mTeacher.addCourse(this);
    }
    
    public void addGradeToStudent(int studentId, float value){
        mGrades.put(studentId, new Grade(value));
    }
    
    public float findStudentGrade(int studentId){
        return mGrades.get(studentId).getValue();
    }
    
    public float getAverage(){
        float sum = 0;
        for(Grade grade : mGrades.values()){
            sum = sum+grade.getValue();
        }
        float avg = sum/mGrades.size();
        return avg;
    }
    
}
