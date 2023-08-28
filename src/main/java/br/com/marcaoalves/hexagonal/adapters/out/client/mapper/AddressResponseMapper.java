package br.com.marcaoalves.hexagonal.adapters.out.client.mapper;

import br.com.marcaoalves.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.marcaoalves.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
