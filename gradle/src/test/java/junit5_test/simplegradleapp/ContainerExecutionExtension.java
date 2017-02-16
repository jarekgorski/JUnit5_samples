package junit5_test.simplegradleapp;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ContainerExecutionCondition;
import org.junit.jupiter.api.extension.ContainerExtensionContext;

public class ContainerExecutionExtension implements ContainerExecutionCondition {


    @Override
    public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
        System.out.println("\nContainer extension");
        return ConditionEvaluationResult.enabled("It will run because I like it!");
     //   return ConditionEvaluationResult.disabled("It won't run because I don't like it!");
    }
}
