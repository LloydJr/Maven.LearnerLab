package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test
    public void instructorsTest(){
        Assert.assertEquals(true, Instructors.getInstance()
                .instructorListINSTANCE.add(new Instructor(99, "")));
    }
}