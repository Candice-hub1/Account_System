//package org.example.logic.flow.impl;
//
//import org.example.domain.dto.AccountTypeDto;
//import org.example.logic.flow.CreateAccountTypeFlow;
//import org.example.translator.AccountTypeTranslator;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//import java.time.LocalDate;
//
//@Transactional
//@Component("createAccountTypeFlowName")
//public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {
//
//    private final AccountTypeTranslator accountTypeTranslator;
//
//    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
//        this.accountTypeTranslator = accountTypeTranslator;
//    }
//
//    @Override
//    public AccountTypeDto create(AccountTypeDto accountType){
//        if(null == accountType.getCreationDate()){
//            accountType.setCreationDate(LocalDate.now());
//        }
//        return accountTypeTranslator.create(accountType);
//    }
//}
