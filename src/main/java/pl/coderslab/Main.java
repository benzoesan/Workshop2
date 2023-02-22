package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    private static final String QUERY1 = "CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;\n";
    private static final String QUERY2 = "CREATE TABLE users (\n" +
            "    id INT(11) NOT NULL AUTO_INCREMENT,\n" +
            "    username varchar(255) DEFAULT NULL,\n" +
            "    email varchar(255) UNIQUE DEFAULT NULL,\n" +
            "    password varchar(255) DEFAULT NULL,\n" +
            "    PRIMARY KEY (id)\n" +
            ")";
    public static void main(String[] args) {
        try (Connection con = DbUtil.getConnection()){
            DbUtil.execute(con,QUERY1);
            DbUtil.execute(con,QUERY2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}