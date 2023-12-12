package com.example.rick;

import java.util.List;
public record RickResponse (
    int total_count,
    List<RickResult>results
) {
}
