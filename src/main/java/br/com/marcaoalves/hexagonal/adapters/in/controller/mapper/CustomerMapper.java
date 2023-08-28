package br.com.marcaoalves.hexagonal.adapters.in.controller.mapper;

import br.com.marcaoalves.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.marcaoalves.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValid", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
