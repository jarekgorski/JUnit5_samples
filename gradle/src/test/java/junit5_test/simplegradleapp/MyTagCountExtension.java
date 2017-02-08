package junit5_test.simplegradleapp;

import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;

import java.util.HashMap;
import java.util.Map;

public class MyTagCountExtension implements BeforeTestExecutionCallback, AfterAllCallback, AfterEachCallback {

    private static final Namespace NAMESPACE =
            Namespace.create("my", "own", "namespace");
    private static final String TAG_COUNT_KEY = "TagMap";

    @Override
    public void beforeTestExecution(TestExtensionContext context) {
        Map<String, String> tagCountSummaryMap = new HashMap<>();

        if (context.getParent().get().getStore(NAMESPACE).get(TAG_COUNT_KEY, HashMap.class) == null) {
            context.getParent().get().getStore(NAMESPACE).put(TAG_COUNT_KEY, new HashMap<String, Long>());
        }
        for (String foundTag : context.getTags()) {
            Long currentValue = (Long) context.getParent().get().getStore(NAMESPACE).get(TAG_COUNT_KEY, HashMap.class).get(foundTag);
            if (currentValue == null) {
                currentValue = 0L;
            }
            currentValue++;
            context.getParent().get().getStore(NAMESPACE).get(TAG_COUNT_KEY, HashMap.class).put(foundTag, currentValue);
            System.out.println("Currently executed " + currentValue + " tests with tag: " + foundTag);
            tagCountSummaryMap.put(foundTag, Long.toString(currentValue));
        }
        System.out.println("Test " + context.getDisplayName() + " executed!");
        context.publishReportEntry(tagCountSummaryMap);
    }

    @Override
    public void afterAll(ContainerExtensionContext context) throws Exception {
        // not called after all executed!
        double x = 2/0;
        System.out.println("after all");
    }

    @Override
    public void afterEach(TestExtensionContext context) throws Exception {
        System.out.println("after each");
    }
}
