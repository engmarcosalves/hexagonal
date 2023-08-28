package br.com.marcaoalves.hexagonal.adapters.out.repository.mapper;

import br.com.marcaoalves.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.marcaoalves.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
