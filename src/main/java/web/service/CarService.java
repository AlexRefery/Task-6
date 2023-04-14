package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lamborghini Diablo", "sport car", "yellow"));
        cars.add(new Car("Lamborghini Reventón", "sport car", "green"));
        cars.add(new Car("Lotus Eletre", "sport car", "red"));
        cars.add(new Car("Ferrari Portofino", "sport car", "green"));
        cars.add(new Car("KAMAZ", "truck", "orange"));
    }

    public List<Car> getCars(int count) {
        List<Car> resultList = new ArrayList<>();
        count = Integer.min(count, cars.size());
        for (int i = 0; i < count; i++) {
            resultList.add(cars.get(i));
        }
        return resultList;
    }
}
