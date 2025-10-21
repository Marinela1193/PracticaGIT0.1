import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordCheckerTest {

    @Test
    public void testPasswordEnBlanco() {

        Assertions.assertEquals(PasswordChecker.ERR_BLANK, PasswordChecker.checkPassword(""));
        Assertions.assertEquals(PasswordChecker.ERR_BLANK, PasswordChecker.checkPassword(null));

    }

    @Test
    public void testPasswordErrorDigitos() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_DIGITS);
    }

    @Test
    public void testPasswordMaxLenght() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_INVALID_MAX_LENGHT);
    }

    @Test
    public void testPasswordMinlenght() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_INVALID_MIN_LENGHT);
    }

    @Test
    public void testPasswordLongitud() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_LENGHT);
    }
    @Test
    public void testPasswordLowers() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_LOWERS);
    }
    @Test
    public void testPasswordNoMatch() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_NO_MATCH);
    }
    @Test
    public void testPasswordUppers() {
        PasswordChecker passwordChecker = new PasswordChecker();

        Assertions.assertEquals(passwordChecker.ERR_UPPERS);
    }
}
