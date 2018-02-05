package org.codemetrics.usecases;

import org.codemetrics.CommitsPerFileAndDateFrequencies;
import org.codemetrics.core.Commit;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Ignore 
public class ShowCommitFrequencyTest {

    private static final String FILE_A = "file_a";
    private static final Commit COMMIT_FOR_FILE_A_AT_DAY1 =
            new Commit(FILE_A, LocalDate.of(2018, Month.FEBRUARY, 5));
    private static final Commit COMMIT_FOR_FILE_A_AT_DAY2 =
            new Commit(FILE_A, LocalDate.of(2018, Month.FEBRUARY, 6));
    private static final Commit COMMIT_FOR_FILE_A_AT_DAY3 =
            new Commit(FILE_A, LocalDate.of(2018, Month.FEBRUARY, 7));

    private static final String FILE_B = "file_b";
    private static final Commit COMMIT_FOR_FILE_B_AT_DAY2 =
        new Commit(FILE_B, LocalDate.of(2018, Month.FEBRUARY, 7));

    @Test
    public void nothing() throws Exception {
        List<Commit> commits = Arrays.asList(
                COMMIT_FOR_FILE_A_AT_DAY1,
                COMMIT_FOR_FILE_A_AT_DAY2,
                COMMIT_FOR_FILE_A_AT_DAY3,
                COMMIT_FOR_FILE_B_AT_DAY2);

        ShowCommitsPerFileFrequency showCommitFrequency = new ShowCommitsPerFileFrequency();
        CommitsPerFileAndDateFrequencies commitFrequencies = showCommitFrequency.execute(commits);

        //to-do: complete the assert with the right data
        assertThat(commitFrequencies.forFile(FILE_A),
                IsCollectionContaining.hasItems(new AbstractMap.SimpleEntry<>(LocalDate.now(), 1)));
    }
}