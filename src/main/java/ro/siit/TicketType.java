package ro.siit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TicketType {
    //full, full-vip, free-pass, one-day, one-day-vip
    FULL,
    FULL_VIP,
    FREE_PASS,
    ONE_DAY,
    ONE_DAY_VIP;

    private static final List<TicketType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TicketType randomTicketType()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
