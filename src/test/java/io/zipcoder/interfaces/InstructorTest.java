package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //Arrange
        Instructor instructor = new Instructor(25, "Kris");
        //Assert
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        //Arrange
        Instructor instructor = new Instructor(25, "Kris");
        //Assert
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void teachTest() {
        //Arrange
        Instructor instructor = new Instructor(25, "Kris");
        Student student = new Student(17, "John");
        //Act
        double expected = 100.0;
        instructor.teach(student, expected);
        double actual = student.getTotalStudyTime();
        //Assert
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void lectureTest() {
        //Arrange
        Instructor instructor = new Instructor(25, "Kris");
        Student student = new Student(17, "John");
        Student student2 = new Student(71, "Doe");
        Learner[] learners = {student, student2};
        //Act
        instructor.lecture(learners, 4);
        double expected = 2;
        double actual = student2.getTotalStudyTime();
        //Assert
        Assert.assertEquals(expected, actual, 0.01d);
    }
}