package com.codecool;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.codehaus.jackson.map.MappingIterator;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class CsvFileReader {
    List<Map<?,?>> readData(File file) {

        List<Map<?,?>> data = new ArrayList<>();

        try {
            CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            MappingIterator<Map<?,?>> mappingIterator = csvMapper.reader(Map.class).withSchema(bootstrap).readValues(file);
            while (mappingIterator.hasNext()) {
                data.add(mappingIterator.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
