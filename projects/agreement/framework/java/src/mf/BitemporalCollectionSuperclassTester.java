package mf;

public class BitemporalCollectionSuperclassTester extends TemporalCollectionTester {
	public BitemporalCollectionSuperclassTester(String name) {
		super(name);
	}
	protected void createSubject() {
		mySubject = new BitemporalCollection();
	}

}
