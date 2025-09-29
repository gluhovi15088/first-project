public class ExpensesManager {
    private double[] expenses;

    public ExpensesManager() {
        expenses = new double[6];
    }

    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary -= expense;
        expenses[day - 1] += expense;

        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (double expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }
}