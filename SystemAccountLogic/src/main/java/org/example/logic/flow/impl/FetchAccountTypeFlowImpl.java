//package org.example.logic.flow.impl;
//
//import org.example.domain.dto.AccountTypeDto;
//import org.example.logic.flow.FetchAccountTypeFlow;
//import org.example.translator.AccountTypeTranslator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Transactional
//@Component
//public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
////    @Override
////    public List<AccountTypeDto> getAllAccountTypes() {
////        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
////        accountTypeDtos.add(new AccountTypeDto("MILES","Miles", LocalDate.now()));
////        return null;
////    }
//
//    private final AccountTypeTranslator accountTypeTranslator;
//
//    @Autowired
//    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
//        this.accountTypeTranslator = accountTypeTranslator;
//    }
//
//    @Override
//    public List<AccountTypeDto> getAllAccountTypes(){
//        return accountTypeTranslator.getAllAccountTypes();
//    }
//
//    @Override
//    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic){
//        return accountTypeTranslator.getAccountTypeByMnemonic(mnemonic);
//    }
//
//
//    public boolean methodToTest() {
//        return true;
//    }
//}
