package javis.upms.web.controller;


import com.baomidou.mybatisplus.plugins.Page;
import javis.upms.web.annotation.SysLog;
import javis.upms.web.base.BaseController;
import javis.upms.web.base.resp.SysResponse;
import javis.upms.web.constants.WebConst;
import javis.upms.web.entity.UpmsUser;
import javis.upms.web.service.IUpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author javis
 * @since 2018-05-04
 */
@RestController
@RequestMapping("/users")
public class UpmsUserController extends BaseController {


    @Autowired
    private IUpmsUserService iUpmsUserService;

    @PostMapping("/login")
    public SysResponse login(@RequestBody UpmsUser UpmsUser) {
        return iUpmsUserService.login(UpmsUser, getSession());
    }

    @GetMapping("/logout")
    public SysResponse logout() {
        getSession().removeAttribute(WebConst.SESSION_LOGIN_USER);
        return SysResponse.ok();
    }

    @PostMapping("/users")
    @SysLog(desc = "用户集合")
    public SysResponse getUserList(@RequestBody UpmsUser UpmsUser) throws IllegalAccessException {
        Page<UpmsUser> UpmsUserPage = iUpmsUserService.selectPage(UpmsUser.page(), UpmsUser.buildEntityWrapper());
        return SysResponse.ok(UpmsUserPage);
    }

    @GetMapping("/users/{id}")
    @SysLog(desc = "用户集合")
    public SysResponse getUserById(@PathVariable("id") String id) {
        UpmsUser UpmsUser = iUpmsUserService.selectById(id);
        UpmsUser.setPassword(null);
        return SysResponse.ok(UpmsUser);
    }

    @PutMapping("/users")
    @SysLog(desc = "用户集合")
    public SysResponse updateUser(@RequestBody UpmsUser UpmsUser) {
        return iUpmsUserService.update(UpmsUser);
    }
}

