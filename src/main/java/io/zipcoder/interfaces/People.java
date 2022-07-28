package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People{

    Person person;

    List<Person> personList;

    public void add(Person addPerson){
        personList.add(addPerson);
    }

    public long findById(long id){
        return person.getId();
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person, long id){
        personList.remove(person);
        personList.remove(id);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public List<Person> toArray(){
        return new ArrayList<Person>();
    }

    Iterable<Person> iterator(){
        personList.iterator();
        return personList;
    }

}