package com.konkuk.bit.bitpay.menu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@RedisHash(value = "menu", timeToLive = -1L)
public class Menu {
    @Id
    @Column(name = "menu_number")
    private Long number;
    @Column(name = "menu_price")
    private Integer price;
    @Column(name = "menu_name")
    private String name;
    @Column(name = "menu_remain")
    private Integer remain;
    @Column(name = "menu_status")
    private String status;


}
