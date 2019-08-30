package com.microsoft.msproglab.labs.lab1;

import java.util.List;

public class IncomeCalculation {

	public int calculateSumIncome(List<Integer> incomes) {

		int sumIncome = 0;

		for (int i = 0; i < incomes.size(); i++) {

			sumIncome += sumIncome + incomes.get(i);
		}

		return sumIncome;
	}

	public int calculateSumIncome2(List<Integer> incomes) {

		int sumIncome = 0;

		for (Integer i : incomes) {

			sumIncome += sumIncome + i;
		}

		return sumIncome;
	}

	public int calculateSumIncome3(List<Integer> incomes) {

		return incomes.stream().reduce(0, (i, i2) -> i + i2, (i, i2) -> i + i2);
	}
}
