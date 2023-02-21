package cmo.luo.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luo.mybatis.mapper.EmpMapper;
import com.luo.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {
    /**
     * - 在查询功能之前使用`PageHelper.startPage(int pageNum, int pageSize)`开启分页功能
     * index:当前页的起始索引
     *  pageNum：当前页的页码
     *  pageSize：每页显示的条数
     *  PageInfo<Emp> page = new PageInfo<>(emps, 5);
     *  emp表示分页数据
     *  5表示当前分页数量
     */
    @Test
    public void testPageHelper(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            /*Page<Object> objects = PageHelper.startPage(1, 4);*/
            PageHelper.startPage(2, 4);
            List<Emp> emps = mapper.selectByExample(null);
            PageInfo<Emp> page = new PageInfo<>(emps, 5);
            /* emps.forEach(emp -> System.out.println(emp  ));*/
            System.out.println(page);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
