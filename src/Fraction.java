//Jessy Lee
//2/11/20
//This program will perform arithmetic with fractions
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
        int factor = gcd(this.numerator, this.denominator);
        this.numerator /= factor;
        this.denominator /= factor;
    }

    public void findNegatives() {
        if (numerator >= 0 && denominator < 0) {
            numerator -= numerator * 2;
            denominator += denominator * 2;
        }
    }

    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     * This method will do arithmetic s
     * @param a
     * @param b
     * @return
     */
    public static Fraction add(Fraction a, Fraction b) {
        Fraction addedfraction = new Fraction(((a.denominator * b.numerator) + (b.denominator * a.numerator)), (a.denominator) * (b.denominator));
        return addedfraction;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction subtractedfraction = new Fraction(((a.denominator * b.numerator) - (b.denominator * a.numerator)), (a.denominator) * (b.denominator));
        return subtractedfraction;
    }
    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction multipliedfraction = new Fraction((a.numerator)*(b.numerator), (a.denominator) * (b.denominator));
        return multipliedfraction;
    }
    public static Fraction divide(Fraction a, Fraction b) {
        Fraction dividedfraction = new Fraction((a.numerator)*(b.denominator), (a.denominator) * (b.numerator));
        return dividedfraction;
    }
    public String toString (){
        return numerator+"/"+denominator;
    }
}
