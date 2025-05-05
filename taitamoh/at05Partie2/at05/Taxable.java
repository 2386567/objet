package taitamoh.at05Partie2.at05;

public interface Taxable {
	public static final double TVQ = 0.09975;
	public static final double TPS = 0.05;
	public abstract double calculerTaxes();
}

