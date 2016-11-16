package com.bluecry.Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*This program is used for counting the number of a characters in a string. 
 * For example stringCharCount("abacca") should return 
 * "{a=3, b=1, c=2}"
 * 
 * */

public class SecondMain {
	public static void main(String[] args) {
		stringCharCount("abacca");
	}
	
	static void stringCharCount(String inputString)
    {
        //Creating a HashMap containing character as a key and occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        //Get length of string
        int stringLen = inputString.length();
        
        //Loop through to grab characters and add to the HashMap with letter as key
        for (int i=stringLen-1;i>=0;i--){
			char currentChar = inputString.charAt(i);
			if(charCountMap.containsKey(currentChar))
            {
                //If current character is present in charCountMap, incrementing it's count by 1
                charCountMap.put(currentChar, charCountMap.get(currentChar)+1);
            }
            else
            {
                //If current character is not present in charCountMap,
                //put this char to charCountMap with 1 as it's value
                charCountMap.put(currentChar, 1);
            }
		}
        
        //Now sort the values by the key (i.e. alphabetically)
        Map<Character, Integer> map = new TreeMap<Character, Integer>(charCountMap);
        System.out.println(map);
    }
}
