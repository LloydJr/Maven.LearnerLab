package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(new Instructor(88, "Dolio")),
    KRIS(new Instructor(99, "Kris"));

    final Instructor instructor;
    double timeWorked = 0.0;

    Educator(Instructor instructor){
        this.instructor = instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        this.instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        this.instructor.lecture(learners, numberOfHours);
    }
}
