package com.colearningjava.tranquilitysuperhotel.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDTO {
    private String number;
    private Long roomTypeID;
}
