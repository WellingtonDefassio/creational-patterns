package br.com.cod3r.singleton.connectionPool.after;

import br.com.cod3r.singleton.connectionPool.after.conn.Mapper;

public class Client3 {

    public static void main(String[] args) {

        Mapper instance = Mapper.getInstance();
        instance.mapperTo("arwe");


    }

}
