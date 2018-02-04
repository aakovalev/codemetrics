package org.codemetrics;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Commit {
    private final String fileName;
    private final LocalDate date;
}