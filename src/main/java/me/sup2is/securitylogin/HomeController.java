package me.sup2is.securitylogin;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(Principal principal, Model model){
        model.addAttribute("user", principal.getName());
        model.addAttribute("roles", ((UsernamePasswordAuthenticationToken) principal).getAuthorities());
        
        System.out.println("principal : " + principal);
        System.out.println("model : " + model);
        
        return "/home";
    }

    @GetMapping("/admin")
    public String admin(Principal principal, Model model){
        model.addAttribute("user", principal.getName());
        model.addAttribute("roles", ((UsernamePasswordAuthenticationToken) principal).getAuthorities());
        
        System.out.println("principal : " + principal);
        System.out.println("model : " + model);
        
        return "/admin";
    }
    
    @GetMapping("/doctor")
    public String doctor(Principal principal, Model model){
        model.addAttribute("user", principal.getName());
        model.addAttribute("roles", ((UsernamePasswordAuthenticationToken) principal).getAuthorities());
        
        System.out.println("principal : " + principal);
        System.out.println("model : " + model);
        
        return "/doctor";
    }
    
    @GetMapping("/nurse")
    public String nurse(Principal principal, Model model){
        model.addAttribute("user", principal.getName());
        model.addAttribute("roles", ((UsernamePasswordAuthenticationToken) principal).getAuthorities());
        
        System.out.println("principal : " + principal);
        System.out.println("model : " + model);
        
        return "/nurse";
    }

    @GetMapping("/403")
    public String forbidden() {
        return "/403";
    }

}
