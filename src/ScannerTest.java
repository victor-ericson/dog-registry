import static org.junit.jupiter.api.Assertions.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ScannerTest {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UnderTest {
        String id();
    }
}