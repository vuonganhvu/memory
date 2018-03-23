package com.higgsup.memory.memoryleak;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionClose {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            //TODO
            //process business

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
