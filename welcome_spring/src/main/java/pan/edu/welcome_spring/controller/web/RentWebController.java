package pan.edu.welcome_spring.controller.web;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pan.edu.welcome_spring.service.rent.impls.RentServiceImpl;

@Controller
@RequestMapping("/web/rent")
public class RentWebController {

    @Autowired
    RentServiceImpl rentService;

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",rentService.getAll());
        return "rentlist";
    }

}
