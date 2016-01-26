Ration.java

public class Ration
{
	private long denominator;
	private long numerator;

    public Ration{
    	this.denominator = denominator;
    	this.numerator = numerator;
    }

    public static int gcd(int p,int q){
	    if (q==0) return p;
	    int r = p % q;
	    return gcd(q,r);
    }	

    public Ration


    plus(Rational b)
    {
    	if (!this.denominator == b.denominator)
    	{ // make like denominator
    		int den = gcd(this.denominator, b.denominator);
    	}
        Rational s = new Rational((this.numerator * (den/)) * (that.den / g)
                                + (that.num / f) * (this.den / g),
                                  this.den * (that.den / g));

    	this.numerator + b.numerator;
    }

    public Ration minus(Rational b)
    {
    	if (!this.denominator == b.denominator)
    	{ // make like denominator
    		this.denominator = this.denominator * b.denominator;
    		b.denominator = this.denominator * b.denominator;
    		this.numerator = this.numerator * b.denominator;
    		b.numerator = this.numerator * b.denominator;
    	}
    	return new Ration(this.numerator = b.numerator, b.denominator);    	
    }

    public Ration times(Rational b)
    {
        this.denominator = this.denominator * b.denominator;
		this.numerator = this.numerator * b.denominator;
    }

    public ration divide(Rational b)
    {
        long store = b.numerator;
        b.numerator = b.denominator;
        b.denominator = store;
        this.times(b);
    }
    /*wha*/

    public boolean equals(Rational that)
    {
    	if (this.denominator - that.denominator == 0)
    	{
    		if (this.numerator - that.numerator == 0)
    		{
    			return true;
    		} 
            else { return false;}
    	}
    }
    else { return false;}
}