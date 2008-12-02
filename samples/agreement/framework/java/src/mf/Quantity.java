/*
 * Copyright 2003-2008 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mf;

public class Quantity {
	protected double myAmount;
	protected Unit myUnit;
	protected Quantity () {}	//to be used by NullQuantity
	public Quantity (double amount, Unit unit) {
		requireNonNull(unit);
		myAmount = amount;
		myUnit = unit;
	}
	public Quantity (int amount, Unit unit) {
		this ((double) amount, unit);
	}
	public Quantity (String amountString, Unit unit)	{
		this (new Double(amountString), unit);
	}
	public Quantity abs() {
		return (isPositive()) ?
			this :
			newObject(Math.abs(getAmount()), myUnit);
	}
	public Quantity add (Quantity arg) {
	    requireSameUnitsAs(arg);
	    return newObject (getAmount() + arg.getAmount(), myUnit);
	}
	public String amountString() {
	    return String.valueOf(getAmount());    
	}
	public Quantity divide (double arg) {
		return newObject (getAmount() / arg, myUnit);
	}
	public boolean equals(Object arg) {
	    if (!(arg instanceof Quantity)) return false;
	    Quantity other = (Quantity) arg;
		return (myUnit.equals(other.myUnit) && (getAmount() == other.getAmount()));
	}
	public double getAmount() {
		return myAmount;
	}
	public boolean isGreaterThan(Quantity arg) {
		requireSameUnitsAs(arg);
		return !isLessThanOrEqualTo(arg);
	}
	public boolean isGreaterThanOrEqualTo(Quantity arg) {
		requireSameUnitsAs(arg);
		return !isLessThan(arg);
	}
	public boolean isLessThan(Quantity arg) {
		requireSameUnitsAs(arg);
		return getAmount() < arg.getAmount();
	}
	public boolean isLessThanOrEqualTo(Quantity arg) {
		requireSameUnitsAs(arg);
		return isLessThan(arg) || equals(arg);
	}
	public boolean isNegative()
	{
		return (getAmount() < 0);
	}
	public boolean isNull() {
		return false;
	}
	public boolean isPositive()
	{
		return ! isNegative();
	}
	public Quantity max (Quantity arg) {
		return (isGreaterThan(arg)) ?
			this :
			arg;
	}
	public Quantity min (Quantity arg) {
		return (isLessThan(arg)) ?
			this :
			arg;
	}
	public Quantity multiply (double arg) {
		return newObject (getAmount() * arg, myUnit);
	}
protected Quantity newObject (double amount, Unit unit) {
	return new Quantity (amount, unit);
}
	public boolean notEquals(Quantity arg) {
	    return ! this.equals(arg);
	}
	protected void requireNonNull(Object arg) {
		if (arg == null) throw new NullPointerException(toString() + " ran into nil");
	}
	protected void requireSameUnitsAs(Quantity arg) {
		if (!myUnit.equals(arg.unit())) throw new IllegalArgumentException();
	}
	public Quantity subtract (Quantity arg) {
	    requireSameUnitsAs (arg);
	    return newObject (getAmount() - arg.getAmount(), myUnit);
	}
	public String toString () {
	    return String.valueOf(getAmount()) + " " + myUnit.toString();
	}
	public Unit unit()	{
		return myUnit;
	}
}
