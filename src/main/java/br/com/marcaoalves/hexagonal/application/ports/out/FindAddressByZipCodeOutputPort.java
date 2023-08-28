package br.com.marcaoalves.hexagonal.application.ports.out;

import br.com.marcaoalves.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
