package org.codemetrics;

import org.junit.Test;

import java.time.LocalDate;

import static java.time.LocalDate.of;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateRangeTest {
    private static final LocalDate FEB_3_2018 = of(2018, 2, 3);
    private static final LocalDate FEB_5_2018 = of(2018, 2, 5);
    private static final LocalDate FEB_4_2018 = of(2018, 2, 4);
    private static final LocalDate FEB_1_2018 = of(2018, 2, 1);

    @Test
    public void shouldTellIfDateBelongsToThisRange() throws Exception {
        DateRange dateRange = new DateRange(FEB_3_2018, FEB_5_2018);

        assertTrue(dateRange.contains(FEB_3_2018));
        assertTrue(dateRange.contains(FEB_5_2018));
        assertTrue(dateRange.contains(FEB_4_2018));
        assertFalse(dateRange.contains(FEB_1_2018));
    }
}