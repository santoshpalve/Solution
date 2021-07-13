/**
 * 
 */
package com.solutions;

import org.springframework.stereotype.Component;

/**
 * @author Santosh
 *
 */
@Component
public class StringUtils {
	private StringUtils() {
		super();
	}

	public static void stringManupulation(String string) {
		if (!string.isEmpty()) {
			System.out.println("Manupulated String : " + string);
		}
	}
}
