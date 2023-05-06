class TestCuentaBancaria {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.depositToChecking(500);
        account2.depositToSavings(1000);

        account1.withdrawFromChecking(200);
        account2.withdrawFromSavings(1500);

        account1.displayAccountBalance();
        account2.displayAccountBalance();

        System.out.println("Número total de cuentas: " + BankAccount.getNumberOfAccounts());
        System.out.println("Dinero total almacenado: " + BankAccount.getTotalMoneyStored());
    }
}