package com.ani.service;

import com.ani.model.TwoFactorOTP;
import com.ani.model.User;

public interface TwoFactorOtpService {

    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp,String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);

}
