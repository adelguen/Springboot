package com.onp.Import.Entity;
import lombok.*;
@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

    private Integer column;
    private Direction dir;

}