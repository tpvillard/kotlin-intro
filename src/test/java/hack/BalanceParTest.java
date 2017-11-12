package hack;


import org.junit.Assert;
import org.junit.Test;

public class BalanceParTest {

    @Test
    public void test_everything_is_balanced() {

        Assert.assertFalse(BalancedParAnalyzer.isBalanced("}"));
        Assert.assertTrue(BalancedParAnalyzer.isBalanced("{}"));
        Assert.assertFalse(BalancedParAnalyzer.isBalanced("{}["));
        Assert.assertTrue(BalancedParAnalyzer.isBalanced("{}[]()"));
        Assert.assertTrue(BalancedParAnalyzer.isBalanced("{[[]]}"));
        Assert.assertFalse(BalancedParAnalyzer.isBalanced("{[(]]}"));

    }
}
