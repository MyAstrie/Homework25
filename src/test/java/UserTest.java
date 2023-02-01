import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {

    @Test
    public void testUserObjectCreationWithParams() {
        User user = new User("Иван Иванов", "ivanivanov@example.com");
        assertNotNull(user);
    }

    @Test
    public void testUserObjectCreationWithoutParams() {
        User user = new User();
        assertNotNull(user);
    }

    @Test
    public void testCorrectEmailAddress() {
        User user = new User("Иван Иванов", "ivanivanov@example.com");
        assertNotNull(user.getEmail());
        assert(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    public void testLoginAndEmailNotEqual() {
        User user = new User("Иван Иванов", "ivanivanov@example.com");
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}