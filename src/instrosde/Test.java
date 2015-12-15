package introsde;

import java.util.List;

import java.util.Calendar;

import introsde.models.Person;
import introsde.models.MeasureDefinition;
import introsde.models.HealthMeasureHistory;
import introsde.models.LifeStatus;

public class Test{
  public static void main(String[] args) {
    //viewTest();
    updateMeasure();
  }

  private static void viewTest(){
    List<Person> personList = Person.getAllPeople();
    for (Person per : personList){
      System.out.println(per.getLastname() + " " + per.getFirstname());
      List<LifeStatus> lfList = per.getLifeStatus();
      for(LifeStatus lf : lfList){
        System.out.println(lf.getMeasureName() + " " + lf.getValue() + " " + lf.getTimestamp().getYear() + " " + lf.getTimestamp());
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
      System.out.println(mdef.getMeasureName() + " " + mdef.getMeasureType() + " " + mdef.getIdMeasureDefinition());
    }

    List<HealthMeasureHistory> hmhList = HealthMeasureHistory.getAll();
    System.out.println(hmhList.size());
    for(HealthMeasureHistory hmh : hmhList){
      System.out.println(hmh.getPerson().getFirstname() + " " + hmh.getMeasureDefinition().getMeasureName() + " " + hmh.getValue()
      + " " + hmh.getTimestamp().getYear());
    }

    p = personList.get(0);
    System.out.println(p.getFirstname());
    System.out.println(p.getLifeStatus().get(0).getMeasureName());

    Person.removePerson(p);

    Person persona;
    List<LifeStatus> lfList = LifeStatus.getAll();
    for(LifeStatus lf : lfList){
      System.out.println(lf.getMeasureName());
      System.out.println(lf.getValue());
      persona = lf.getPerson();
      System.out.println(persona.getFirstname());
    }
  }

  private static void updateMeasure(){
    Person p = Person.getAllPeople().get(0);
    HealthMeasureHistory hmh = p.getHealthMeasureHistory().get(0);
    System.out.println(hmh.getValue());
    hmh.setValue("987");
    Person.savePerson(p);

    p = Person.getAllPeople().get(0);
    hmh = p.getHealthMeasureHistory().get(0);

    System.out.println(hmh.getValue());




  }
}
