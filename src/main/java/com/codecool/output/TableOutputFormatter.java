package com.codecool.output;

import java.util.List;
import java.util.Map;

public class TableOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(List<Map<?, ?>> data) {
        for (Map<?,?> item : data) {
            for (Map.Entry<?,?> entry : item.entrySet()) {
                System.out.print(entry.getKey() + " : " + entry.getValue() + " | ");
            }
            System.out.println();
        }
    }
}
