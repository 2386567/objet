package taitamoh.at05.partie1;

public interface Taxable {
    double TVQ = 0.09975;
    double TPS = 0.05;

    double calculerTaxes();
}
