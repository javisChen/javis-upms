package javis.app.persistent.base;

import javis.app.common.base.BaseRequestParam;

import java.util.List;

/*
 * @author JavisChen
 * @desc 泛型Mapper基类
 * @date 2018/4/17 下午10:59
 */
public interface IGenericMapper<T> {

    /*
     * @desc 按主键删除数据
     * @param [pk]  
     * @return int  
     */
    int deleteByPrimaryKey(Integer pk);

    /*
     * @desc 插入实体对象
     * @param [entity]
     * @return int
     */
    int insert(T entity);

    /*
     * @desc 选择性插入实体对象
     * @param [entity]
     * @return int
     */
    int insertSelective(T entity);

    /*
     * @desc 按主键查询实体对象
     * @param [pk]  
     * @return T  
     */
    T selectByPrimaryKey(Integer pk);

    /*
     * @desc 选择性更新实体对象
     * @param [entity]
     * @return int
     */
    int updateByPrimaryKeySelective(T entity);

    /*
     * @desc 更新实体对象
     * @param [entity]
     * @return int
     */
    int updateByPrimaryKey(T entity);

    /*
     * @desc 按条件查询列表
     * @param [condition]  
     * @return java.util.List<T>  
     */
    List<T> listByParams(BaseRequestParam param);
}
