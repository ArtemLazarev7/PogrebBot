package org.lazarev.service;

import org.lazarev.dto.MailParams;

public interface MailSenderService {

    void send(MailParams mailParams);
}
