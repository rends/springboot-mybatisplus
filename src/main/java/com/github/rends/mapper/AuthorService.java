package com.github.rends.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.rends.entity.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * 需要实现BaseMapper 后使用mybatisPlus封装的方法
 */
public interface AuthorService extends BaseMapper<Author> {

    // 自定义的注解sql,还可支持 @Insert @Update @Delete
    @Select("select * from t_author where status=1 and name=#{name}")
    public Author findByName(String name);
}
