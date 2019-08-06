package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author XuKaiKai
 * @date 2019/8/6 19:44
 */

@AllArgsConstructor  //全参构造方法
@NoArgsConstructor  //空参构造方法
@Data              //get/set方法
@Accessors(chain = true)  //链式调用
public class Dept  implements Serializable {  //必须序列化       Dept(Entity) orm  ---> Dept(table) 类表关系映射

    private Long deptno;   //主键
    private String dname;   //部门名称
    private String db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("das").setDb_source("db01"); //链式调用
    }


}
