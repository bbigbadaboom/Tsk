package Test;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        boolean hasFailures = run("src/main/resources/Test.xml");
        System.exit(hasFailures ? 1 : 0);
    }

    public static boolean run(String xml) {
        TestNG testNG = new TestNG(true);
        List<Class<? extends ITestNGListener>> classes = new ArrayList<>();
        classes.add(ReportPortalTestNGListener.class);

        testNG.setListenerClasses(classes);

        testNG.setTestSuites(Arrays.asList(xml));

        TestListenerAdapter results = new TestListenerAdapter() {
            @Override
            public void onStart(ITestContext testContext) {
                super.onStart(testContext);
            }
        };
        testNG.addListener((ITestNGListener) results);
        boolean hasFailures;
        try {
            testNG.run();
            hasFailures = results.getFailedTests().size() > 0 || results.getSkippedTests().size() > 0;
        } catch (Throwable e) {
            e.printStackTrace();
            hasFailures = true;
        }
        return hasFailures;
    }

}