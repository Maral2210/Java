package Encapsulation;

public class Example3 {
    private long account_number;
    private String alias;
    private float amount;

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
