package io.geekidea.boot.web.ctrl;

import io.geekidea.boot.web.data.user.UserProfileVO;
import io.geekidea.boot.web.data.user.UserRegisterRequest;
import io.geekidea.boot.web.data.user.UserUpdateRequest;
import io.geekidea.boot.web.logic.UserProfileLogic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/17 19:56
 */
@Api(value = "用户")
@RestController("/cat-user")
public class UserController {

    @Autowired
    private UserProfileLogic userProfileLogic;

    @ApiOperation(value = "注册")
    @PostMapping("/register")
    public UserProfileVO register(@RequestBody UserRegisterRequest request) {
        return userProfileLogic.register(request);
    }

    @ApiOperation(value = "获取用户信息")
    @GetMapping("/detail")
    public UserProfileVO getUserInfo(@RequestParam(value = "appleId", defaultValue = "0") long userId) {
        return userProfileLogic.getUserInfo(userId);
    }

    @ApiOperation(value = "更新用户信息")
    @PostMapping("/update")
    public UserProfileVO updateUserInfo(@RequestBody UserUpdateRequest request) {
        return userProfileLogic.update(request);
    }

}

