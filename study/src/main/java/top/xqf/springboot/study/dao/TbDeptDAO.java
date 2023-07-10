package top.xqf.springboot.study.dao;

import org.apache.ibatis.annotations.Mapper;
import top.xqf.springboot.study.entity.TbDept;

import java.util.List;

@Mapper
public interface TbDeptDAO {


    List<TbDept> CX(TbDept dept) throws Exception;

    int add(TbDept dept) throws Exception;
}
