package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E> implements Iterable<E>{

    Person person;

    List<Person> personList;
//    public People(){
//        personList = new ArrayList<>();
//    }

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

    public Iterator<E> iterator(){
        return (Iterator<E>) personList.iterator();
    }

//    public abstract Student[] getArray();
}