package br.com.cod3r.singleton.connectionPool.after.conn;

public class Mapper {

    private static Mapper instance = new Mapper();

    private Mapper() {

    }
    public String mapperTo(Object object) {
        return "objeto mapeado";
    }

    public static Mapper getInstance() {
        return instance;
    }
}
