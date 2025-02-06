import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        Connection cx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Devoir", "postgres", "123");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM test");
        while (rs.next()){
            String name = rs.getString("Name");
            String age = rs.getString("Age");
            int id  = rs.getInt("ID");
            System.out.println("id: "+ id + "Nom: " + name + "Age" + age);
        }
        rs.close();
        st.close();
        cx.close();
    }
}
