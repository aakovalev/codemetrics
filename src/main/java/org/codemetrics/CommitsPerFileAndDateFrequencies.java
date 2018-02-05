package org.codemetrics;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
public class CommitsPerFileAndDateFrequencies {
    public List<Map.Entry<LocalDate, Integer>> forFile(String fileName) {
        return null;
    }
}
