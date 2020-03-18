package com.fixMyShip.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.fixMyShip.test.BoundaryTest;
import com.fixMyShip.test.ExceptionTest;
import com.fixMyShip.test.FunctionalTest;


public class TestExecutor {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		Result result = junit.run(FunctionalTest.class);
		try {
			resultFunctionalReport(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = junit.run(ExceptionTest.class);
		try {
			resultExceptionConditionReport(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = junit.run(BoundaryTest.class);

		try {
			resultBoundaryConditionReport(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void resultFunctionalReport(Result result) throws IOException {
	    System.out.println("Finished... Result: Failures: " +
	      result.getFailureCount() + ". Ignored: " +
	      result.getIgnoreCount() + ". Tests run: " +
	      result.getRunCount() + ". Time: " +
	      result.getRunTime() + "ms." );
	    String res = "";
	    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
	    FileUtils.writeStringToFile(new File("output.txt"), res);
	}
	public static void resultExceptionConditionReport(Result result) throws IOException {
	    System.out.println("Finished... Result: Failures: " +
	      result.getFailureCount() + ". Ignored: " +
	      result.getIgnoreCount() + ". Tests run: " +
	      result.getRunCount() + ". Time: " +
	      result.getRunTime() + "ms." );
	    String res = "";
	    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
	    FileUtils.writeStringToFile(new File("output_exception.txt"), res);
	}
	public static void resultBoundaryConditionReport(Result result) throws IOException {
	    System.out.println("Finished... Result: Failures: " +
	      result.getFailureCount() + ". Ignored: " +
	      result.getIgnoreCount() + ". Tests run: " +
	      result.getRunCount() + ". Time: " +
	      result.getRunTime() + "ms." );
	    String res = "";
	    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
	    FileUtils.writeStringToFile(new File("output_boundary.txt"), res);
	}
	

}
