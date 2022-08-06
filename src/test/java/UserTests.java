import DAOPac.DAO;
//import DAOPac.UserDAO;
import model.User;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserTests
{
    private DAO<User, String> dao;

    private Connection connection;

//    @BeforeTest
//    public void before()
//    {
//         String user = "ilya_taslitsky";
//         String password = "1";
//        String url = "jdbc:postgresql://localhost:5432/phones_magazine";
//        try {
//            final Connection connection = DriverManager.getConnection(url, user, password);
//            dao = new UserDAO(connection);
//        }catch (SQLException sqlException)
//        {
//            sqlException.getStackTrace();
//        }
//    }
    @AfterTest
    public void after()
    {
        try {
            connection.close();
        }catch (SQLException sqlException)
        {
            System.out.println(sqlException.getErrorCode());
        }
    }

    @Test
    public void whenAddUserWhichNotExistThenReturnUser() {
        final User user = new User(0, "test", "test", new User.Role(1, "admin"));
        final boolean result = dao.create(user);
       Assert.assertFalse(result);
        //Clear test data.
       // dao.delete(dao.read("test"));
    }


}
