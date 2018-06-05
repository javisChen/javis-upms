package javis.upms.web.controller;


import javis.upms.web.base.BaseController;
import javis.upms.web.base.resp.ServerResponse;
import javis.upms.web.constants.WebConst;
import javis.upms.web.dto.UserDTO;
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
@RequestMapping("/sessions")
public class SessionController extends BaseController {


    @Autowired
    private IUpmsUserService iUpmsUserService;

    @PostMapping
    public ServerResponse login(@RequestBody UserDTO userDTO) {
        return iUpmsUserService.login(userDTO, getSession());
    }

    @DeleteMapping
    public ServerResponse logout() {
        getSession().removeAttribute(WebConst.SESSION_LOGIN_USER);
        return ServerResponse.success();
    }
}

