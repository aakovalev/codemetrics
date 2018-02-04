package org.codemetrics;

import java.util.List;

public class TestSourceControlContractTest extends SourceControlContractTest {
    @Override
    SourceControl createSourceControlWithCommits(List<Commit> commits) {
        return new TestSourceControl(commits);
    }
}
