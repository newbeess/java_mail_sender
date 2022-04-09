package org.newbeess.mail.sender.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleMailRequest {

    private String to;
    private String subject;
    private String body;
}
