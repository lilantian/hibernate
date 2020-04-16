package com.java.sky;

import com.java.entity.Goods;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Sky
 * @date 2020/04/16
 */
public class TestGoods {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        //创建配置对象
        Configuration configuration = new Configuration().configure();
        //创建会话工厂
        sessionFactory = configuration.buildSessionFactory();
        //开启会话
        session = sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void destroy() {
        //事务提交
        transaction.commit();
        //关闭会话
        session.close();
        //关闭会话工厂
        sessionFactory.close();
    }

    @Test
    public void testGoods() {
        //生成对象
        Goods goods = new Goods();
        goods.setSid(4);
        goods.setName("good4");
        goods.setPrice(14.22);
        //保存对象进数据库
        session.save(goods);
        System.out.println("insert good4...");
        Goods goods1 = session.get(Goods.class, 4);
        System.out.println("id是=4的数据参数：" + goods1.getName());

    }

}
