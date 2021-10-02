package lab5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction fract1 = new Fraction(1, 4);
		Fraction fract2 = new Fraction(1, 4);
		System.out.print("Addition of " + fract1.toString() + " and " + fract2.toString() + " is ");
		fract1.add(fract2);
		System.out.println(" " + fract1.toString());
		fract1 = new Fraction(1, 2);
		System.out.print("Subtraction of " + fract1.toString() + " and " + fract2.toString() + " is ");
		fract1.sub(fract2);
		System.out.println(" " + fract1.toString());
		fract1 = new Fraction(1, 2);
		System.out.print("Product of " + fract1.toString() + " and " + fract2.toString() + " is ");
		fract1.product(fract2);
		System.out.println(" " + fract1.toString());
		fract1 = new Fraction(1, 2);
		System.out.print("Divide of " + fract1.toString() + " and " + fract2.toString() + " is ");
		fract1.divide(fract2);
		System.out.println(" " + fract1.toString());
		}
	}