package top.xqf.springboot.study2.service;

import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.entity.TbDept;

import java.util.List;

public interface DeptService {
    /**
     * 查询部门列表
     * @param dept 部门参数
     * @return 部门列表
     * @throws Exception 处理发生异常
     */
    BaseResult<List<TbDept>> query(TbDept dept) throws Exception;

    /**
     * 添加部门列表
     * @param dept 部门参数
     * @return 部门列表
     * @throws Exception 处理发生异常
     */
    BaseResult<TbDept> add(TbDept dept) throws Exception;
}
