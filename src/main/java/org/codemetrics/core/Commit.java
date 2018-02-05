package org.codemetrics.core;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Commit {
    private final String fileName;
    private final LocalDate date;
}