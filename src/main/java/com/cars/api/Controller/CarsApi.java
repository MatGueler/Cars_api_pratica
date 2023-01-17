package com.cars.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("create")
public class CarsApi {
    @PostMapping
    public void create(@RequestBody CarsDTO req) {

        System.out.println("Modelo: " + req.modelo());
        System.out.println("Fabricante: " + req.fabricante());
        System.out.println("Fabricação: " + req.dataFabricacao());
        System.out.println("Valor: " + req.valor());
        System.out.println("Ano: " + req.anoModelo());

    }
}
