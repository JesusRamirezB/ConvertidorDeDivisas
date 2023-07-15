/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordemonedas;

/**
 *
 * @author boraj
 */
public class CurrencyConverter {

    // Conversion rates matrix
    private static final double[][] conversionMatrix = {
        {1, 0.05969615, 8.28, 0.04560171, 75.775}, // Conversion rates for MXN (peso mexicano)
        {16.75149905, 1, 138.7024121, 0.763897002, 1269.34484}, // Conversion rates for USD (Dolar estadounidense)
        {0.120772947, 0.00720968, 1, 0.005507453, 9.151570048}, // Conversion rates for JPY (Yen japones)
        {21.92900222, 1.309077006, 181.5721384, 1, 1661.670144}, // Conversion rates for GPB (Libra esterlina)
        {0.013196965, 0.000787808, 0.109270868, 0.000601804, 1} // Conversion rates for KRW (Won surcoreano)
    };

    public static double getRate(String initialCurrency, String finalCurrency) {
        int initialIndex = getCurrencyIndex(initialCurrency);
        int finalIndex = getCurrencyIndex(finalCurrency);
        if (initialIndex != -1 && finalIndex != -1) {
            return conversionMatrix[initialIndex][finalIndex];
        }

        // Invalid currency, return 0 or handle the error as desired
        return 0;
    }

    private static int getCurrencyIndex(String currency) {
        String[] currencies = {
            "MXN (Peso mexicano)",
            "USD (Dolar estadounidense)",
            "JPY (Yen japones)",
            "GPB (Libra esterlina)",
            "KRW (Won surcoreano)"
        };

        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equals(currency)) {
                return i;
            }
        }

        // Currency not found
        return -1;
    }
}
