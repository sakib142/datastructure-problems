package com.practice;

import java.util.ArrayList;

import com.datastructureproblem.StockBuySell.Interval;

public class LocalMaxMin {

	public static void main(String[] args) {
		int price[] = { 10, 100, 200, 50, 90, 1000, 100, 500 };
		ArrayList<TradeDay> arrayList = new ArrayList<>();

		int n = price.length;
		int i = 0;

		while (i < n - 1) {
			// Find Local Minima. Note that the limit is (n-2) as we are
			// comparing present element to the next element.
			while ((i < n - 1) && (price[i + 1] <= price[i]))
				i++;

			// If we reached the end, break as no further solution possible
			if (i == n - 1)
				break;

			TradeDay e = new TradeDay();
			e.buy = i++;
			// Store the index of minima

			// Find Local Maxima. Note that the limit is (n-1) as we are
			// comparing to previous element
			while ((i < n) && (price[i] >= price[i - 1]))
				i++;

			// Store the index of maxima
			e.sell = i - 1;
			arrayList.add(e);

			// Increment number of buy/sell
		}


		for (TradeDay tradeDay : arrayList) {
			System.out.println("Best Buy Day :" + tradeDay.buy + " And Best Sale day " + tradeDay.sell);
		}

	}

}
