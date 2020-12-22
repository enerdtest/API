package utilities;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.*;

public class testIReport implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        // Second parameter of this method ISuite will contain all the suite executed.
        for (ISuite iSuite : suites){
            //Get a map of result of a single suite at a time
            Map<String, ISuiteResult> resultMap = iSuite.getResults();
            //Get the key of the result map
            Set<String> keys = resultMap.keySet();
            //Go to each map value one by one
            for (String key : keys){
                //The Context object of current result
                ITestContext context = resultMap.get(key).getTestContext();
                //Print Suite detail in Console
                System.out.println("Suite Name ==>>" + context.getName()
                + "\n ::Report output Directory ==>>" + context.getOutputDirectory()
                        +"\n::Suite Name ==>>" +context.getSuite().getName()
                +"\n::Start Date Time for execution ==>>" +context.getStartDate()
            +"\n::End Date Time for execution ==>>" +context.getEndDate());
            //Get Map for only failed test cases
                IResultMap iResultMap = context.getFailedTests();
                //Get method detail of failed test cases
                Collection<ITestNGMethod> failedMethods = iResultMap.getAllMethods();
                //Loop one by one in all failed methods
                System.out.println("-------------FAILED TEST CASES---------------");
                for (ITestNGMethod iTestNGMethod : failedMethods){
                    //Print failed test cases details
                    System.out.println("Testcase Name ==>>" +iTestNGMethod.getMethodName()
                    +"\nTest priority ==>>" +iTestNGMethod.getPriority()
                            +"\n Test Description ==>>" +iTestNGMethod.getDescription()
                    +"\nDate ==>>" + new Date(iTestNGMethod.getDate()));
                }
            }
        }
    }
}
