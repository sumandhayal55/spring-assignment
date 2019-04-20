package com.ui.demo.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class SuiteRunner {

	private TestNG testNG;
	@SuppressWarnings("serial")
	private static final List<String> suites = new ArrayList<String>() {
		{
			add("src/test/java/suites/testng.xml");
		}
	};

	@Test
	public void run() {
		testNG = new TestNG();
		testNG.setTestSuites(suites);
		testNG.run();
	}

}
