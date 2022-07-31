package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void studentsTest(){
        //Arrange
//        Students.getInstance().studentListINSTANCE.add(new Student(99, ""));
        //Act
        //Assert
        Assert.assertEquals(true, Students.getInstance()
                .studentListINSTANCE.add(new Student(99, "")));
    }

}