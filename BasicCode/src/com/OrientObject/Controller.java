package com.OrientObject;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-3-8 14:53
 * @description:
 */
public class Controller {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.save();
    }
}
