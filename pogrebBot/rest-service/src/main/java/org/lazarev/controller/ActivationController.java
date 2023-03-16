package org.lazarev.controller;


import org.lazarev.service.UserActivationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ActivationController {

    private final UserActivationService userActivationService;


    public ActivationController(UserActivationService userActivationService) {
        this.userActivationService = userActivationService;
    }
    @RequestMapping(method = RequestMethod.GET,value = "activation")
    public ResponseEntity<?> activation(@RequestParam("id") String id){
        var res=userActivationService.activation(id);
        if(res){
            return ResponseEntity.ok().body("Регистрация прошла успешна!");
        }
        return ResponseEntity.internalServerError().build();
    }
}
