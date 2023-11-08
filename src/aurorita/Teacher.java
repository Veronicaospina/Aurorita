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
public class Teacher {
    private int mId;
    private ArrayList<Course> mCourses;

    public Teacher(int mId) {
        this.mId = mId;
        this.mCourses = new ArrayList<>();
    }

    public int getmId() {
        return mId;
    }
    
    public void addCourse(Course c){
        mCourses.add(c);
    }
    
    public int getLowAverageCourses(){
        int courses = 0;
        for (Course c: mCourses){
            float prom=c.getAverage();
            if(prom<=3.5){
                courses=courses+1;
            }
        }
        return courses;
    }
    
    
}
