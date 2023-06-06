import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void canMakeArithmeticProgressionTest1() {
        int[] arr = {3, 5, 1};
        Assert.assertTrue(new Solution().canMakeArithmeticProgression(arr));
    }

    @Test
    public void canMakeArithmeticProgressionTest2() {
        int[] arr = {1, 2, 4};
        Assert.assertFalse(new Solution().canMakeArithmeticProgression(arr));
    }
}
