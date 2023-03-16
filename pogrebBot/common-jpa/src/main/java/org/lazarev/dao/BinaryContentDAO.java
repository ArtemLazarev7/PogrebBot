package org.lazarev.dao;

import org.lazarev.entity.BinaryContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinaryContentDAO extends JpaRepository<BinaryContent,Long> {
}
