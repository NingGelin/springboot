package org.example.springboot.repository;

import org.example.springboot.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserInfo dao层（jpa）
 *
 * @author ninggelin
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
