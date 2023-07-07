package com.codecool;

import com.codecool.output.OutputFormatterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CsvFileReader csvFileReader() {
        return new CsvFileReader();
    }

    @Bean
    public OutputFormatterFactory outputFormatterFactory() {
        return new OutputFormatterFactory();
    }

    @Bean
    public SimpleCsvConverter simpleCsvConverter() {
        return new SimpleCsvConverter();
    }


}
