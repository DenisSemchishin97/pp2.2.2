package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmpl;

@Controller
public class CarController {
    private CarServicelmpl carService;
    @Autowired
    CarController(CarServicelmpl carService){
        this.carService=carService;
    }
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int a, Model model) {
        model.addAttribute("cars", carService.getCars(a));
        return "cars";
    }
}
