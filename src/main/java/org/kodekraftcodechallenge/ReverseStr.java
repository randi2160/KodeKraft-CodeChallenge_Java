package org.kodekraftcodechallenge;

public class ReverseStr {

    /*
    SCENARIOS:
     System.out.println(revStr("apple")); // elppa
     System.out.println(revStr("John")); // nhoJ
     System.out.println(revStr("phone")); // enohp
    system.out.println(revStr("1234567")); // 7654321
 */
    /*###################approach ##############
     * 1. apple  - word - Lets turn it into an array of char
     * apple   and i want to
     * StringBuilder() str = new StringBuilder()
     * start = 0  end = i= str.length -1
     *
     * */
    public  String reverse(String str){

        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

}
