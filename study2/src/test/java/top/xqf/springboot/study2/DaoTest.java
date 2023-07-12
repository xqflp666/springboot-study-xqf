package top.xqf.springboot.study2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xqf.springboot.study2.dao.TbDeptDAO;
import top.xqf.springboot.study2.entity.TbDept;

import java.util.List;
import java.util.Random;

@SpringBootTest
public class DaoTest {
    private static Logger logger= LoggerFactory.getLogger(DaoTest.class);

    //生成随机数
    private static Random random=new Random();
    @Autowired
    private TbDeptDAO tbDeptDAO;


    @Test
    public void one() throws Exception{
        List<TbDept> list = tbDeptDAO.querAll(new TbDept());
        for (TbDept dept:list) {
            logger.debug("{}",dept);
        }
    }

    @Test
    public void two() throws Exception{
     TbDept dept = new TbDept();
     dept.setDeptName("部门"+random.nextInt(10000));
     dept.setDeptInfo("部门描述");
     int result=tbDeptDAO.add(dept);
     logger.debug("{},{}",result,dept);
    }

}
