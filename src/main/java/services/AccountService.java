package services;

import exceptions.AccountNotFoundException;
import exceptions.DBException;
import exceptions.TransactionNotAllowedException;
import model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    Account getAccount(long accountId) throws DBException;
    List<Account> getAllAccounts() throws DBException;
    void updateAmount(long accountId, BigDecimal updateValue) throws DBException, AccountNotFoundException, TransactionNotAllowedException;
    long createAccount(long userId, BigDecimal initialAmount) throws DBException, TransactionNotAllowedException;
}
