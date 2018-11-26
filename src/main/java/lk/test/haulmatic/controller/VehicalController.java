package lk.test.haulmatic.controller;

import lk.test.haulmatic.dto.VehicleDTO;
import lk.test.haulmatic.service.VehicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicalController {

    @Autowired
    private VehicalService vehicalService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<VehicleDTO> getVehicals(){
        return vehicalService.getVehicals();
    }
}
