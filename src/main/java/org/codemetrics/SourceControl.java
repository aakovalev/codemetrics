package org.codemetrics;

import java.util.List;

public interface SourceControl {
    List<Commit> commitsByFileNameAndDateRange(String fileName, DateRange dateRange);
}