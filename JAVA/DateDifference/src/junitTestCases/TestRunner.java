package junitTestCases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
public static void main(String[] args) {
	Result result=JUnitCore.runClasses(DateDifferenceTest.class, DateDifferenceTest1.class );
}
}
