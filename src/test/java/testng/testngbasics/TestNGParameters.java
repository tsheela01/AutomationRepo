package testng.testngbasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

        @Test
        @Parameters ({"val1", "val2"})
        public void Sum(int v1, int v2)
        {
            int sum = v1 + v2;
            System.out.println("The final sum of the given values is " + sum);
        }

    @Test
    @Parameters ({"val1", "val2"})
    public void Subtract(int v1, int v2)
    {
        int sub = v1 - v2;
        System.out.println("The final subtraction of the given values is " + sub);
    }
    }

