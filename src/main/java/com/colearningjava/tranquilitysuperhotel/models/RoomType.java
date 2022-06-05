package com.colearningjava.tranquilitysuperhotel.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class RoomType extends Base{
    private String description;
    private String name;
    private BigDecimal price;

    @OneToMany
    private List<ImgUrl> photos = new ArrayList<>();
}
