package com.colearningjava.tranquilitysuperhotel.models;

import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class RoomType extends Base{
    private String description;
    private String name;
    private BigDecimal price;
}
