package jdbc.day01;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest1 {
    public static void main(String[] args) {
        // 1、注册驱动
        try {
            java.sql.Driver driver = new Driver(); // 使用了多态机制，父类行的引用指向了子类型的对象
            DriverManager.registerDriver(driver);
            System.out.println("驱动连接成功！");

            // 2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/sys";
            String user = "root";
            String password = "123456";
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象：" + conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
