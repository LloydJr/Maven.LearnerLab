package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    Person person;

    List<E> personList;
//    public People(){
//        personList = new ArrayList<>();
//    }

    public void add(E addPerson){
        personList.add(addPerson);
    }

    public E findById(long id){
        for (E person : personList)
            if (person.getId() == id)
                return person;
        return null;
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

    public List<E> toArray(){
        return new ArrayList<E>();
    }

    public Iterator<E> iterator(){
        return (Iterator<E>) personList.iterator();
    }

//    public abstract Student[] getArray();
}