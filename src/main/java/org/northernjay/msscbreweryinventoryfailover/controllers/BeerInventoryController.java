package org.northernjay.msscbreweryinventoryfailover.controllers;

import org.northernjay.msscbreweryinventoryfailover.model.BeerInventoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/inventory-failover")
public class BeerInventoryController {

    @GetMapping
    List<BeerInventoryDto> getInventory(){
        return List.of(BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build());
    }
}
