package lk.test.haulmatic.service.impl;

import lk.test.haulmatic.dto.VehicleDTO;
import lk.test.haulmatic.entity.Vehicle;
import lk.test.haulmatic.repository.VehicleRepository;
import lk.test.haulmatic.service.VehicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class VehicalServiceImpl implements VehicalService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public ArrayList<VehicleDTO> getVehicals() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        ArrayList<VehicleDTO> alVehicleList = new ArrayList<>();
        for ( Vehicle vehicle: vehicles ) {
            VehicleDTO vehicleDTO = new VehicleDTO(vehicle.getVehicalId(),
                    vehicle.getVehicleName());
            alVehicleList.add(vehicleDTO);
        }
        return alVehicleList;
    }
}
