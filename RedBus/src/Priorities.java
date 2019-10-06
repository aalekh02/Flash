import org.testng.annotations.*;

public class Priorities {

	@Test(priority = 0)
	public void method1() {
	}

	@Test(priority = 1)
	public void method2() {
	}

	@Test(priority = 2)
	public void method3() {
	}
}

//// Advantages of Testng over Junit
// - Added Advantage and Easy Annotation
// - Execution Patterns can set
// -Parallel Execution of Scripts
// - Test Case dependencies can be defined

//
//// Advantages of Automation Framework:
// -Reusabiltiy of code
// -Maximum Coverage
// -Recovery Scenario
// -Minimal Manual Intervention
// -Low Cost Maintainance
// -Easy Reporting

//
//// Types of Framework:
// -Module Base Framework:
// Module Based testing Framework divides the entire AUT into logical and
// isolated modules.for each module we can write a test script
// Thus wen these scripts are taken together ,they represents a larger script
// representing more than one module

// --Library Architecture Testing Framework:
// The basic fundamental behind this framework is to determine the common steps
// and group them into functions under a library and call those functions in the
// test script whenever required

//// --DataDriven Framework:
// Datadriven framework allows the user to segregate the test script logic and
//// test data from each other.
// It allows the user to store test data into an external database
// The data is conventionally stored in key-value pairs
// Thus the key can be used to access and populate the data from within the test
//// scripts.

// ---KeywordDrivenFramework:
// Keyword driven framework is an extension to datadriven framework in a sense
// that it not only segregates the test data from
// script,but also keeps a certain set of code belonging to the test script into
// an external data file

//// --Hybid DrivenFramework
// Hybrid driven framework is combination of more than one of above mentioned
//// frameworks.The main advantages of this set up
// is that it leverages the benefits of all kind of associated frameworks

// TestData can be read from excel using jxl or apache poi API