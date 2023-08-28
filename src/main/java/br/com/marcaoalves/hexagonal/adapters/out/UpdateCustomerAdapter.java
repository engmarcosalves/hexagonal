package br.com.marcaoalves.hexagonal.adapters.out;

import br.com.marcaoalves.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import br.com.marcaoalves.hexagonal.adapters.out.repository.CustomerRepository;
import br.com.marcaoalves.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.marcaoalves.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.marcaoalves.hexagonal.application.core.domain.Customer;
import br.com.marcaoalves.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
