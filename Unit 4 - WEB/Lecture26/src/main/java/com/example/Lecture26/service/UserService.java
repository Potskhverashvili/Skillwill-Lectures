package com.example.Lecture26.service;

import com.example.Lecture26.clients.RequestClient;
import com.example.Lecture26.excaption.CustomException;
import com.example.Lecture26.excaption.ErrorMessages;
import com.example.Lecture26.model.MyFunctionalInterface;
import com.example.Lecture26.model.User;
import com.example.Lecture26.response.MultipleUserResponse;
import com.example.Lecture26.response.MyUserResponse;
import com.example.Lecture26.response.SingleUserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final RequestClient requestClient;

    public UserService(RequestClient requestClient) {
        this.requestClient = requestClient;
    }

    // ---- Get User By Id -----
    public SingleUserResponse getUserById(Integer id) {
        if (requestClient.getUserById(id).getData() == null)
            throw new CustomException(ErrorMessages.USER_NOT_FOUND);
        return requestClient.getUserById(id);
    }

    // ----- Get ALl User -------
    public MultipleUserResponse getAllUser(Integer page) {
        if (requestClient.getAllUser(page).getData().isEmpty())
            throw new CustomException(ErrorMessages.USER_NOT_FOUND);
        return requestClient.getAllUser(page);
    }

    // -------------------Stream Api - Functional Interface - Stream Operations---------------------------------------

    // ------------------ Get Filtered User By e-mail -------------------
    public List<User> filteredUserByEmail(Integer page, String filter) {
        List<User> userList = requestClient.getAllUser(page).getData();
        List<User> filtered = userList.stream().filter(user -> user.getEmail().startsWith(filter)).toList();

        if (filtered.isEmpty())
            throw new CustomException(ErrorMessages.USER_NOT_FOUND);
        return filtered;
    }

    // --------------------- Functional Interface -----------------------
    public String getUserNameWithFunctionalInterface(Integer id) {
        User userData = requestClient.getUserById(id).getData();
        MyFunctionalInterface myFunctionalInterface = (user) -> user.getFirstName();
        return myFunctionalInterface.getUserField(userData);
    }

    // ------------------ Function as a Mapper Alternative ----------------
    public MyUserResponse mappingWithFunction(Integer id) {
        Function<User, MyUserResponse> mapUserToMyUserResponse = (user) -> new MyUserResponse(user);
        SingleUserResponse user = requestClient.getUserById(id);
        return mapUserToMyUserResponse.apply(user.getData());
    }

    // ------------------ Map() as a Mapper Alternative ----------------

    public List<MyUserResponse> mappingWithMap(Integer page){
        MultipleUserResponse multipleUserResponse = requestClient.getAllUser(page);
        List<User> data = multipleUserResponse.getData();

        List<MyUserResponse> list = data.stream().map(x-> new MyUserResponse(x)).toList();

        return list;
    }

    // ------------------------Mapping With Collect ------------------------------
    public User mappingWithCollect(Integer page, Integer userId){
        MultipleUserResponse multipleUserResponse = requestClient.getAllUser(page);

        List<User> data = multipleUserResponse.getData();
        Map<Integer, User> collect = data.stream().collect(Collectors.toMap(x-> x.getId(), j -> j));
        return collect.get(userId);
    }

    // --------------------------- Predicate ------------------------------
    public List<User> filteredUserId(Integer page, Integer filterId) {
        List<User> users = requestClient.getAllUser(page).getData();
        if (users.isEmpty())
            throw new CustomException(ErrorMessages.USER_NOT_FOUND);

        users.stream().forEach(x-> System.out.println(x));
        return users.stream().filter(user -> user.getId() > filterId).toList();
    }



}
