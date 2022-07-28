package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void learn() {
        //Arrange
        Student student1 = new Student(17, "John");
        student1.learn(10.50);
        //Actual
        double actual = student1.getTotalStudyTime();
        double expected = 10.50;
        //Assert
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testImplementation() {
        //Arrange
        Student student = new Student(17, "John");
        //Act
        //Assert
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Arrange
        Student student = new Student(17, "John");
        //Act
        //Assert
        Assert.assertTrue(student instanceof Person);
    }
}