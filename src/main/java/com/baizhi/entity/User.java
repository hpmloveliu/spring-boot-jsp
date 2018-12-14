package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user2")
public class User {
    @Id
    @Transient
    private Integer id;
    private String name;
    @Column(name = "BIRTHDAY")


   // @JSONField(format = "yyyy-MM-dd")
    //@JsonFormat(timezone = "GMT+8",pattern="yyyy-MM-dd")   //jsckson自带的注解
    //@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    @Column(name = "user_age")
    private Integer userAge;
}
