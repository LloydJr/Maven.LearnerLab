package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students studentsINSTANCE = Students.getInstance();
    private static final Instructors instructorsINSTANCE = Instructors.getInstance();

    public void hostLectures(Teacher teacher, double numberOfHours){
        teacher.lecture(studentsINSTANCE.studentListINSTANCE.toArray(new Student[0]), numberOfHours);
    }
    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
    public void hostLecture(long id, double numberOfHours){
        long instructors = instructorsINSTANCE.findById(id);
        hostLecture(instructors, numberOfHours);
    }
    public HashMap<Student, Double> getStudyMap() {
        HashMap<Student, Double> studyMap = new HashMap<>();
        for (Object object : studentsINSTANCE.studentListINSTANCE.toArray()){
            Student student = (Student) object;
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

}
