package com.co.intevo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co.intevo.models.FacturaModel;
import com.co.intevo.repositories.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;

    public ArrayList<FacturaModel> getFactura(){
        return (ArrayList<FacturaModel>) facturaRepository.findAll();
    }

    public FacturaModel setFactura(FacturaModel factura){
        return facturaRepository.save(factura);
    }
    
    // @Transactional(readonly = true)
    public Optional<FacturaModel> getFacturaById(Long id) {
        return facturaRepository.findById(id);
    }
}
