package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testEnum(){
        //Assert
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }
    @Test
    public void testEnum2(){
        //Assert
        Assert.assertTrue(Educator.KRIS instanceof Teacher);
    }
    @Test
    public void testTeach(){
        //Arrange
        Student student = new Student(1102, "Lloyd");
        double expected = 2.0;
        //Act
        Educator.KRIS.teach(student,expected);
        //Assert
        Assert.assertEquals(expected, Educator.KRIS.timeWorked, 0.01d);
    }
    @Test
    public void testLecture(){
        //Arrange
        Student student = new Student(17, "John");
        Student student2 = new Student(71, "Doe");
        Student[] students = {student, student2};
        //Act
        double expected = 2.0;
        Educator.DOLIO.lecture(students,expected);
        //Assert
        Assert.assertEquals(expected, Educator.DOLIO.timeWorked, 0.01d);
    }
}