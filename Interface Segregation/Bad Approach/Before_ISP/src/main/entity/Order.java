package entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Order extends  Entity{

    private LocalDateTime orderPlacedOn;
    private double totalValue;
}
