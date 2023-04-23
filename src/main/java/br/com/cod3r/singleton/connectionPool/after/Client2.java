package br.com.cod3r.singleton.connectionPool.after;

import br.com.cod3r.singleton.connectionPool.after.conn.ConnectionPool;

public class Client2 {


    void doQuery() {

        ConnectionPool instance = ConnectionPool.getInstance();
        instance.getConnection().query("SELECT ALL FROM A1");

    }

    void doQuery2() {

        ConnectionPool instance = ConnectionPool.getInstance();
        instance.getConnection().query("SELECT ALL FROM A2");
        instance.leaveConnection(instance.getConnection());

    }

    void doQuery3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool instance = ConnectionPool.getInstance();
        instance.getConnection().query("SELECT ALL FROM A3");

    }

    public static void main(String[] args) {

        Client2 client2 = new Client2();


        client2.doQuery();
        client2.doQuery2();
        client2.doQuery3();


    }


}
