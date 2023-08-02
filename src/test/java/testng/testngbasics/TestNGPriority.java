package testng.testngbasics;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test (priority=1)
    public void alpha(){
        System.out.println("This is a Alpha test case");
    }

    @Test (priority=3)
    public void beta() {
        System.out.println("This is a Beta test case");
    }

    @Test (priority=2)
    public void delta() {
        System.out.println("This is a Delta test case");
    }

    @Test
    public void gamma() {
        System.out.println("This is a Gamma test case");
    }

    @Test
    public void ulka() {
        System.out.println("This is a Ulka test case");
    }
}

