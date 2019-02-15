package junitTestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DateDifferenceTest.class, DateDifferenceTest1.class })
public class AllTests {

}
