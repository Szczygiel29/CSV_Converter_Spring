package com.codecool.output;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.List;
import java.util.Map;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<Map<?, ?>> data) {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = "";

        try {
            xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(xml);
    }
}
