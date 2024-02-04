package com.codelens.darajaapi.documents;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class StkPush_Entries {

    @Id
    private String internalId;

    private String transactionId;

    private String transactionType;

    private String msisdn;

    private Long amount;

    private String merchantRequestID;

    private String checkoutRequestID;

    private Date entryDate;

    private String resultCode;

    private String rawCallbackPayloadResponse;

}