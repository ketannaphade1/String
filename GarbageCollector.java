package com.yash.StringPrograms;

public class GarbageCollector {
	String st;

	public GarbageCollector(String st) {
		super();
		this.st = st;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Garbage collector");
	}

	public static void main(String[] args) {
		GarbageCollector gc = new GarbageCollector("yash");
		GarbageCollector g2 = new GarbageCollector("yash");
		gc = null;
		System.gc();
	}

}