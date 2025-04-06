import td0.MyUser;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            InputStream inputStream = socket.getInputStream();
            MyUser user = MyUser.parseFrom(inputStream);
            System.out.println("Email: " + user.getEmail());
            System.out.println("Year of Birth: " + user.getYearOfBirth());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}