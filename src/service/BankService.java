package service;

import domain.Account;
import domain.Transaction;
import java.util.List;

public interface BankService {
    String openAccount(String name, String email, String accountType);
    List<Account> listAccounts();
    void deposit(String accountNumber, double amount, String note);
    void withdraw(String accountNumber, double amount, String note);
    void transfer(String fromAccount, String toAccount, double amount, String note);
    List<Transaction> getStatement(String accountNumber);
    List<Account> searchAccountsByCustomerName(String query);
}

