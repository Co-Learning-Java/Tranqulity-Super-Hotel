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
    private BigDecimal price;

    @ManyToOne
    private RoomType roomType;
    @OneToMany
    private List<ImgUrl> photos = new ArrayList<>();
}
