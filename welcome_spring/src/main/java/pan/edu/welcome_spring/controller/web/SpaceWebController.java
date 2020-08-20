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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.welcome_spring.service.space.impls.SpaceServiceImpl;

@Controller
@RequestMapping("/web/space")
public class SpaceWebController {

    @Autowired
    SpaceServiceImpl spaceService;

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",spaceService.getAll());
        return "spacelist";
    }

/*    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){

        cafedraService.delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }

*/
}
