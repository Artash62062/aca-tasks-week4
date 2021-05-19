package day3.Task2;

public class FinancialAccounting extends TaxAccounting {
    private final int fixedEmployeeSalary = 200000;

    @Override
    public int account() {
        return this.countOfEmployers *fixedEmployeeSalary;
    }
}
