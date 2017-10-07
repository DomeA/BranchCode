package com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 0 未知
 * 1 阴极保护读数
 * 2 管道运行读数
 * 3 检测
 * 4 完整性管理
 * 5 开挖验证
 * 6 改线
 * 186管道完整性数据库-数据字典
 * 99 其它
 */
@Table(name = "ActivityType", schema = "public", catalog = "postgisdb")
@Entity
public class ActivityTypeEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "autoid")
    @GenericGenerator(name = "autoid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    @Column(name = "value")
    private Integer value;
    @Column(name = "name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
