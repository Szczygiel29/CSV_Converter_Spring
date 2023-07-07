package com.codecool.output;
import java.util.List;
import java.util.Map;

public interface OutputFormatter {
    void printToConsole(List<Map<?, ?>> data);
}
