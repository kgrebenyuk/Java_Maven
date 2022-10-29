import UnitTesting.MyClass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyClassTest {

    MyClass myClass = new MyClass();

    @Test
    public void shouldGetReturnAverageOfArray() {
        double[] testArray = {1, 2, 3, 4, 5};
        double expectedResult = 3;
        double actualResult = myClass.averageOfArray(testArray);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void shouldGetReturnCheckOfMAtrixSquare() {
        int[][] testArray = {{1, 2, 3}, {3, 2, 1}, {1, 1, 1}};

        assertTrue(myClass.ifMatrixIsSquare(testArray));
    }

}
