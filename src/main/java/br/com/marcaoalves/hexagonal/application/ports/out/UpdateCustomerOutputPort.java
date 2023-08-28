package br.com.marcaoalves.hexagonal.application.ports.out;

import br.com.marcaoalves.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
