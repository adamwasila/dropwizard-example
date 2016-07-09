package com.example.helloworld.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by adam on 09.07.16.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NON_PRIVATE)
public class DummyDto {

    protected final String dummy;

    public DummyDto(String dummy) {
        this.dummy = dummy;
    }

}
