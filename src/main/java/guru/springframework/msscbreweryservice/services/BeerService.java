package guru.springframework.msscbreweryservice.services;

import guru.springframework.msscbreweryservice.web.model.BeerDto;
import guru.springframework.msscbreweryservice.web.model.BeerPagedList;
import guru.springframework.msscbreweryservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto saveNewBeer(BeerDto beer);
}
