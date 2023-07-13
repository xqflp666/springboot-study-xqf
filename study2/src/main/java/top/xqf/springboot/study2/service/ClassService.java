package top.xqf.springboot.study2.service;

import org.springframework.stereotype.Service;
import top.xqf.springboot.study2.base.BaseResult;
import top.xqf.springboot.study2.entity.TbClass;

import java.util.List;


public interface ClassService {
    /**
     * 查询班级列表
     * @param tbClass 班级参数
     * @return 班级列表
     * @throws Exception 处理发生异常
     */
    BaseResult<List<TbClass>> query(TbClass tbClass) throws Exception;

    /**
     * 增加班级列表
     * @param tbClass 班级参数
     * @return 班级列表
     * @throws Exception 处理发生异常
     */

    BaseResult<TbClass> add(TbClass tbClass) throws Exception;
}
