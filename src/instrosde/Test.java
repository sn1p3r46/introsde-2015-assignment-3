package introsde;

import java.util.List;

import java.util.Calendar;

import introsde.models.Person;
import introsde.models.MeasureDefinition;
import introsde.models.Measure;
import introsde.models.CurrentHealth;

public class Test{
  public static void main(String[] args) {
    //viewTest();
    //updateMeasure();
    updatePerson();

  }

  private static void viewTest(){
    List<Person> personList = Person.getAllPeople();
    for (Person per : personList){
      System.out.println(per.getLastname() + " " + per.getFirstname());
      List<CurrentHealth> lfList = per.getCurrentHealth();
      for(CurrentHealth lf : lfList){
        System.out.println(lf.getMeasureType() + " " + lf.getMeasureValue() + " " + lf.getDateRegistered().getYear() + " " + lf.getDateRegistered());
      }
    }
  }

  private static void testamelo(){
    Person p = new Person();
    p.setFirstname("Giacomo");
    p.setLastname("Menestò");
    p.setBirthday(30,12,1992);

    p = Person.savePerson(p);

    System.out.println(p.getFirstname());

    List<MeasureDefinition> mDefList = MeasureDefinition.getAllMeasureDefinitions();
    List<Person> personList = Person.getAllPeople();

    for (Person per : personList){
      System.out.println(per.getLastname());
    }
    p.setLastname("MENESTRO'");

    p = Person.savePerson(p);



    personList = Person.getAllPeople();

    for (Person per : personList){
      System.out.println(per.getLastname());
    }

    //Person.removePerson(p);

    personList = Person.getAllPeople();

    System.out.println("\n\n\n\n\n\n" + personList.size() + "\n\n\n\n\n\n");

    for (MeasureDefinition mdef : mDefList){
      System.out.println(mdef.getMeasureValueType() + " " + mdef.getMeasureValueType() + " " + mdef.getIdMeasureDefinition());
    }

    List<Measure> hmhList = Measure.getAll();
    System.out.println(hmhList.size());
    for(Measure hmh : hmhList){
      System.out.println(hmh.getPerson().getFirstname() + " " + hmh.getMeasureDefinition().getMeasureValueType() + " " + hmh.getMeasureValue()
      + " " + hmh.getDateRegistered().getYear());
    }

    p = personList.get(0);
    System.out.println(p.getFirstname());
    System.out.println(p.getCurrentHealth().get(0).getMeasureType());

    Person.removePerson(p);

    Person persona;
    List<CurrentHealth> lfList = CurrentHealth.getAll();
    for(CurrentHealth lf : lfList){
      System.out.println(lf.getMeasureType());
      System.out.println(lf.getMeasureValue());
      persona = lf.getPerson();
      System.out.println(persona.getFirstname());
    }
  }

  private static void updateMeasure(){
    Person p = Person.getAllPeople().get(0);
    Measure hmh = p.getMeasure().get(0);
    System.out.println(hmh.getMeasureValue());
    hmh.setMeasureValue("987");
    Person.savePerson(p);

    p = Person.getAllPeople().get(0);
    hmh = p.getMeasure().get(0);

    System.out.println(hmh.getMeasureValue());
  }

    public static void updatePerson(){
       System.out.println("\n--> TEST: updatePerson");
       Person person = Person.getAllPeople().get(1);

       person.setMeasure(Person.getAllPeople().get(2).getMeasure());
      // if(Person.getAllPeople().get(2).getMeasure()==null)
        System.out.println(Person.getAllPeople().get(0).getMeasure().size());
       //System.out.println(person.getCurrentHealth().size());
       String oldName = person.getFirstname();
       System.out.println(oldName);
       person.setFirstname( new StringBuffer(oldName).reverse().toString());
       person = Person.savePerson(person);

       System.out.println(person.getFirstname());
       //assertFalse(person.getFirstname().equals(oldName));
    }
}
