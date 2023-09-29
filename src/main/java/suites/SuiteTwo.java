package test;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectPackages(value = {""})
@IncludeClassNamePatterns("tests.test.OneTest")
public class SuiteTwo {
}
