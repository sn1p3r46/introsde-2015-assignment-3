package introsde.test;

import introsde.models.Person;
import introsde.models.HealthMeasureHistory;
import introsde.models.MeasureDefinition;

import static org.junit.Assert.*;
import java.util.List;
import java.lang.StringBuffer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.assertEquals;
public class TestJunit {

   private int pid;

   @Test
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }

   @Test
   public void readPersonListTest() {
      System.out.println("--> TEST: readPersonList");
      List<Person> list = Person.getAllPeople();
   for (Person person : list) {
      System.out.println("--> Person = "+person.getFirstname());
   }
   assertTrue(list.size()>2);
}
   @Test
   public void deletePerson(){
      System.out.println("\n--> TEST: deletePerson");
      List<Person> list = Person.getAllPeople();
      int prec_number = list.size();
      System.out.println(list.size());

      System.out.println("-->[DELETING] PERSON ID: " +  list.get(1).getIdPerson());
      Person.removePerson(list.get(1));

      assertTrue(Person.getAllPeople().size() < prec_number);
   }

   @Test
   public void createPerson(){
      System.out.println("\n--> TEST: createPerson");

      List<Person> list = Person.getAllPeople();
      int prec_number = list.size();
      System.out.println(prec_number);

      Person p = new Person();
      p.setFirstname("Giacomo");
      p.setLastname("Menestò");
      p.setBirthday(30,12,1992);

      p = Person.savePerson(p);

      System.out.println(list.size());

      assertTrue(Person.getAllPeople().size() > prec_number);
   }

   @Test
   public void updatePerson(){
      System.out.println("\n--> TEST: updatePerson");
      Person person = Person.getAllPeople().get(Person.getAllPeople().size()-1);
      String oldName = person.getFirstname();
      System.out.println(oldName);
      person.setFirstname( new StringBuffer(oldName).reverse().toString());
      person = Person.savePerson(person);

      System.out.println(person.getFirstname());
      assertFalse(person.getFirstname().equals(oldName));
   }

   @Test
   public void getPerson(){
      System.out.println("\n--> TEST: getPerson");
      System.out.println("GETTING PERSON ID: " + pid);
      System.out.println(pid);
      Person p = Person.getPersonById(pid);
      assertNotNull(p);
   }

   @Test
   public void updateMeasure(){

      System.out.println("\n--> TEST: updateMeasure");

      Person p = Person.getAllPeople().get(0);
      HealthMeasureHistory hmh = p.getHealthMeasureHistory().get(0);
      String oldValue = hmh.getValue() + "10";
      System.out.println("[OLD VALUE] : " + oldValue);

      hmh.setValue(new StringBuffer(oldValue).reverse().toString());
      Person.savePerson(p);

      p = Person.getAllPeople().get(0);
      hmh = p.getHealthMeasureHistory().get(0);
      System.out.println("[NEW VALUE] : " + hmh.getValue());
      assertFalse(hmh.getValue().equals(oldValue));
   }

   @Test
   public void readPersonHistory(){
      System.out.println("\n--> TEST: readPersonHistory");
      List<HealthMeasureHistory> hmh = HealthMeasureHistory.readPersonHistory(1L,"height");
      if(hmh!=null){
         System.out.println("hmh List dimension: " + hmh.size());
      }
      assertTrue(hmh!=null);
   }

   @Test
   public void readMeasureTypes(){
      System.out.println("\n--> TEST: readMeasureTypes");
      List<MeasureDefinition> md = MeasureDefinition.getAllMeasureDefinitions();
      assertTrue(md.size()>2);
   }

   @Test
   public void readPersonMeasure(){
      System.out.println("\n--> TEST: readPersonMeasure");

      HealthMeasureHistory hmh = HealthMeasureHistory.getHealthMeasureHistoryByPidAndMid(1L,"height",1L);
      assertNotNull(hmh);
   }

   @Test
   public void savePersonMeasure(){

      System.out.println("\n--> TEST: savePersonMeasure");

         HealthMeasureHistory hmh = new HealthMeasureHistory();
         MeasureDefinition md = MeasureDefinition.getMeasureDefinitionByName("height");
         hmh.setValue("000");
         hmh.setMeasureDefinition(md);
         hmh = HealthMeasureHistory.savePersonMeasure(1L,hmh);

         assertTrue(hmh.getIdMeasureHistory() != 0);
   }


   @Test
   public void updatePersonMeasure(){

      System.out.println("\n--> TEST: updatePersonMeasure");
         HealthMeasureHistory hmh = new HealthMeasureHistory();
         MeasureDefinition md = MeasureDefinition.getMeasureDefinitionByName("height");
         hmh.setValue("000");
         hmh.setMeasureDefinition(md);
         hmh = HealthMeasureHistory.savePersonMeasure(1L,hmh);
         System.out.println(hmh.getValue());
         hmh.setValue("129");
         hmh = HealthMeasureHistory.updatePersonMeasure(1L,hmh);
         System.out.println(hmh.getValue());
         assertTrue(hmh.getValue().equals("129"));
   }


   @Before
   public void setUp() {
      pid = Person.getAllPeople().get(0).getIdPerson();
   }

   /**
    * Tears down the test fixture.
    * (Called after every test case method.)
    */
   @After
   public void tearDown() {
      pid = 0;
   }
}
