package com.ssafy.backend.domain.user.service;

import com.ssafy.backend.domain.user.entity.User;

public interface UserService {

    void updatePassword(Long userId, String password);
    String getRandomNickname();
    String nicknameGenerator();
    User getUserInfo(Long userId);
    void updateUser(Long userId);
    void updateStatus(Long userId);
    void updateNickname(Long userId, String nickname);
    boolean duplicateCheckNickname(String nickname);

}
