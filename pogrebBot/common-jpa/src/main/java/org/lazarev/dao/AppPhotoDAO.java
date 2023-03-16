package org.lazarev.dao;

import org.lazarev.entity.AppPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppPhotoDAO extends JpaRepository<AppPhoto,Long> {
}
