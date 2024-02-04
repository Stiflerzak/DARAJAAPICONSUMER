package com.codelens.darajaapi.documents;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;


import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter

public class B2C_C2B_Entries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internalId;

    private String transactionType;


    private String transactionId;

    private String billRefNumber;

    private String msisdn;

    private String amount;

    private String conversationId;

    private String originatorConversationId;

    private Date EntryDate;

    private String resultCode;

    @Column(length = 5000)
    private String rawCallbackPayloadResponse;

    // Convert the rawCallbackPayloadResponse to JSON
    public void setRawCallbackPayloadResponse(Object response) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonPayload = objectMapper.writeValueAsString(response);
            this.rawCallbackPayloadResponse = jsonPayload;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting response to JSON", e);
        }
    }
}