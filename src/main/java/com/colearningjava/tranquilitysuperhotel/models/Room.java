package com.colearningjava.tranquilitysuperhotel.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Room extends Base{
    @Column(unique = true)
    private String number;
    @ManyToOne
    private RoomType roomType;
}
