public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction (int numerator,int denominator){
        this.denominator=denominator;
        this.numerator=numerator;
        int factor = gcd(this.numerator,this.denominator);
        this.numerator/=factor;
        this.denominator/=factor;
    }
    public void findNegatives(){
        if (numerator>=0&&denominator<0){
            numerator-=numerator*2;
            denominator+=denominator*2;
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
    public static Fraction add(Fraction a,Fraction b){
        Fraction addedfraction= new Fraction((a.denominator*b.numerator)+(b.denominator*a.numerator))
    }
    public static Fraction subtract(Fraction a,Fraction b)
    }

