package guru.springframework.msscbreweryservice.web.mappers;

import guru.springframework.msscbreweryservice.domain.Beer;
import guru.springframework.msscbreweryservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer bearDtoToBeer(BeerDto beerDto);
}
