//package org.example.translator.impl;
//
//import org.example.domain.dto.AccountTypeDto;
//import org.example.domain.persistence.AccountType;
//import org.example.repo.persistence.AccountTransactionRepository;
//import org.example.repo.persistence.AccountTypeRepository;
//import org.example.translator.AccountTypeTranslator;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AccountTypeTranslatorImpl implements AccountTypeTranslator {
//
//    private final AccountTypeRepository accountTypeRepository;
//
//    @Autowired
//    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository){
//        this.accountTypeRepository = accountTypeRepository;
//    }
//
//    @Override
//    public List<AccountTypeDto> getAllAccountTypes(){
//        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
//        try{
//            for(AccountType accountType: accountTypeRepository.findAll()){
//                accountTypeDtos.add(new AccountTypeDto(accountType));
//            }
//        }catch (Exception e){
//            //TODO: Log
//            throw new RuntimeException("Unable to read from the DB", e);
//        }
//        return accountTypeDtos;
//    }
//
//    @Override
//    public AccountTypeDto create(AccountTypeDto accountTypeDto) {
//        try{
//            AccountType accountType = accountTypeRepository.save(accountTypeDto.getAccountType());
//            return new AccountTypeDto(accountType);
//        }catch (Exception e){
//            throw new RuntimeException("Unable to save to the DB", e);
//        }
//    }
//
//    @Override
//    public AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic) {
//        try{
//            AccountType accountType = accountTypeRepository.geAccountTypeByMnemonicByQuery(mnemonic);
//            return new AccountTypeDto(accountType);
//        }catch (Exception e){
//            throw new RuntimeException("Unable to read from the DB", e);
//        }
//    }
//
//    @Override
//    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
//        try{
//            AccountType accountType = accountTypeRepository.geAccountTypeByMnemonic(mnemonic);
//            return new AccountTypeDto(accountType);
//        }catch (Exception e){
//            throw new RuntimeException("Unable to read from the DB", e);
//        }
//    }
//}
