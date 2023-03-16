package org.lazarev.dao;

import org.lazarev.entity.AppDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDocumentDAO extends JpaRepository<AppDocument,Long> {
}
