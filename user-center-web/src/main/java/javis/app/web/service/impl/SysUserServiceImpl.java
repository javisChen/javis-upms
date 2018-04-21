package javis.app.web.service.impl;

import javis.app.web.entity.SysUser;
import javis.app.web.dao.SysUserMapper;
import javis.app.web.service.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author javis
 * @since 2018-04-21
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
