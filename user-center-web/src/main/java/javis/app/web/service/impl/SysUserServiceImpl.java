package javis.app.web.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import javis.app.web.base.resp.SysResponse;
import javis.app.web.constants.WebConst;
import javis.app.web.dao.SysUserMapper;
import javis.app.web.entity.SysUser;
import javis.app.web.service.ISysUserService;
import javis.app.web.util.encrypt.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private  HttpSession session;

    @Override
    public SysResponse login(SysUser sysUser, HttpSession session) {
        sysUser.setPassword(MD5.md5ToUpper(sysUser.getPassword()));
        SysUser user = this.baseMapper.selectOne(sysUser);
        session.setAttribute(WebConst.SESSION_LOGIN_USER, sysUser);
        return SysResponse.ok(user);
    }

    @Override
    public SysResponse update(SysUser sysUser) {
        this.baseMapper.updateById(sysUser);
        SysUser user = this.baseMapper.selectOne(sysUser);
        session.setAttribute(WebConst.SESSION_LOGIN_USER, sysUser);
        return SysResponse.ok(user);
    }
}
