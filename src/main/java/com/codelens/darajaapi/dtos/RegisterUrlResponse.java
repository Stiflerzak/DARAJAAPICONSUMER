package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterUrlResponse{

	@JsonProperty("OriginatorCoversationID")
	private String originatorCoversationID;

	@JsonProperty("ResponseCode")
	private String ResponseCode;

	@JsonProperty("ResponseDescription")
	private String responseDescription;
}