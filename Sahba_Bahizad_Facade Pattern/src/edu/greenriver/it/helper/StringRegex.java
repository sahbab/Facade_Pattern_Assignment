package edu.greenriver.it.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringRegex {

	/**
	 * 
	 * @param subject
	 * @return Returns true if the subject is a valid email address
	 */
	public static boolean isEmail(String subject) {

		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(subject);
		return matcher.find();

	}

	/**
	 * 
	 * @param subject
	 * @return Returns true if the subject is either of the following formats:
	 *         88888 or 88888-7777
	 */
	public static boolean isZipCode(String subject) {
		final Pattern VALID_ZIP_CODE_REGEX = Pattern.compile("^\\d{5}(-\\d{4})?$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_ZIP_CODE_REGEX.matcher(subject);
		return matcher.find();

	}

	/**
	 * 
	 * @param subject
	 * @return Returns true if the subject is either of the following formats:
	 *         999-888-7777 or 9998887777
	 */
	public static boolean isPhoneNumber(String subject) {
		final Pattern VALID_ZIP_CODE_REGEX = Pattern.compile("^(\\d{3}-?\\d{3}-?\\d{4})$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_ZIP_CODE_REGEX.matcher(subject);
		return matcher.find();

	}

	/**
	 * 
	 * @param subject
	 * @return Returns true if the subject is a valid url
	 */
	public static boolean isUrl(String subject) {
		final Pattern VALID_ZIP_CODE_REGEX = Pattern.compile("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_ZIP_CODE_REGEX.matcher(subject);
		return matcher.find();

	}

}
