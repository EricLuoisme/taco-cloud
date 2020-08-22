package com.sia.tacocloud.domain;

import lombok.Data;

/**
 * @author lykis
 */
@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
