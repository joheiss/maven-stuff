package com.jovisco;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var message = "hi josef!";
        System.out.println("Hi Josef!");
        System.out.println(StringUtils.capitalize(StringUtils.capitalize(message)));
        System.out.println(StringUtils.capitalize(StringUtils.upperCase(message)));
    }

    public String hi() {
        return "Hi Josef, how are you?";
    }
}
