package edu.birzeit.soa;

public class MoneyExchangeRequestServiceImpl {

	public double exchangeMoneyFromUsd(double moneyAmount, String toCurrency) {
		double rate = 0;
		switch (toCurrency) {
		case "NIS":
			rate = getNisExchangeRateFromService();
			break;
		case "EUR":
			rate = getEurExchangeRateFromService();
			break;
		default:
			break;
		}
		return moneyAmount * rate;
	}

	private double getEurExchangeRateFromService() {
		return 0.85;
	}

	private double getNisExchangeRateFromService() {
		return 3.6;
	}
}
