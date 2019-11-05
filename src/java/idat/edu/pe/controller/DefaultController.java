
package idat.edu.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {
    
    @RequestMapping(value ="/", method = RequestMethod.GET)    
    public String index (){
        return "index";
    }
    
    @RequestMapping(value ="/home", method = RequestMethod.GET)    
    public String home (Model model){
        String mensaje ="HOLA MUNDO";
        model.addAttribute("mensaje", mensaje);
        return "home";
    }
    
    
}
