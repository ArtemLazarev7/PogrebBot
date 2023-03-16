package org.lazarev.dao;

import org.lazarev.entity.RawData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawDataDAO extends JpaRepository<RawData,Long> {
}
