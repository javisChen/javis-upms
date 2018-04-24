package javis.app.web.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import javis.app.web.base.resp.SysResponse;
import javis.app.web.dao.SysUserMapper;
import javis.app.web.entity.SysUser;
import javis.app.web.service.ISysUserService;
import javis.app.web.util.encrypt.MD5;
import org.springframework.stereotype.Service;

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

    @Override
    public SysResponse login(SysUser sysUser) {
        sysUser.setPassword(MD5.md5ToUpper(sysUser.getPassword()));
        SysUser user = this.baseMapper.selectOne(sysUser);
        return SysResponse.ok(user);
    }
}
