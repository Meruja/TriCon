package TriCon.controller;

import TriCon.model.User;
import TriCon.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class industrialistController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/ind/index" ,method = RequestMethod.POST)
    public String index(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username" + username);
        System.out.println("Password" + password);

        User user = new User();
        user.setFirstName("romi");
        user.setLastName("praveen");

        userRepository.save(user);
        System.out.println("saved success");

        return "industrialist/index";
    }




    @RequestMapping("/ind/commitedstudents")
    public String commitedstudents(Map<String, Object> model) {
        return "industrialist/commitedstudents";
    }

    @RequestMapping("/ind/weeklyreport")
    public String weeklyreport(Map<String, Object> model) {
        return "industrialist/weeklyreport";
    }


    @RequestMapping("/ind/profileupdate")
    public String profileupdate(Map<String, Object> model) {
        return "industrialist/profileupdate";
    }
}
