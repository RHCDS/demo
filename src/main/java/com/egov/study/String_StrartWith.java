/**
 * String startwith()、endwith()
 */
package com.egov.study;

import java.util.LinkedList;

import org.eclipse.jdt.internal.compiler.batch.Main;

/**
 * @author hzwuguoping
 *
 */
public class String_StrartWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1= "abcd";
		String str2= "efja";
		
		System.out.println(str1.startsWith("a"));
		System.out.println(str1.startsWith("b"));
		
		System.out.println(str2.startsWith("e",0));
		System.out.println(str2.startsWith("e",1));
		System.out.println(str2.endsWith("a"));
		
		LinkedList l= new LinkedList();
		
		
	}

}
