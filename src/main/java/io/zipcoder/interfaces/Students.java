package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    List<Student> studentListINSTANCE;

    public Students() {
        this.studentListINSTANCE = new ArrayList<>();
//       Student student = new Student(1998, "Lloyd");
//       personList.add(student);
    }
    @Override
    public List<Person> toArray(){
        return null;
    }
//    @Override
//    public Student[] getArray(){
//        return personList.toArray(new Student[(personList.size())]);
//    }

    public static Students getInstance() {
        return INSTANCE;
    }
    public void addStudent(Student student){
        this.studentListINSTANCE.add(student);
    }
}
