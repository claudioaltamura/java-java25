package de.claudioaltamura.java25.unnamed;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBOperations {
    private static final Logger logger = Logger.getLogger(DBOperations.class.getName());
    void checkConnection(String url, String user, String pwd) {
        try (var _ = DriverManager.getConnection(url, user, pwd)) {
            var msg = """
                        DB Connection successful
                        URL = {%s}
                        usr = {%s}
                        pwd = {%s}
                        """.formatted(url, user, pwd);
            logger.info(msg);
        } catch (SQLException e) {
            logger.warning(e.toString());
        }
    }
}
