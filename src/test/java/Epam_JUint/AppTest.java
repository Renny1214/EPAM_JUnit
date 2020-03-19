package Epam_JUint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{

    StringConversion stringConversion;

    @Before
    public void initatingClass()
    {
        this.stringConversion = new StringConversion();
    }

    @Test
    public void test1()
    {
        String result = stringConversion.removeA("ABCD");
        assertEquals("BCD",result);
    }

    @Test
    public void test2()
    {
        String result = stringConversion.removeA("ABCD");
        assertEquals("BCD",result);
    }

    @Test
    public void test3()
    {
        String result = stringConversion.removeA("AABC");
        assertEquals("BC",result);
    }

    @Test
    public void test4()
    {
        String result = stringConversion.removeA("BCCD");
        assertEquals("BCCD",result);
    }

    @Test
    public void test5()
    {
        String result = stringConversion.removeA("AABAA");
        assertEquals("BAA",result);
    }

}
