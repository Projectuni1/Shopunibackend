package com.example.mohandesinarm.Controller.Items.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class addItemRequest {
    private int categoryId;
    private String title;
    private String itemDesc;
    private String image;
}
