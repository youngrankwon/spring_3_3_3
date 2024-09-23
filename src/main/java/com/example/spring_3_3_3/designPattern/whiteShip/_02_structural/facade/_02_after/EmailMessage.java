package com.example.spring_3_3_3.designPattern.whiteShip._02_structural.facade._02_after;

import lombok.Data;

@Data
public class EmailMessage {

    private String from;
    private String to;
    private String cc;
    private String subject;
    private String text;
}
