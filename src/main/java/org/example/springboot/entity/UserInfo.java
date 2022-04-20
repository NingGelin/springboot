package org.example.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>用户信息</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 17:09
 **/
@Entity
@Table
@Data
public class UserInfo {
    @Id
    private Long id;
}
