package Lesson_6.db;

import Lesson_6.model.Coin;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

public interface CoinsDB {

    void insert(Connection connection, Coin coin);

    void updateBalanceById(Connection connection, int id, BigDecimal newBalance);

    void delete(Connection connection, Coin coin);

    List<Coin> selectAll(Connection connection);

    Coin findByName(Connection connection, String coinName);

    Coin findByRank(Connection connection, int rank);
}
