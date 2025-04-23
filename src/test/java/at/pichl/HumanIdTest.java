package at.pichl;

import org.junit.Test;

public class HumanIdTest {

    @Test
    public void testEmptyConstructor() {
        System.out.println(HumanId.generate());
    }

    @Test
    public void testWithOptions() {
        System.out.println(HumanId.generate(new HumanId.Options("-", false, 2, true)));
    }

}
