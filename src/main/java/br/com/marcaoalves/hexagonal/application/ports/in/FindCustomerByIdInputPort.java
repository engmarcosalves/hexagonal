package br.com.marcaoalves.hexagonal.application.ports.in;

import br.com.marcaoalves.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
