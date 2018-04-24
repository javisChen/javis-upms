package javis.app.web.service;

import com.baomidou.mybatisplus.service.IService;
import javis.app.web.base.resp.SysResponse;
import javis.app.web.entity.SysUser;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
public interface ISysUserService extends IService<SysUser> {

    SysResponse login(SysUser sysUser);
}
