package br.com.marcaoalves.hexagonal.adapters.in.controller;

import br.com.marcaoalves.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import br.com.marcaoalves.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.marcaoalves.hexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.marcaoalves.hexagonal.application.core.domain.Customer;
import br.com.marcaoalves.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.marcaoalves.hexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.marcaoalves.hexagonal.application.ports.in.UpdateCustomerInputPort;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerRespose(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

}
