package com.epam.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Workspace {
    private String id;
    private int unit;
    private int seat;
    private String serialNumber;
    private OSFamily osFamily;
}
