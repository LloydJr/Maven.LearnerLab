package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor>{

    private static final  Instructors INSTANCE = new Instructors();
    List<Instructor> instructorListINSTANCE;
    public Instructors() {
        this.instructorListINSTANCE = new ArrayList<>();
    }

    @Override
    public List<Instructor> toArray() {
        return null;
    }
    public static Instructors getInstance() {
        return INSTANCE;
    }

    public void add(Instructor instructor) {
        this.instructorListINSTANCE.add(instructor);
    }
}
