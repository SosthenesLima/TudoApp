
package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

/**
 *
 * @author SosthenesNUT
 */
public class Main {
    public static void main(String[] args) {
     
        Connection connection = ConnectionFactory.getConnection();
        
        
        ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection);
        
        
        
    }
}
