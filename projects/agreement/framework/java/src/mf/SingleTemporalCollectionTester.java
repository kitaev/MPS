package mf;

public class SingleTemporalCollectionTester extends TemporalCollectionTester {
	public SingleTemporalCollectionTester(String name) {
		super(name);
	}
	protected void createSubject() {
		mySubject = new SingleTemporalCollection();
	}
	public void testCopy() {
		TemporalCollection copy = ((SingleTemporalCollection) mySubject).copy();
		assertEquals("after dec ish", copy.get(1999,12,30));
		assertEquals("after dec ish", copy.get(2000,2,1));

		//alter copy, check subject not changed
		copy.put (new MfDate(2000,2,1), "feb");
		assertEquals("after dec ish", copy.get(1999,12,30));
		assertEquals("feb", copy.get(2000,2,1));
		assertEquals("after dec ish", mySubject.get(1999,12,30));
		assertEquals("after dec ish", mySubject.get(2000,2,1));
	}

}
