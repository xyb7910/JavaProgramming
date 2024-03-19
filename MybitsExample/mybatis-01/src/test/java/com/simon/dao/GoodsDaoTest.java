package com.simon.dao;

import com.simon.pojo.Goods;
import com.simon.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class GoodsDaoTest {
    @Test
    public void selectGoodsById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
        Goods goods = goodsDao.getGoodsById(1);
        if (goods != null) {
            System.out.println("goods = " + goods);
        } else {
            System.out.println("goods is null");
        }
        sqlSession.close();
    }
}
