package testng.testngbasics;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiply {

    @Test
    @Parameters({"val1", "val2"})
    public void Multiply(int v1, int v2)
    {
        int multiply = v1 * v2;
        System.out.println("The final multiplication of the given values is " + multiply);
    }
}


