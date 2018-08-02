package design_patterns_2.factory;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
        System.out.println(connection);
    }

}
