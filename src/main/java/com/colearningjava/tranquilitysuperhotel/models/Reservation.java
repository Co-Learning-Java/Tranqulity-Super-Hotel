package com.colearningjava.tranquilitysuperhotel.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Reservation extends Base{
    @ManyToOne
    private User user;
    @ManyToOne
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
}
