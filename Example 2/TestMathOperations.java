import static org.junit.Assert.*;
import org.junit.*;

public class TestMathOperations {
    private MathOperations mathOperations;

    @Before
    public void setUp() {
        // This method is executed before each test.
        mathOperations = new MathOperations();
    }

    @After
    public void tearDown() {
        // This method is executed after each test.
        mathOperations = null;
    }

    @Test
    public void testAdd() {
        int result = mathOperations.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = mathOperations.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int result = mathOperations.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    public void testDivide() {
        int result = mathOperations.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    (expected = ArithmeticException.class)
    public void testDivideByZero() {
        mathOperations.divide(10, 0);
    }

    @Test
    @Ignore("This test is ignored for demonstration purposes.")
    public void testIgnoredTest() {
        // This test will be ignored and not executed.
        fail("This test should be ignored.");
    }
}

//Explanation:
//
//We have a MathOperations class with four basic math operations (addition, subtraction, multiplication, and division).
//In the TestMathOperations class, we use JUnit to test each method of the MathOperations class.
//We use @Before and @After annotations to set up and clean up resources before and after each test, respectively.
//The @Test annotation marks the test methods, and they are executed when running the JUnit tests.
//We use various assertions like assertEquals, assertTrue, assertFalse, and fail to verify the correctness of the methods' output.
//We use @Test(expected = Exception.class) to test expected exceptions (division by zero).
//When you run the TestMathOperations class as a JUnit test, JUnit will execute each test method and report the results.
