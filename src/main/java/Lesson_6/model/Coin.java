package Lesson_6.model;

import java.math.BigDecimal;

public class Coin {

    private int id;
    private String name;
    private int rank;
    private BigDecimal balance;

    public Coin(int id, String name, int rank, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", balance=" + balance +
                '}';
    }
}
