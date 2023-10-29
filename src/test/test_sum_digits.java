package test;
import main.sum_digits;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class test_sum_digits {
    @Test
    public void testSumDigits() {
        //正常输入测试
        sum_digits test = new sum_digits();
        int result = test.sumDigits("123");

        assertEquals(6, result);

    }
}
