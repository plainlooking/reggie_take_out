import com.luo.mybatis.mapper.CacheMapper;
import com.luo.mybatis.pojo.Emp;
import com.luo.mybatis.utils.SqlSessionUtils1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestCacheMapper {
    @Test
    public void testEmpByEid(){
        SqlSession sqlSession = SqlSessionUtils1.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.EmpByEid(2);
        System.out.println(emp);
        sqlSession.clearCache(); //同一个SqlSession两次查询期间手动清空了缓存
//
//        //同一个SqlSession两次查询期间执行了任何一次增删改操作
//        int i = mapper.EmpByEid2(new Emp(null , "余斌", 20, "男", "123@163.com"));
//        System.out.println(i);

        Emp emp1 = mapper.EmpByEid(2);
        System.out.println(emp1);
    }

    @Test
    public void TestTowCache(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.EmpByEid(1));
            sqlSession1.close();

            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.EmpByEid(1));
            sqlSession1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
