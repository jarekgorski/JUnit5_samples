package junit5_test.simplegradleapp;

import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class ExceptionHandlingExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(
            TestExtensionContext context, Throwable throwable) throws Throwable {
      System.out.println("You're a bad boy! " + throwable.getMessage());
      if (!(throwable instanceof ArithmeticException)) {
          throw throwable;
      }
    }
}
