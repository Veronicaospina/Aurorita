/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aurorita;

import java.util.ArrayList;

/**
 *
 * @author CAOS
 */
public class Student {
    private int mId;
    private ArrayList<Course> mCourses;

    public Student(int mId) {
        this.mId = mId;
        this.mCourses = new ArrayList<>();
    }

    public int getmId() {
        return mId;
    }
    
    public void addCourse(Course c){
        mCourses.add(c);
    }
    
}
