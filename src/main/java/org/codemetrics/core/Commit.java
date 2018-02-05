package org.codemetrics.core;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Commit {
    /*
        @to-do: adjust commit data structure to reflect real world content of commits:
                 - multiple files in one commit
                 - LocalDate should replaced with something that contains time part (i.e. Timestamp)
                   (there can be multiple commits within the date at different times)

     */
    private final String fileName;
    private final LocalDate date;
}