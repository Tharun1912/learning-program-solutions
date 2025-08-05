package FinancialForecasting;

//File: FinancialForecast.java
public class FinancialForecast {

 // Recursive function to calculate future value
 public static double calculateFutureValue(double presentValue, double rate, int years) {
     if (years == 0) {
         return presentValue;
     } else {
         return calculateFutureValue(presentValue, rate, years - 1) * (1 + rate);
     }
 }

 public static void main(String[] args) {
     double presentValue = 10000.0; // initial investment
     double annualGrowthRate = 0.08; // 8% annual return
     int years = 5;

     double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years);
     System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
 }
}
