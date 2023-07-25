package com.boardify.boardify.service;

import com.boardify.boardify.entities.Transaction;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface TransactionService {

    List<Transaction> findAllByTransactionDate(Date transactionDate);

    List<Transaction> findAllByTransactionTimeBetween(Date transactionTimeStart, Date transactionTimeEnd);

    List<Transaction> findByUserId(Long userId);

    List<Transaction> findAllTransactions();

    List<Transaction> findByFilter(Map<String, String> customQuery);
}