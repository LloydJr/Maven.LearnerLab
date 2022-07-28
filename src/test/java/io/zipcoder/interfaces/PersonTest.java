package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person testPerson;

    @Test
    public void testConstructor(){
        //Given
        testPerson = new Person(0 , "");
        //Then
        Assert.assertEquals("", testPerson.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String expectedName = "John";
        //When
        testPerson = new Person(0, expectedName);
        //Then
        Assert.assertEquals("John", testPerson.getName());
    }

}