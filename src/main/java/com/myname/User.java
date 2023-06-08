package com.myname;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class User {

    public String createUserJson(String name, String surname) {

        UserDto user = new UserDto();
        user.setName(name);
        user.setLastName(surname);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(user);

    }

}
