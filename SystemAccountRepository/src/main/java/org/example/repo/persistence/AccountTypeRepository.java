//package org.example.repo.persistence;
//
//import org.example.domain.persistence.AccountType;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
//
//    @Query(value = "SELECT " +
//            "        at" +
//            "    FROM" +
//            "        AccountType at" +
//            "    Where at.mnemonic = :mnemonic ")
//    AccountType geAccountTypeByMnemonic(String mnemonic);
//
//    @Query(value = "SELECT "+
//            "      Account_Type_ID," +
//            "     Account_Type_Name," +
//            "      Creation_Date," +
//            "      Mnemonic" +
//            "   FROM" +
//            "      VITRSA_SANDBOX.DEMO_ACCOUNT_TYPE" +
//            "   WHERE MNEMONIC = :mnemonic ", nativeQuery = true)
//    AccountType geAccountTypeByMnemonicByQuery(String mnemonic);
//}
//
//
