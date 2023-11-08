/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aurorita;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author CAOS
 */
public class AuroritaClase {
    private ArrayList<Student> mStudents;
    private ArrayList<Teacher> mTeachers;
    private ArrayList<Course> mCourses;

    public AuroritaClase() {
        this.mStudents = new ArrayList<>();
        this.mTeachers = new ArrayList<>();
        this.mCourses = new ArrayList<>();
    }
    
    public void getTeachersLowScore(){
        for (Teacher teach: mTeachers){
            int amount=teach.getLowAverageCourses();
            System.out.println("Teacher "+teach.getmId()+" has "+amount+" courses with low average (<=3.5)");
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AuroritaClase aurora = new AuroritaClase();
        for (int i = 0; i < 200; i++) {
            aurora.mStudents.add(new Student(i));
        }
        for (int i = 0; i < 100; i++) {
            aurora.mCourses.add(new Course(i+200));
        }
        for (int i = 0; i < 30; i++) {
            aurora.mTeachers.add(new Teacher(i+300));
        }

        Random rnd = new Random();
        for (Course course : aurora.mCourses) {
            int r = rnd.nextInt(30) + 300;
            Teacher teacher = null;
            for (int i = 0; i < aurora.mTeachers.size(); i++) {
                if (aurora.mTeachers.get(i).getmId() == r) {
                    teacher = aurora.mTeachers.get(i);
                    break;
                }
            }
            course.addTeacher(teacher);
            for (int j = 0; j < 30; j++) {
                r = rnd.nextInt(200);
                Student s = null;
                for (int i = 0; i < aurora.mStudents.size(); i++) {
                    if (aurora.mStudents.get(i).getmId() == r) {
                        s = aurora.mStudents.get(i);
                        break;
                    }
                }
                course.addStudent(s);
                course.addGradeToStudent(s.getmId(), rnd.nextInt(5));
            }
        }
        aurora.getTeachersLowScore();
        System.out.println("hola");
        
    }
    
}
