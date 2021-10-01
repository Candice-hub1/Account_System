//package org.example.domain.persistence;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.util.Objects;
//
//@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")
//public class AccountTransaction implements Serializable{
//
//    private long transactionId;
//    private AccountType accountTypeId;
//    private long memberId;
//    private long account;
//    private LocalDate transactionDate;
//
//    public AccountTransaction() {
//    }
//
//    public AccountTransaction(long transactionId, AccountType accountTypeId, long memberId, long account, LocalDate transactionDate) {
//        this.transactionId = transactionId;
//        this.accountTypeId = accountTypeId;
//        this.memberId = memberId;
//        this.account = account;
//        this.transactionDate = transactionDate;
//    }
//
//    @Id
//    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC-SEQ", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
//    @Column(name = "TX_ID")
//    private long getTransactionId(){
//        return transactionId;
//    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ACCOUNT_TYPE_ID")
//    @Column(name = "ACCOUNT_TYPE_ID")
//    public AccountType getAccountTypeId(){
//        return accountTypeId;
//    }
//
//    @Column(name = "MEMBER_ID")
//    public long getMemberId(){
//        return memberId;
//    }
//
//    @Column(name = "ACCOUNT")
//    public long getAccount(){
//        return account;
//    }
//
//    @Column(name = "TX_DATE")
//    public LocalDate getTransactionDate(){
//        return transactionDate;
//    }
//
//    public void setTransactionId(long transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    public void setAccountTypeId(AccountType accountTypeId) {
//        this.accountTypeId = accountTypeId;
//    }
//
//    public void setMemberId(long memberId) {
//        this.memberId = memberId;
//    }
//
//    public void setAccount(long account) {
//        this.account = account;
//    }
//
//    public void setTransactionDate(LocalDate transactionDate) {
//        this.transactionDate = transactionDate;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AccountTransaction that = (AccountTransaction) o;
//        return transactionId == that.transactionId && accountTypeId == that.accountTypeId && memberId == that.memberId && account == that.account && Objects.equals(transactionDate, that.transactionDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(transactionId, accountTypeId, memberId, account, transactionDate);
//    }
//
//    @Override
//    public String toString() {
//        return "AccountTransaction{" +
//                "transactionId=" + transactionId +
//                ", accountTypeId=" + accountTypeId +
//                ", memberId=" + memberId +
//                ", account=" + account +
//                ", transactionDate=" + transactionDate +
//                '}';
//    }
//}
