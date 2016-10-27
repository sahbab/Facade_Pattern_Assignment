/**
 * 
 */
package edu.greenriver.it.facade;

import edu.greenriver.it.helper.StringRegex;

/**
 * @author sahba bahizad
 *
 */
public final class Facade {

	public static boolean validate(ValidationType type, String subject) {
		boolean result = false;
		StringRegex regexValidation = new StringRegex();
		switch (type) {
		case EMAIL: 
			result = regexValidation.isEmail(subject);
			break;
		case ZIPCODE: 
			result = regexValidation.isZipCode(subject);
			break;
		case PHONE_NUMBER: 
			result = regexValidation.isPhoneNumber(subject);
			break;
		case URL: 
			result = regexValidation.isUrl(subject);
			break;
		default:
			break;
		}
		return result;
	}

	public static Operator getOperator(String[] subject) {
		return null;
	}
}
