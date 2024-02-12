package com.scaler.bookmyshowfeb23.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.annotation.MergedAnnotations;

@Getter
@Setter
public class ShowSeat extends BaseModel {
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
