package org.lazarev.service;

import org.lazarev.entity.AppDocument;
import org.lazarev.entity.AppPhoto;
import org.lazarev.entity.BinaryContent;
import org.springframework.core.io.FileSystemResource;

public interface FileService {

    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);

}
