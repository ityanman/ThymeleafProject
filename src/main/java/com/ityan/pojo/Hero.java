package com.ityan.pojo;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "hero")
public class Hero {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer cust_id;
    private String cust_name;
    private String cust_profession;
    private String cust_phone;
    private String email;
    private Date onlinetime;
}
