package top.xqf.springboot.study2.dao;

import org.apache.ibatis.annotations.Mapper;
import top.xqf.springboot.study2.entity.TbClass;
import top.xqf.springboot.study2.entity.TbDept;

import java.util.List;

@Mapper
public interface TbClassDAO {
    List<TbClass> queryAll(TbClass tbClass) throws Exception;

    int add(TbClass tbClass) throws Exception;

    int delete(TbClass tbClass) throws Exception;
}
