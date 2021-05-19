package day3.Task3;

public class TaxAccounting extends Accounting {
    private static final int taxForEmployee = 20000;

    @Override
    public int account() {
        return this.countOfEmployers*taxForEmployee;
    }
}
