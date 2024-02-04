package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SimulateTransactionResponse {

    @JsonProperty("OriginatorCoversationID")
    private String originatorcoversationID;

    @JsonProperty("ResponseCode")
    private String responseCode;

    @JsonProperty("ResponseDescription")
    private String responseDescription;
}