package javis.app.base;

import com.github.pagehelper.PageHelper;
import javis.app.common.base.BaseRequestParam;
import javis.app.common.contants.ResultEnum;
import javis.app.common.exception.BusinessException;
import javis.app.common.lay.LayTableResult;
import javis.app.common.page.Pager;
import javis.app.common.response.ServerResult;
import javis.app.common.response.SysResponse;
import javis.app.persistent.base.IGenericMapper;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Objects;

/*
 * @author JavisChen
 * @desc 抽象泛型业务基类，封装重复和基础的业务方法
 * @date 2018/4/17 下午10:33
 */
public interface IGenericService<T> {

    /**
     * 子类去实现，获取DAO（Mapper）
     * @return IGenericMapper
     */
    IGenericMapper<T> getMapper();

    /**
     * 按主键删除数据
     * @param pk 主键
     * @return BusinessHandleResult
     */
    default ServerResult remove(Integer pk) {
        if (Objects.isNull(pk)) {
            return SysResponse.error(ResultEnum.ILLEGAL_ARGUMENT);
        }
        this.getMapper().deleteByPrimaryKey(pk);
        return SysResponse.success();
    }

    /*
     * @desc 新增
     * @param [entity]  
     * @return javis.app.common.response.ServerResult  
     */
    default ServerResult save(T entity) {
        if (Objects.isNull(entity)) {
            return SysResponse.error(ResultEnum.ILLEGAL_ARGUMENT);
        }
        this.getMapper().insertSelective(entity);
        return SysResponse.success();
    }

    /*
     * @desc 选择性更新实体对象
     * @param [entity]  
     * @return javis.app.common.response.ServerResult  
     */
    default ServerResult update(T entity) {
        if (Objects.isNull(entity)) {
            return SysResponse.error(ResultEnum.ILLEGAL_ARGUMENT);
        }
        this.getMapper().updateByPrimaryKeySelective(entity);
        return SysResponse.success();
    }

    /*
     * @desc 按主键查询实体对象
     * @param [pk]  
     * @return javis.app.common.response.ServerResult  
     */
    default ServerResult findObject(Integer pk) {
        if (Objects.isNull(pk)) {
            return SysResponse.error(ResultEnum.ILLEGAL_ARGUMENT);
        }
        return SysResponse.success(this.getMapper().selectByPrimaryKey(pk));
    }

    /*
     * @desc 按条件筛选查询列表数据
     * @param [condition]  
     * @return javis.app.common.result.web.lay.LayTableResult  
     */
    default LayTableResult findList(BaseRequestParam condition) {
        PageHelper.startPage(condition.getOffset(), condition.getLimit());
        List<T> list = this.getMapper().listByParams(condition);
        return SysResponse.layTable(new Pager<>(list));
    }

    /*
     * @desc 校验参数
     * @param [bindingResult]  
     * @return void  
     */
    default void validateParams(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new BusinessException(bindingResult.getFieldError().getDefaultMessage());
        }
    }
}
