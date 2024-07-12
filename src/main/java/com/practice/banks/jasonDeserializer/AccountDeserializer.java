package com.practice.banks.jasonDeserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.practice.banks.model.Account;
import com.practice.banks.model.Bank;

import java.io.IOException;

public class AccountDeserializer extends JsonDeserializer<Account> {

    @Override
    public Account deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return new Account();
    }
}
