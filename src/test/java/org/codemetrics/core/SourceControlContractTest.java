package org.codemetrics.core;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.of;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

abstract public class SourceControlContractTest {

    private static final LocalDate DEC_15_2017 = of(2017, 12, 15);
    private static final LocalDate DEC_13_2017 = of(2017, 12, 13);
    private static final LocalDate DEC_28_2017 = of(2017, 12, 28);
    private static final LocalDate DEC_01_2017 = of(2017, 12, 1);
    private static final String TEST_FILE = "test.file";
    private static final String OTHER_TEST_FILE = "other.file";

    @Test
    public void shouldReturnCommitsByFileNameAndDateRange() {
        Commit firstCommit = new Commit(TEST_FILE, DEC_01_2017);
        Commit secondCommit = new Commit(OTHER_TEST_FILE, DEC_13_2017);
        Commit thirdCommit = new Commit(TEST_FILE, DEC_15_2017);
        List<Commit> testCommits = asList(firstCommit, secondCommit, thirdCommit);
        SourceControl sourceControl = createSourceControlWithCommits(testCommits);

        DateRange dateRange = new DateRange(DEC_01_2017, DEC_28_2017);
        List<Commit> foundCommits = sourceControl.commitsByFileNameAndDateRange(TEST_FILE, dateRange);

        assertThat(foundCommits, contains(firstCommit, thirdCommit));
    }

    abstract SourceControl createSourceControlWithCommits(List<Commit> commits);
}