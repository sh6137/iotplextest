package com.example.iotplextest.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommandAAA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String command;
    private String sender;
    private String valuesA;
    private String latitude;
    private String longitude;
    private String valuesB;
    private String dataLength;
    private String YN;
    private String date;
    private String active;
    private String valuesC;
    private String valuesD;
    private String onAndOff;
    private String lengthData;
    private String valuesE;
    private String valuesF;
    private String specialData;
    private String fieldData;
    private String totalData;
    private String checksum;
}
