package Lesson_6;

import Lesson_6.db.CoinsDB;
import Lesson_6.db.CoinsDBImpl;
import Lesson_6.db.Connect;
import Lesson_6.db.DbObjects;
import Lesson_6.model.Coin;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;

public class Main {

    private static final CoinsDB DATA_MAPPER = new CoinsDBImpl();


    public static void lesson6_main(String[] args) {
        Connection connection = Connect.getConnection();

        DbObjects.createTable(connection);

        addCoinsToDB(connection);

        for (Coin coin : DATA_MAPPER.selectAll(connection)) {
            System.out.println(coin.toString());
        }

        DATA_MAPPER.updateBalanceById(connection, 1, new BigDecimal(2.000022));

        System.out.println("-------------------");

        System.out.println(DATA_MAPPER.findByName(connection, "Bitcoin").toString());

        System.out.println("-------------------");

        System.out.print(DATA_MAPPER.findByRank(connection, 10).toString());

        DbObjects.dropTable(connection);

        Connect.closeConnection();
    }

    private static void addCoinsToDB(Connection connection) {

        for (Coin coin : getListOfCoins()) {
            DATA_MAPPER.insert(connection, coin);
        }
    }

    private static ArrayList<Coin> getListOfCoins() {
        ArrayList<Coin> list = new ArrayList<>();

        list.add(new Coin(1, "Bitcoin", 1, new BigDecimal(1.0078356)));
        list.add(new Coin(2, "Litecoin", 7, new BigDecimal(25.40)));
        list.add(new Coin(3, "Ethereum", 2, new BigDecimal(11.22007)));
        list.add(new Coin(4, "EOS", 9, new BigDecimal(15.06654)));
        list.add(new Coin(5, "Tezos", 10, new BigDecimal(100.04523)));

        return list;
    }
}
