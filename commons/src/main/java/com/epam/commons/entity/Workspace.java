package com.epam.commons.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "workspace")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Workspace {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "unit")
    private int unit;
    @Column(name = "seat")
    private int seat;
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "os_family")
    private String osFamily;
}
