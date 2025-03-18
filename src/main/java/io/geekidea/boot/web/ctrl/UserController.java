package io.geekidea.boot.web.ctrl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "用户")
@RestController()
public class UserController {

    @ApiOperation(value = "注册")
    @PostMapping("")
    public void register(
        @RequestParam(value = "YFD_MODEL", defaultValue = "0") String deviceModel,
        @RequestParam(value = "YFD_U", defaultValue = "") String serialNumber) {
        return;
    }

    @ApiOperation(value = "获取用户信息")
    @GetMapping("/detail")
    public void getUserInfo(@RequestParam(value = "appleId", defaultValue = "0") long userId) {

    }
}

