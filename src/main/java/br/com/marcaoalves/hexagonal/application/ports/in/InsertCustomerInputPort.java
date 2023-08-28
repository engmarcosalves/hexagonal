package br.com.marcaoalves.hexagonal.application.ports.in;

import br.com.marcaoalves.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
