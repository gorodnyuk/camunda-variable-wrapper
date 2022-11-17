package uk.gorodny.wrapper;

import java.util.Optional;

public class Wrapper {

    public static Integer getInt(Object o) {
        return cast(o, Integer.class);
    }

    public static Double getDouble(Object o) {
        return cast(o, Double.class);
    }

    public static Boolean getBoolean(Object o) {
        return cast(o, Boolean.class);
    }

    public static String getString(Object o) {
        return cast(o, String.class);
    }

    public static <T> T cast(Object o, Class<T> type) {
        return Optional.ofNullable(o)
                .map(m -> type.cast(o))
                .orElse(null);
    }
}
