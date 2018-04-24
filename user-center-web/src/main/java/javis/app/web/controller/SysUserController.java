package javis.app.web.controller;


import javis.app.web.base.BaseController;
import javis.app.web.base.resp.SysResponse;
import javis.app.web.entity.SysUser;
import javis.app.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@RestController
public class SysUserController extends BaseController {

    @Autowired
    private ISysUserService sysUserService;

    @PostMapping("/login")
    public SysResponse login(SysUser sysUser) {
        return sysUserService.login(sysUser);
    }

    @PostMapping("/logout")
    public SysResponse logout() {
        return SysResponse.ok();
    }
}

