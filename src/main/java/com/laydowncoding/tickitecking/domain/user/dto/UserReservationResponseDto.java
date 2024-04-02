package com.laydowncoding.tickitecking.domain.user.dto;

import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserReservationResponseDto {

    private Long concertId;
    private String concertName;
    private String concertDescription;
    private LocalDateTime concertStartDate;
    private Long auditoriumId;
    private String auditoriumName;
    private String auditoriumAddress;
    private Long seatId;
    private String vertical;
    private String horizontal;
    private String grade;
    private Double price;

    @QueryProjection
    public UserReservationResponseDto(Long concertId, String concertName, String concertDescription,
        LocalDateTime concertStartDate, Long auditoriumId, String auditoriumName, String auditoriumAddress,
        Long seatId, String vertical, String horizontal, String grade, Double price) {
        this.concertId = concertId;
        this.concertName = concertName;
        this.concertDescription = concertDescription;
        this.concertStartDate = concertStartDate;
        this.auditoriumId = auditoriumId;
        this.auditoriumName = auditoriumName;
        this.auditoriumAddress = auditoriumAddress;
        this.seatId = seatId;
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.grade = grade;
        this.price = price;
    }
}
