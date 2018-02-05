package org.codemetrics.core;

import java.util.List;

public interface SourceControl {
    List<Commit> commitsByFileNameAndDateRange(String fileName, DateRange dateRange);
}