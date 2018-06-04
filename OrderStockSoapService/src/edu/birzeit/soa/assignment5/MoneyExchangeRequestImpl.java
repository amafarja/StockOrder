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
	public double exchangeMoneyFromUsd(double moneyAmount, double exchangeRate) {
		return moneyAmount * exchangeRate;
	}

	/**
	 * Hardcoded service to get the exchange rate
	 * @return
	 */
	public double getExchangeRateFromService(String toCurrency) {
		switch (toCurrency) {
		case "NIS":
			return 3.6;
		case "EUR":
			return 0.85;
		default:
			return 0;
		}
		
	}

}
