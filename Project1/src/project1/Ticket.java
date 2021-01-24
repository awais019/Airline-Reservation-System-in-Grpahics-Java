/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.ArrayList;

/**
 *
 * @author MUHAMMAD AWAIS
 */
public class Ticket {
    String name, passport, destination, from, date, classseat;
    ArrayList<Person> persons = new ArrayList<Person>();
    Ticket()
    {
        
    }
    Ticket(String name,String passport,String destination,String from,String date,String classseat)
    {
        this.name = name;
        this.passport = passport;
        this.destination = destination;
        this.from = from;
        this.date = date;
        this.classseat = classseat;
    }
    String getName()
    {
        return name;
    }
    String getPassport()
    {
        return passport;
    }
    String getDestination()
    {
        return destination;
    }
    String getFrom()
    {
        return from;
    }
    String getDate()
    {
        return date;
    }
    String getClassseat()
    {
        return classseat;
    }
    void addPerson(Person user)
    {
        persons.add(user);
    }
}
