package org.northernjay.msscbreweryinventoryfailover.controllers;

import org.northernjay.msscbreweryinventoryfailover.model.BeerInventoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//@RestController
@RequestMapping("/inventory-failover")
public class BeerInventoryController {

    @GetMapping
    BeerInventoryDto getInventory(){
        return BeerInventoryDto.builder()
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .build();
    }
}
