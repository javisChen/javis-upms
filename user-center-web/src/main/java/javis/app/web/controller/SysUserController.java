package javis.app.web.controller;


import com.baomidou.mybatisplus.plugins.Page;
import javis.app.web.annotation.SysLog;
import javis.app.web.base.BaseController;
import javis.app.web.base.resp.SysResponse;
import javis.app.web.constants.WebConst;
import javis.app.web.entity.SysUser;
import javis.app.web.service.ISysUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@RestController
@Log4j2
public class SysUserController extends BaseController {

    @Autowired
    private ISysUserService sysUserService;

    @PostMapping("/login")
    public SysResponse login(@RequestBody SysUser sysUser) {
        return sysUserService.login(sysUser, getSession());
    }

    @GetMapping("/logout")
    public SysResponse logout() {
        getSession().removeAttribute(WebConst.SESSION_LOGIN_USER);
        return SysResponse.ok();
    }

    @PostMapping("/users")
    @SysLog(desc = "用户集合")
    public SysResponse getUserList(@RequestBody SysUser sysUser) throws IllegalAccessException {
        Page<SysUser> sysUserPage = sysUserService.selectPage(sysUser.page(), sysUser.buildEntityWrapper());
        return SysResponse.ok(sysUserPage);
    }

    @GetMapping("/users/{id}")
    @SysLog(desc = "用户集合")
    public SysResponse getUserById(@PathVariable("id") String id) {
        SysUser sysUser = sysUserService.selectById(id);
        sysUser.setPassword(null);
        return SysResponse.ok(sysUser);
    }

    @PutMapping("/users")
    @SysLog(desc = "用户集合")
    public SysResponse updateUser(@RequestBody SysUser sysUser) {
        return sysUserService.update(sysUser);
    }

}

