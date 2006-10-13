package mf;

import java.util.Dictionary;
import java.util.Hashtable;


public class Registry		{

	private static Registry ourSoleInstance = new Registry();
	private Dictionary myEntryPoints = new Hashtable();
	public static void add (String entryPoint, NamedObject newObject)	{
		ourSoleInstance.addObj(entryPoint, newObject);
	}
	private void addObj (String entryPointName, NamedObject newObject)	{
		Dictionary theEntryPoint = (Dictionary) myEntryPoints.get(entryPointName);
		if (theEntryPoint == null)	{
			theEntryPoint = new Hashtable();
			 myEntryPoints.put(entryPointName, theEntryPoint);
		}
		theEntryPoint.put(newObject.name(), newObject);
	}
	private void assertNonNull(Object arg, String message) {
		if (arg == null) throw new NullPointerException(message);
	}
	public static NamedObject get (String entryPointName, String objectName)	{
		return ourSoleInstance.getObj(entryPointName, objectName);
	}
	private NamedObject getObj (String entryPointName, String objectName)	{
		Dictionary theEntryPoint = (Dictionary) myEntryPoints.get(entryPointName);
		assertNonNull (theEntryPoint, "No entry point present for " + entryPointName);
		NamedObject answer = (NamedObject) theEntryPoint.get(objectName);
		assertNonNull (answer, "There is no " + entryPointName + " called " + objectName);
		return answer;
	}
}
