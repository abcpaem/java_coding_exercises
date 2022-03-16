package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
        return capitalizedWord;
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double  priceWithVat = originalPrice + originalPrice * (vatRate / 100);
        return Math.round(priceWithVat * 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int linuxUsers = 0;
        for (User user : users)
        {
            if (user.getType().equalsIgnoreCase("linux"))
            {
                linuxUsers++;
            }
        }
        return linuxUsers;
    }
}
