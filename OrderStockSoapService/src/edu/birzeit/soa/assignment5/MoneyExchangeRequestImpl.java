package edu.birzeit.soa.assignment5;

/**
 * This is to create a SOAP service in order to exchange money amount
 * @author amafarja
 *
 */
public class MoneyExchangeRequestImpl {
	
	/**
	 * Given a money amount and the desired currency, get the exchange amount
	 * @param moneyAmount
	 * @param toCurrency
	 * @return
	 */
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

	/**
	 * Hardcoded service
	 * @return
	 */
	private double getEurExchangeRateFromService() {
		return 0.85;
	}

	/**
	 * Hardcoded service
	 * @return
	 */
	private double getNisExchangeRateFromService() {
		return 3.6;
	}
}
