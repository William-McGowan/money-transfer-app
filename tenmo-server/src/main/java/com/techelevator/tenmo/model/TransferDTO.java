package com.techelevator.tenmo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferDTO {
    private Integer transferId;
    private Integer accountFrom;
    private Integer accountTo;
    private Integer transferType;
    private Integer transferStatus;
    private Double amount;
}
