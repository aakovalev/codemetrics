package org.codemetrics;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TestSourceControl implements SourceControl {
    private final List<Commit> commits;

    public TestSourceControl(List<Commit> commits) {
        this.commits = commits;
    }

    @Override
    public List<Commit> commitsByFileNameAndDateRange(String fileName, DateRange dateRange) {
        return commits
                .stream()
                .filter(commit -> dateRange.contains(commit.getDate()))
                .filter(commit -> commit.getFileName().equals(fileName))
                .collect(toList());
    }
}
