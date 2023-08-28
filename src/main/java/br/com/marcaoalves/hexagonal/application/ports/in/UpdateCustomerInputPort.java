package br.com.marcaoalves.hexagonal.application.ports.in;

import br.com.marcaoalves.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
