package com.sda.readwrite;

import com.sda.randomizer.Person;

import java.io.IOException;

public interface DataExporter {
    void persist(Person person) throws IOException;
}
