package kg.marsel.emailmaker.controller;


import kg.marsel.emailmaker.model.User;
import kg.marsel.emailmaker.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/info")
    public ResponseEntity<?> createEmail(@RequestBody User user){

        return new ResponseEntity<>(userService.createEmail(user), HttpStatus.OK);

    }

}
