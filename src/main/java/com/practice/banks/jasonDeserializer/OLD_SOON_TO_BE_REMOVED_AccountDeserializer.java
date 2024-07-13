package com.practice.banks.jasonDeserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.practice.banks.model.Account;

import java.io.IOException;

public class OLD_SOON_TO_BE_REMOVED_AccountDeserializer extends JsonDeserializer<Account> {
    //add this before class needed to be deserialized
    //@JsonDeserialize(using = ParticipantDeserializer.class)
    @Override
    public Account deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return new Account();
    }
}
