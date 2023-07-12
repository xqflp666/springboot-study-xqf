package top.xqf.springboot.study2.dao;

import org.apache.ibatis.annotations.Mapper;
import top.xqf.springboot.study2.entity.TbDept;

import java.util.List;

@Mapper
public interface TbDeptDAO {

    List<TbDept> querAll(TbDept dept) throws Exception;

    int add(TbDept dept) throws Exception;
}
