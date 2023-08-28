package br.com.marcaoalves.hexagonal.application.ports.out;

import br.com.marcaoalves.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
