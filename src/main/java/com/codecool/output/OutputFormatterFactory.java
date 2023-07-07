package com.codecool.output;

import com.codecool.OutputFormat;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case XML:
                return new XmlOutputFormatter();
            case JSON:
                return new JsonOutputFormatter();
            default:
                return new TableOutputFormatter();
        }
    }
}