package introsde.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.lang.Boolean;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJunit.class);
      for (Failure failure : result.getFailures()) {
         System.out.println("[ERROR ON TESTS]: " + failure.toString().toUpperCase());
      }
      System.out.println("[TESTS PASSED] " + Boolean.toString(result.wasSuccessful()).toUpperCase());
   }
}
