package org.lazarev.service;

import org.lazarev.entity.AppDocument;
import org.lazarev.entity.AppPhoto;
import org.lazarev.service.enums.LinkType;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);

    AppPhoto processPhoto(Message telegramMessage);

    String generateLink(Long docId, LinkType linkType);
}
