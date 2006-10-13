package mf;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class BitemporalCollectionTester extends TestCase {
	public BitemporalCollectionTester(String name) {super(name);}
	public static void main (String [] args) {
		TestRunner.run(new TestSuite(BitemporalCollectionTester.class));
	}

	private BitemporalCollection mySubject;
	private String myFranklin = "961 Franklin St";
	private String myWorcester = "88 Worcester St";
	private MfDate myJul1 = new MfDate(1996, 7, 1);
	private MfDate myJul15 = new MfDate(1996, 7, 15);
	private MfDate myAug1 = new MfDate(1996, 8, 1);
	private MfDate myAug10 = new MfDate(1996, 8, 10);

	public void setUp () {
		MfDate.setToday(new MfDate(1996,1,1));
		mySubject = new BitemporalCollection();
		mySubject.put(new MfDate(1994, 3, 1), myWorcester);
		MfDate.setToday(new MfDate(1996,8,10));
		mySubject.put(new MfDate(1996, 7, 4), myFranklin);
		MfDate.setToday(new MfDate(2000,9,11));
	}
	public void testSimpleBitemporal () {
		assertEquals("jul1 as at aug 1", myWorcester, mySubject.get(myJul1, myAug1));
		assertEquals("jul1 as at aug 10", myWorcester, mySubject.get(myJul1, myAug10));
		assertEquals("jul1 as at now", myWorcester, mySubject.get(myJul1));

		assertEquals("jul15 as at aug 1", myWorcester, mySubject.get(myJul15, myAug1));
		assertEquals("jul15 as at aug 10", myFranklin, mySubject.get(myJul15, myAug10));
		assertEquals("jul15 as at now", myFranklin, mySubject.get(myJul15));
	}

	public void testSingleTemporal2 () {
		mySubject = new BitemporalCollection();
		String Franklin963 = "963 Franklin St";
		String Damon15 = "15 Damon Ave";
		mySubject.put(new MfDate(1997, 12, 25), Franklin963);
		mySubject.put(new MfDate(1998, 8, 23), Damon15);

		assertEquals(Franklin963, mySubject.get(new MfDate(1997, 12, 25)));
		assertEquals(Franklin963, mySubject.get(new MfDate(1998, 8, 22)));
		assertEquals(Damon15, mySubject.get(new MfDate(1998, 8, 23)));
		assertEquals(Damon15, mySubject.get());
	}

}