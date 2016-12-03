import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ForwardingListTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString() 
        		 + "\n\t" + failure.getDescription()
        		 + "\n\t" + failure.getException()
        		 + "\n----------------------------\n\n");
      }
		
      System.out.println(result.wasSuccessful()
    		  + "\nTotal  = " + result.getRunCount()
    		  + "\nFailed = " + result.getFailureCount()
    		  + "\nPassed = " + (result.getRunCount() - result.getFailureCount())
    		  + "\nIgnore = " + result.getIgnoreCount());
   }
}  