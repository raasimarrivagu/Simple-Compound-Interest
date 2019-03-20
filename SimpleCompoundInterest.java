package SimpleCompoundInterest;
/**
 * This program performs Simple Interest and Compound Interest
 * @author Raasi
 *
 */
public class SimpleCompoundInterest {
	
	double principle,rate,time;
	
	/**
	 * Constructor 
	 * @param principle
	 * @param rate
	 * @param time
	 */
	public SimpleCompoundInterest(double principle,double rate,double time) {
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}
	
	/**
	 * Calculates Simple Interest
	 * @return
	 */
	public double simpleInterest() {
		return (principle*time*rate)/100;
	}
	
	/**
	 * Calculates CompoundInterest
	 * @return
	 */
	public double compoundInterest() {
		return (double) (principle * (Math.pow((1 + rate / 100), time)));
	}
}