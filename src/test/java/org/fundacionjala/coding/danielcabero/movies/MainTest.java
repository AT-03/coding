package org.fundacionjala.coding.danielcabero.movies;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 7/5/2017.
 */
public class MainTest {

    /**
     *
     * @throws Exception test constructor.
     */
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = Main.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
