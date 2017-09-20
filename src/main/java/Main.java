import com.ys.mvc.mapper.UsersMapper;
import com.ys.mvc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yunshan on 17/9/13.
 */
public class Main {

    public static void main(String[] args) throws IOException {


        String resource = "mybatisConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        User o = session.selectOne("namespace.findUserById", 1);

        UsersMapper userMapper = session.getMapper(UsersMapper.class);

        userMapper.get();
    }
}
