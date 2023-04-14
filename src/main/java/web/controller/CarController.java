package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(required = false) Integer count) {
        if (count == null) {
            count = Integer.MAX_VALUE;
        }
        List<String> cars = carService.getCars(count).stream().map(Car::toString).toList();
        model.addAttribute("cars", cars);
        return "car";
    }
}
