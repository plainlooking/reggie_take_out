package cmo.luo.mybatis.test;

import com.luo.mybatis.mapper.EmpMapper;
import com.luo.mybatis.pojo.Emp;
import com.luo.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMBG {
    @Test
    public void MBGTest(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //查询所有数据
           /* List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));*/

            //根据条件查询
           /* EmpExample empExample = new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
            empExample.or().andDidIsNotNull();
            List<Emp> emps = mapper.selectByExample(empExample);
            emps.forEach(emp -> System.out.println(emp));*/

            //普通修改，会把里面eid1里的数据全部修改
           /* mapper.updateByPrimaryKey(new Emp(1,"admin",20,null,"123@163.com",3));*/

            //选择性修改，里面有的数据，修改时设置为null不修改
            mapper.updateByPrimaryKeySelective(new Emp(1,"admin",20,null,"123@163.com",3));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
