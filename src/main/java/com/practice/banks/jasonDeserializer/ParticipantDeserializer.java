package com.practice.banks.jasonDeserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.practice.banks.model.Participant;

import java.io.IOException;

public class ParticipantDeserializer extends JsonDeserializer<Participant> {
    @Override
    public Participant deserialize(JsonParser jp, DeserializationContext ctxt)  throws IOException, JsonProcessingException {
        return new Participant();
        }
}

