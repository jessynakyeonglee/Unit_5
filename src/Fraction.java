/**@author Jessy Lee
 * @since 2/11/20
 * This program will perform arithmetic with fractions
 */

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * The first constroctor will create a fraction that consists of a numerator and a denominator and will store the fraction in a reduced form
     * @param numerator the numerator of the fraction
     * @param denominator the denominator of the fraction
     */

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        int factor = gcd(numerator, denominator);
        this.numerator /= factor;
        this.denominator /= factor;
        if ((numerator>0&&denominator<0)||(numerator<0&&denominator<0)){
            this.numerator=-numerator;
            this.denominator=-denominator;
        }
    }

    /**
     * This will create a default constrctor with both the numerator and the denominator as 1.
     */
    public Fraction(){
        this(1,1);
    }

    /**
     * This will find the greatest common multiple of numerator and denominator
     * @param numerator numerator of the fraction
     * @param denominator denominator of the fraction
     * @return the greatest common multiple of numerator and denominator.
     */
    private int gcd(int numerator, int denominator) {
        int m=numerator;
        int n=denominator;
        if (m % n == 0) {
            return n;
        }
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }
    /**
     * This will add two fractions together and return the result in the reduced form
     * @param a the first fraction that will be added
     * @param b the second fraction that will be added
     * @return the added fraction in the reduced form
     */
    public static Fraction add(Fraction a, Fraction b) {
        int newnumerator =(a.denominator * b.numerator) + (b.denominator * a.numerator);
        int newdenominator =(a.denominator) * (b.denominator);
        Fraction addedfraction = new Fraction(newnumerator,newdenominator);
        return addedfraction;
    }
    /**
     * This will subtract two fractions and return the result in the reduced form
     * @param a the first fraction that will be subtracted from
     * @param b second fraction that will subtract by
     * @return the subtracted fraction in the reduced form
     */
    public static Fraction subtract(Fraction a, Fraction b) {
        int newnumerator =(a.numerator * b.denominator) - (b.numerator * a.denominator);
        int newdenominator =(a.denominator) * (b.denominator);
        Fraction subtractedfraction = new Fraction(newnumerator,newdenominator);
        return subtractedfraction;
    }

    /**
     * This will multiply two fractions together and return the result in the reduced form
     * @param a the first fraction that will be multplied
     * @param b the second fraction that will be multiplied
     * @return the multiplied fraction in the reduced form
     */
    public static Fraction multiply(Fraction a, Fraction b) {
        int newnumerator =(a.numerator)*(b.numerator);
        int newdenominator =(a.denominator) * (b.denominator);
        Fraction multipliedfraction = new Fraction(newnumerator,newdenominator);
        return multipliedfraction;
    }
    /**
     * This will divde two fractions and return the result in the reduced form
     * @param a the first fraction that will be divded by the second fraction
     * @param b the second fraction that will divide the first fraction
     * @return the divided fraction in the reduced form
     */
    public static Fraction divide(Fraction a, Fraction b) {
        int newnumerator = (a.numerator)*(b.denominator);
        int newdenominator = (a.denominator)*(b.numerator);
        Fraction dividedfraction = new Fraction(newnumerator,newdenominator);
        return dividedfraction;
    }

    /**
     * this will print the fraction in the reduced form with the fraction sign, "/".
     * @return the fraction that was resulted by the arithmetics above.
     */
    public String toString (){
        int gcd=gcd(numerator,denominator);
        this.numerator/=gcd;
        this.denominator/=gcd;
        if ((numerator>0&&denominator<0)||(numerator<0&&denominator<0)) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
        return numerator+"/"+denominator;
    }
}
