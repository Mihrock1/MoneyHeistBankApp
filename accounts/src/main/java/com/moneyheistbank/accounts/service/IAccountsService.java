package com.moneyheistbank.accounts.service;

import com.moneyheistbank.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
