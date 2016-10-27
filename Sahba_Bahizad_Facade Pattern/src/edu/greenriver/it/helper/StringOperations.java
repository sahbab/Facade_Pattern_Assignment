/**
 * 
 */
package edu.greenriver.it.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sahba bahizad
 *
 */
public final class StringOperations 

{

	// Removes duplicates
	public String[] removeDuplicates(String[] string) 
	{
		//change the array to list
		List<String> list = Arrays.asList(string);
		//add the list in set ( It will make it unique - no duplicates ) 
		Set<String> set = new HashSet<String>(list);
		return set.toArray(new String[0]);
		
	}

	public String[] resize(String[] value, int length) 
	{
		String[] newArray = new String[length];
		for( int index = 0 ; index < length ; index ++ ) 
		{
			newArray[index ] = value[index];
		}
		return newArray;
	}

	public String[] filter(String[] value, String search) 
	{
	
		if (value != null) {
			List<String> list = new ArrayList<String>(Arrays.asList(value));
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(search)) {
					list.remove(i);
				}
			}
			return list.toArray(new String[0]);
		} else {
			return new String[0];
		}
	}
	
	public void printArray(String[] value) {
		for(String item : value){
			System.out.println(item + " ");
		}
	}
}
