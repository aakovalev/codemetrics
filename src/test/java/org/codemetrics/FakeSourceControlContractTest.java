package org.codemetrics;

import java.util.List;

public class FakeSourceControlContractTest extends SourceControlContractTest {
    @Override
    SourceControl createSourceControlWithCommits(List<Commit> commits) {
        return new FakeSourceControl(commits);
    }
}
