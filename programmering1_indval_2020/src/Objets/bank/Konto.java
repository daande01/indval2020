package Objets.bank;

public class Konto {

	private int saldo;
	private int kontonummer;
	static double ränta = 1.05;

	public Konto(int knr) {

		saldo = 0;
		kontonummer = knr;

	}

	public void instättning(int in) {

		saldo = saldo + in;

	}

	public int uttag(int ut) {

		saldo = saldo - ut;

		return saldo;
	}



}
