package com.aca.imdb.user;

import com.aca.repository.Repository;

class UserRepository<T extends User> extends Repository<T> {

    public User getUser(String username, String password) {
        for (User user : map.values()) {
            if (user.isCorrect(username, password)) {
                return user;
            }
        }
        return null;
    }

    protected boolean isUnique(String username) {
        for (User user : map.values()) {
            if (username.equals(user.getUsername())) {
                return false;
            }
        }
        return true;
    }

}
