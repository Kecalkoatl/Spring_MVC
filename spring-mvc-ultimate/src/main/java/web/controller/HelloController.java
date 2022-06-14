package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final CarService carService;

    @Autowired
    public HelloController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String getAllCars(HttpServletRequest request, Model model) {
        if((request.getParameter("count"))!=null) {
            int numberOfCars = Integer.parseInt(request.getParameter("count"));
            model.addAttribute("cars", carService.carCount(numberOfCars));
        }
        else model.addAttribute("cars", carService.getCarList());

        return "cars";
    }

//


}