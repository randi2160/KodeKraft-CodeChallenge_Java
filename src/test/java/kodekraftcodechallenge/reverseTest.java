package kodekraftcodechallenge;
import org.kodekraftcodechallenge.ReverseStr;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/*
 SCENARIOS:
  System.out.println(revStr("apple")); // elppa
  System.out.println(revStr("John")); // nhoJ
   System.out.println(revStr("phone")); // enohp
    ystem.out.println(revStr("1234567")); // 7654321
 */

/*###################approach ##############
* 1. apple  - word - Lets turn it into an array of char
* apple   and i want to
* StringBuilder() str = new StringBuilder()
* start = 0  end = i= str.length -1
*
* */



public class reverseTest {

    // Reverse Test

    // Test method using DataProvider
    @Test(dataProvider = "reverseStrings")
    public void testReverse(String input, String expected) {
        ReverseStr reverseStr = new ReverseStr();  // Assuming ReverseStr contains the reverse method
        String result = reverseStr.reverse(input);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "reverseStrings")
    public Object[][] provideStrings() {
        return new Object[][] {
                {"apple", "elppa"},
                {"John", "nhoJ"},
                {"phone", "enohp"},
                {"1234567", "7654321"},
                {"", ""},  // Test with an empty string
                {"a", "a"}  // Test with a single character
        };
    }


    }










