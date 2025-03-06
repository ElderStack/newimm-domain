package edu.gmu.cs321;
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
    @Test
    public void testCheckNum() {
        Immigrant testTime = new Immigrant("Karl", 1);
        boolean testRest = testTime.checkNum(0);
        assertTrue( testRest );
    }
}
