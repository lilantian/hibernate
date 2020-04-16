package com.java.sky;

import com.java.entity.Goods;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Sky
 * @date 2020/04/16
 */
public class HIbernateTest {

    public static void main(String[] args) {
        //创建配置对象
        Configuration configuration = new Configuration().configure();
        //创建会话工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //开启会话
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();

//        INSERT
        //生成对象
        Goods goods = new Goods();
        goods.setSid(2);
        goods.setName("good2");
        goods.setPrice(12.22);
        //保存对象进数据库
        session.save(goods);
        System.out.println("Complete the submission");

//        UPDATE
        //根据id查询一条记录
        Goods goods1 = session.get(Goods.class, 2);
        System.out.println("id是=2的数据参数：" + goods1.getName());
        //修改参数
        goods1.setPrice(22.22);
        //更新
        session.update(goods1);
        System.out.println("update complete");

//        DELETE
        //根据id查询一条记录
        Goods goods2 = session.get(Goods.class, 2);
        System.out.println("id是=2的数据参数：" + goods2.getName());
        session.delete(goods2);
        System.out.println("Complete deletion");

        //事务提交
        transaction.commit();
        //关闭会话
        session.close();
        //关闭会话工厂
        sessionFactory.close();
    }

}
