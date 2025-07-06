package ms.venta.servicios.serviceimpl;

import ms.venta.modelo.FormaPago;
import ms.venta.repositorio.FormaPagoRep;
import ms.venta.servicios.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoImp implements FormaPagoService {
    @Autowired
    FormaPagoRep repository;

    @Override
    public List<FormaPago> findAll() {
        return repository.findAll();
    }
}
