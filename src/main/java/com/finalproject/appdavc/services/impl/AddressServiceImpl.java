package com.finalproject.appdavc.services.impl;

import com.finalproject.appdavc.dto.AddressDTO;
import com.finalproject.appdavc.model.Address;
import com.finalproject.appdavc.repository.UserAddressRepository;
import com.finalproject.appdavc.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    UserAddressRepository userAddressRepository;

    @Override
    public void add(AddressDTO address) {
        userAddressRepository.save(new Address(address));
    }

}
