package com.example.Lecture26.clients;

import com.example.Lecture26.response.MultipleUserResponse;
import com.example.Lecture26.response.SingleUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "request-client", url = "https://reqres.in")
public interface RequestClient {

    @GetMapping("/api/users/{id}")
    SingleUserResponse getUserById(@PathVariable(name = "id") Integer id);

    @GetMapping("api/users")
    MultipleUserResponse getAllUser(@RequestParam(name = "page", required = false) Integer page);
}
