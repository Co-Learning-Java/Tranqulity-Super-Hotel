package com.colearningjava.tranquilitysuperhotel.dto;

import lombok.*;

import java.math.BigDecimal;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeDTO {
    private String description;
    private String name;
    private BigDecimal price;
}
