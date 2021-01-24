/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

/**
 *
 * @author MUHAMMAD AWAIS
 */
public class Person {
    String name, pass;
    Person(String name, String pass)
    {
        this.name = name;
        this.pass = pass;
    }
    String getName()
    {
        return name;
    }
    String getPass()
    {
        return pass;
    }
}
