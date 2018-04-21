package javis.app.persistent.service.impl;

import javis.app.persistent.entity.AuthApi;
import javis.app.persistent.dao.AuthApiMapper;
import javis.app.persistent.service.AuthApiService;
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
public class AuthApiServiceImpl extends ServiceImpl<AuthApiMapper, AuthApi> implements AuthApiService {

}
