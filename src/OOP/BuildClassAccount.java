package OOP;

import java.util.Date;

public class BuildClassAccount {
    private int id = 0;
    private double blance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public BuildClassAccount() {
    }

    public BuildClassAccount(int id, double blance) {
        this.id = id;
        this.blance = blance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = (this.annualInterestRate / 100) / 12;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = getMonthlyInterestRate() * this.blance;
        return monthlyInterest;
    }

    public double withdraw(double withdrawMoney) {
        double withdraw = this.blance - withdrawMoney;
        return withdraw;
    }

    public double deposit(double depositMoney) {
        return blance + depositMoney;
    }

}
