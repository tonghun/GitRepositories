package com.javase.classtest;

public class PrivateRight {
	public static void main(String[] args) {
		PrivateModel p = new PrivateModel();
		String return_vari = p.accessPrivateVari();
		System.out.println(return_vari);
	}

}
