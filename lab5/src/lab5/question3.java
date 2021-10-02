package lab5;
import java.util.*;
class Fraction

{

private int numerator;
private int denominator;

public Fraction() {

}

public Fraction (int newNemerator, int newDenominator)

{

this.numerator = newNemerator;

this.denominator = newDenominator;
}



public void add (Fraction f)

{

this.numerator = (this.getNumerator() * f.getDenominator()) + (this.getDenominator() * f.getNumerator());
this.denominator = this.getDenominator() * f.getDenominator();
int gcd = getGCF(this.numerator, this.denominator);
this.numerator = this.numerator/gcd;
this.denominator = this.denominator/gcd;
}

public void sub(Fraction f) {

this.numerator = (this.getNumerator() * f.getDenominator()) - (this.getDenominator() * f.getNumerator());
this.denominator = this.getDenominator() * f.getDenominator();
int gcd = getGCF(this.numerator, this.denominator);
this.numerator = this.numerator/gcd;
this.denominator = this.denominator/gcd;
}

public void product(Fraction f) {
	this.numerator = this.numerator * f.getNumerator();
	this.denominator = this.denominator * f.getDenominator();
	int gcd = getGCF(this.numerator, this.denominator);
	this.numerator = this.numerator/gcd;
	this.denominator = this.denominator/gcd;
}

public void divide(Fraction f) {
	int newNumberator = this.numerator * f.getDenominator();
	int newDenominator = this.denominator * f.getNumerator();
	int gcd = getGCF(newNumberator, newDenominator);
	this.numerator = newNumberator/gcd;
	this.denominator = newDenominator/gcd;
}



/** Postcondition:	returns the GCF of n1 and n2. */ 

public static int getGCF (int n1, int n2) {

	int gcd = 1;
	 for(int i = 1; i <= n1 && i <= n2; i++)
    {
      if(n1%i==0 && n2%i==0)
        gcd = i;
    }
    return gcd;

}





public int getNumerator() {
	return this.numerator;
}

public int getDenominator() {
	return this.denominator;
}

public String toString() {
	return this.numerator + "/" + this.denominator;
}
}