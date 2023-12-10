package com.example.mohandesinarm.Controller.MostRated.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MostRatedRequest {
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
}
