package javis.app.persistent.service.impl;

import javis.app.persistent.entity.SysUser;
import javis.app.persistent.dao.SysUserMapper;
import javis.app.persistent.service.SysUserService;
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
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
