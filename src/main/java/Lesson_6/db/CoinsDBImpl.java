package Lesson_6.db;

import Lesson_6.model.Coin;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinsDBImpl implements CoinsDB {

    private Map<Integer, Coin> identityMap = new HashMap<>();

    @Override
    public void insert(Connection connection, Coin coin) {
        PreparedStatement stat = null;
        String insertSql = "INSERT into coins values(?,?,?,?);";
        try {
            stat = connection.prepareStatement(insertSql);
            stat.setInt(1, coin.getId());
            stat.setString(2, coin.getName());
            stat.setInt(3, coin.getRank());
            stat.setBigDecimal(4, coin.getBalance());
            stat.executeUpdate();
            identityMap.put(coin.getId(), coin);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateBalanceById(Connection connection, int id, BigDecimal newBalance) {
        PreparedStatement stat = null;
        String updateSql = "UPDATE coins SET balance = ? WHERE id = ?;";
        try {
            stat = connection.prepareStatement(updateSql);
            stat.setBigDecimal(1, newBalance);
            stat.setInt(2, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Connection connection, Coin coin) {

    }

    @Override
    public List<Coin> selectAll(Connection connection) {
        Statement stat = null;
        List<Coin> coins = new ArrayList<>();
        try {
            String selectSql = "SELECT * FROM coins;";
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(selectSql);
            while (rs.next()) {
                coins.add(new Coin(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getBigDecimal(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return coins;
    }

    @Override
    public Coin findByName(Connection connection, String coinName) {
        PreparedStatement stat = null;
        Coin coinToReturn = null;

        try {
            String selectSql = "SELECT * from coins WHERE coinName = ?;";
            stat = connection.prepareStatement(selectSql);
            stat.setString(1, coinName);
            ResultSet rs = stat.executeQuery();
            coinToReturn = new Coin(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getBigDecimal(4));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return coinToReturn;
    }

    @Override
    public Coin findByRank(Connection connection, int rank) {
        PreparedStatement stat = null;
        Coin coinToReturn = null;

        try {
            String selectSql = "SELECT * from coins WHERE rank = ?;";
            stat = connection.prepareStatement(selectSql);
            stat.setInt(1, rank);
            ResultSet rs = stat.executeQuery();
            coinToReturn = new Coin(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getBigDecimal(4));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return coinToReturn;
    }
}
