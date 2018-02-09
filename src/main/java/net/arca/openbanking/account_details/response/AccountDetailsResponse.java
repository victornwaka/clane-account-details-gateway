package net.arca.openbanking.account_details.response;

import lombok.*;

import java.io.Serializable;
//import DepositType;
//import Status;
//import SubStatus;
//import Summary;


@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AccountDetailsResponse implements Serializable{


    private String accountNumber;
    private String subscriberName; //clientName in Mifos
    private String currencyCode;
    private String accountType;

//    Note: deprecated
//    private String accountId;
//    private String clientId;
//    private String clientName;
//    private String savingsProductId;
//    private String savingsProductName;
//    private String fieldOfficerId;
//
//    private DepositType depositType;
//    private Status status;
//    private SubStatus subStatus;
//    private boolean isDormancyTrackingActive;
//    private Summary summary;
}
