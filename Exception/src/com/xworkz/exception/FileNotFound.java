package com.xworkz.exception;

import java.io.IOException;
import java.io.PrintWriter;

public class FileNotFound {

	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter(Calculator.java);
		//pw.println("Hello");
	try {
		pw.println("Hello");
	} catch (IOException e) {
		System.out.println(e.getClass().getSimpleName());
	}
	}
}
