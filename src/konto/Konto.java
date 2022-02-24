package konto;

public class Konto {

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    public void hebeGeld(double betrag){
        saldo = saldo-betrag;
    }
    public void zahleGeldEin (double betrag){
        saldo = saldo+betrag;
    }
}
