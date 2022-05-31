import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1_000;
        boolean isRegistered = true;
        long expected = 30;

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
        void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean isRegistered = true;
        long expected = 500;

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1_000;
        boolean isRegistered = false;
        long expected = 10;

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUbRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 100_000;
        boolean isRegistered = false;
        long expected = 500;

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
