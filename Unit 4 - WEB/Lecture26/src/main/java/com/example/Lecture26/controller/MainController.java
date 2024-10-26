package com.example.Lecture26.controller;

import com.example.Lecture26.model.User;
import com.example.Lecture26.response.MultipleUserResponse;
import com.example.Lecture26.response.MyUserResponse;
import com.example.Lecture26.response.SingleUserResponse;
import com.example.Lecture26.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user{id}")
    SingleUserResponse getUser(@PathVariable(name = "id") Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/get-all-user")
    MultipleUserResponse getUsers(@RequestParam(name = "page", required = false) Integer page) {
        return userService.getAllUser(page);
    }

    // --------------------------------- Stream Api -------------------------------------------
    @GetMapping("/get-userName-with-functional-interface")
    String getUserNameWithFunctionalInterface(@RequestParam Integer id) {
        return userService.getUserNameWithFunctionalInterface(id);
    }

    @GetMapping("/mapping-with-function")
    MyUserResponse mappingWithFunction(@RequestParam Integer id) {
        return userService.mappingWithFunction(id);
    }

    @GetMapping("/filter-user-by-email")
    List<User> filteredUserByEmail(@RequestParam(name = "page", required = false) Integer page, String filter) {
        return userService.filteredUserByEmail(page, filter);
    }

    @GetMapping("/filtered-user-id")
    List<User> filteredUserId(@RequestParam(required = false) Integer page, Integer filterId) {
        return userService.filteredUserId(page, filterId);
    }


    @GetMapping("/mapping-with-collect")
    User mappingWithCollect(@RequestParam(required = false) Integer page, Integer id) {
        return userService.mappingWithCollect(page, id);
    }
}
