package webModulePackage.converter;

import coreModulePackage.Entities.RentAction;
import org.springframework.stereotype.Component;
import webModulePackage.converter.BaseConverter;
import webModulePackage.dto.EntitiesDTO.RentDto;

@Component
public class RentConverter extends BaseConverter<RentAction, RentDto> {
    @Override
    public RentAction convertDtoToModel(RentDto dto) {
        RentAction rent = RentAction.builder()
                .clientId(dto.getClientID())
                .movieId(dto.getMovieId())
                .build();
        rent.setId(dto.getId());
        return rent;
    }

    @Override
    public RentDto convertModelToDto(RentAction rentAction) {
        RentDto dto = RentDto.builder()
                .clientID(rentAction.getClientId())
                .movieId(rentAction.getMovieId())
                .build();
        dto.setId(rentAction.getId());
        return dto;
    }
}
