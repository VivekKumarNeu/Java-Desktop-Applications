/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vivek
 */
public class PersonDirectory {
    
    
    private ArrayList<Person> Personlist;
    
    public PersonDirectory()
    {
        this.Personlist = new ArrayList<>();
    }

    public ArrayList<Person> getpersonlist() {
        return Personlist;
    }

    public void setPersonList(ArrayList<Person> personlist) {
        this.Personlist = personlist;
    }
    
    public Person addnewperson(){
    
        Person person = new Person();
        this.Personlist.add(person);
        return person;
    }
    
    public void deleteperson(Person person)
    {
        getpersonlist().remove(person);
    }
    
    
    public Person searchPerson(String PersonName){
    
        for (Person p: this.Personlist ) {
            // check if account has a Person number
            if(p.getPersonname().equals(PersonName))
                return p;
        }
        return null;
    }
}
