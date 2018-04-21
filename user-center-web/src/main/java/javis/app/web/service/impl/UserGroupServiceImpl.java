package javis.app.web.service.impl;

import javis.app.web.entity.UserGroup;
import javis.app.web.dao.UserGroupMapper;
import javis.app.web.service.IUserGroupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author javis
 * @since 2018-04-21
 */
@Service
public class UserGroupServiceImpl extends ServiceImpl<UserGroupMapper, UserGroup> implements IUserGroupService {

}
