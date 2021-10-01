//package org.example.domain.persistence;
//
//import com.sun.javafx.beans.IDProperty;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.util.Objects;
//import java.util.Set;
//
//@Entity
//@Table(name = "Demo_Account_Type", schema = "VITRSA_SANDBOX")
//public class AccountType implements Serializable {
//
//    @Id
//    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC-SEQ", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
//    @Column(name = "Account_Type_ID")
//    private long accountTypeId;
//
//    @Column(name = "MNEMONIC")
//    private String mnemonic;
//
//    @Column(name = "Account_Type_Name")
//    private String accountTypeName;
//
//    @Column(name = "Creation_Date")
//    private LocalDate creationDate;
//
//    private Set<AccountTransaction> accountTransactions;
//
//    public AccountType(String mnemonic, String accountTypeName, LocalDate creationDate) {
//    }
//
//    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accounType", orphanRemoval = true, cascade = CascadeType.PERSIST)
//    public Set<AccountTransaction> getAccountTransactions(){
//        return accountTransactions;
//    }
//
//    public AccountType() {
//    }
//
//    public AccountType(long accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate) {
//        this.accountTypeId = accountTypeId;
//        this.mnemonic = mnemonic;
//        this.accountTypeName = accountTypeName;
//        this.creationDate = creationDate;
//    }
//
//
//    public long getAccountTypeId() {
//        return accountTypeId;
//    }
//
//    public void setAccountTransactions(Set<AccountTransaction> accountTransactions){
//        this.accountTransactions = accountTransactions;
//    }
//
//    public void setAccountTypeId(long accountTypeId) {
//        this.accountTypeId = accountTypeId;
//    }
//
//    public String getMnemonic() {
//        return mnemonic;
//    }
//
//    public void setMnemonic(String mnemonic) {
//        this.mnemonic = mnemonic;
//    }
//
//    public String getAccountTypeName() {
//        return accountTypeName;
//    }
//
//    public void setAccountTypeName(String accountTypeName) {
//        this.accountTypeName = accountTypeName;
//    }
//
//    public LocalDate getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(LocalDate creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AccountType that = (AccountType) o;
//        return accountTypeId == that.accountTypeId && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(accountTypeId, mnemonic, accountTypeName, creationDate);
//    }
//
//    @Override
//    public String toString() {
//        return "AccountType{" +
//                "accountTypeId=" + accountTypeId +
//                ", mnemonic='" + mnemonic + '\'' +
//                ", accountTypeName='" + accountTypeName + '\'' +
//                ", creationDate=" + creationDate +
//                '}';
//    }
//}
