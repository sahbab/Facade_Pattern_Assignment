package edu.greenriver.it.helper;

public class TestPartOne {

	public static void main(String[] args) {
		
		
//		String[] mystring = {"S", "A", "H", "B", "A"};
//		StringOperations testOperations = new StringOperations();
//		
//		System.out.println("Original String ");
//		testOperations.printArray(mystring);
//		
//		System.out.println("Remove duplicate String ");
//		String[] myUniqueString = testOperations.removeDuplicates(mystring);
//		for( String item :  myUniqueString ){
//			System.out.println(item);
//		}
//		System.out.println("Resize String ");
//		String[] myTruncatedString = testOperations.resize(mystring, 3);
//		for( String item :  myTruncatedString ){
//			System.out.println(item);
//		}
//		
//		System.out.println("Filter ");
//		String[] myfilteredString = testOperations.filter(mystring, "A");
//		for( String item :  myfilteredString ){
//			System.out.println(item);
//		}
		
		String mystring = "sbahizad@gmail.com";
		StringParsing testParsing= new StringParsing();
		System.out.println("Before @: " + testParsing.before(mystring, "@"));
		System.out.println("After  @: " + testParsing.after(mystring, "@"));
		
	}

}
