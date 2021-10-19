package guru.springframework.msscbreweryservice.services;

import guru.springframework.msscbreweryservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto saveNewBeer(BeerDto beer);
}
