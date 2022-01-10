package org.get;


public class GetMethod {
	
	private void apple () {
		System.out.println("Apple is no 1 ");
	}
	private void iPhone() {
		System.out.println("Iphone is no 2");
	}
	private void nokia() {
		System.out.println("Nokia is no 3");
	}
	private void samsung() {
		System.out.println("Samsung is no4");
	}
	private void vodofone() {
		System.out.println("Vodofone is no5");
	}
	public static void main (String[] args) {
		GetMethod g = new GetMethod();
		g.apple();
		g.iPhone();
		g.nokia();
		g.samsung();
		g.vodofone();
	}
	

}
