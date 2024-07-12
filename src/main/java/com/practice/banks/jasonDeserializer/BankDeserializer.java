package com.practice.banks.jasonDeserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;
import com.practice.banks.model.Bank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.IOException;

public class BankDeserializer extends JsonDeserializer<Bank> {
    @Override
    public Bank deserialize(JsonParser jp, DeserializationContext ctxt)  throws IOException, JsonProcessingException {
        return new Bank();
        }
}

