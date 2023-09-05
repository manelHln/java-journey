package com.banksys.validations;

public interface ValidateOperation {
    public boolean validateWithdraw(double amountToWithdraw, double accountBalance);
    public boolean validateTransfer(double accountBalance, double amountToTransfer);
}
