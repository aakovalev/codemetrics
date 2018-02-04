package org.codemetrics;

import lombok.Data;

import java.time.LocalDate;

import static java.lang.String.format;

@Data
public class DateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public DateRange(LocalDate startDateTime, LocalDate endDateTime) throws RuntimeException {
        if (endDateTime.isBefore(startDateTime)) {
            throw new RuntimeException(
                    format("End date %s can not be before start date %s!",
                            endDateTime, startDateTime));
        }
        this.startDate = startDateTime;
        this.endDate = endDateTime;
    }

    public boolean contains(LocalDate date) {
        return ((startDate.isEqual(date) || startDate.isBefore(date)) &&
                (endDate.isEqual(date) || endDate.isAfter(date)));

    }
}