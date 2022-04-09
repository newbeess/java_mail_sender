package org.newbeess.mail.sender.controller;

import org.newbeess.mail.sender.service.MailService;
import org.newbeess.mail.sender.vo.SimpleMailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/mail/")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("simpleMail")
    public boolean sendSimpleMail(@RequestBody SimpleMailRequest request) {
        return mailService.sendSimpleMail(request.getTo(), request.getSubject(), request.getBody());
    }
}
