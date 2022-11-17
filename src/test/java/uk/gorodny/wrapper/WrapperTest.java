package uk.gorodny.wrapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WrapperTest {

    @Test
    public void getIntegerTest() {
        Integer someNumber = Wrapper.getInt(10);
        Assertions.assertEquals(10, someNumber);
    }

    @Test
    public void getNullInsteadOfIntegerTest() {
        Integer someNumber = Wrapper.getInt(null);
        Assertions.assertNull(someNumber);
    }

    @Test
    public void getDoubleTest() {
        Double someNumber = Wrapper.getDouble(10.99);
        Assertions.assertEquals(10.99, someNumber);
    }

    @Test
    public void getNullInsteadOfDoubleTest() {
        Double someNumber = Wrapper.getDouble(null);
        Assertions.assertNull(someNumber);
    }

    @Test
    public void getBooleanTest() {
        Boolean b = Wrapper.getBoolean(true);
        Assertions.assertTrue(b);
    }

    @Test
    public void getNullInsteadOfBooleanTest() {
        Boolean b = Wrapper.getBoolean(null);
        Assertions.assertNull(b);
    }

    @Test
    public void getStringTest() {
        String someString = Wrapper.getString("test");
        Assertions.assertEquals("test", someString);
    }

    @Test
    public void getNullInsteadOfBStringTest() {
        String someString = Wrapper.getString(null);
        Assertions.assertNull(someString);
    }

}