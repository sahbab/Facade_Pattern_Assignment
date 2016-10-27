package edu.greenriver.it.helper;

public class TestPartOne {

	public static void main(String[] args) {
		
		System.out.println("THIS IS A TEST RAN ON ALL THE HELPER FUNCTIONS RELATED TO THIS PACKAGE: \n ");
		
		System.out.println("*** TEST ON StringOperations CLASS *** ");
		String[] mystring = {"S", "A", "H", "B", "A"};
		StringOperations testOperations = new StringOperations();
		
		System.out.println("Original String ");
		testOperations.printArray(mystring);
		
		System.out.println("Remove duplicate String ");
		String[] myUniqueString = testOperations.removeDuplicates(mystring);
		for( String item :  myUniqueString ){
			System.out.println(item);
		}
		System.out.println("Resize String ");
		String[] myTruncatedString = testOperations.resize(mystring, 3);
		for( String item :  myTruncatedString ){
			System.out.println(item);
		}
		
		System.out.println("Filter ");
		String[] myfilteredString = testOperations.filter(mystring, "A");
		for( String item :  myfilteredString ){
			System.out.println(item);
		}
		
		System.out.println("*** TEST ON StringParsing CLASS *** ");
		String myParsString = "sbahizad@gmail.com";
		StringParsing testParsing= new StringParsing();
		System.out.println("Before @: " + testParsing.before(myParsString, "@"));
		System.out.println("After  @: " + testParsing.after(myParsString, "@"));
		
		System.out.println("*** TEST ON StringRegex CLASS *** ");
		StringRegex testRegex= new StringRegex();
		String myemail = "sbahizad@gmail.com";
		String myZipcode = "99999";
		String myPhoneNumber = "9998887777";
		String myUrl = "www.test.com";
		System.out.println("Is " + myemail + " a valid E-mail? " + testRegex.isEmail(myemail));
		System.out.println("Is " + myZipcode + " a valid zipcode? " + testRegex.isZipCode(myZipcode));
		System.out.println("Is " + myPhoneNumber + " a valid phone number? " + testRegex.isPhoneNumber(myPhoneNumber));
		System.out.println("Is " + myUrl + " a valid url? " + testRegex.isUrl(myUrl));
		
		
	}

}
