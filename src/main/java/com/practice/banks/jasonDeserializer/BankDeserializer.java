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

import java.io.IOException;

public class BankDeserializer extends StdDeserializer<Bank> {
    protected BankDeserializer(Class<?> vc) {
        super(vc);
    }

    protected BankDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected BankDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Bank deserialize(JsonParser jp, DeserializationContext ctxt)  throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);

        int id = (Integer) ((IntNode) node.get("id")).numberValue();
        String itemName = node.get("itemName").asText();
        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();

        return new Item(id, itemName, new User(userId, null));
    }
    }
}
