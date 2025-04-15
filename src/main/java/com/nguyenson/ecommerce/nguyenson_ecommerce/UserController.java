package com.nguyenson.ecommerce.nguyenson_ecommerce;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.fetchAllUsers(),
                HttpStatus.OK);
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = userService.fetchUser(id);
        if (user == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(user);
    }

    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.ok("Add user successfully.");
    }
}
