package com.zy.dao;

import com.zy.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DepartmentDao {
//    /模拟数据库
private static Map<Integer, Department> departments=null;
static {
    departments=new HashMap<Integer, Department>();//创建部门表
    departments.put(101,new Department(101,"a1"));
    departments.put(101,new Department(102,"a2"));
    departments.put(101,new Department(103,"a3"));
    departments.put(101,new Department(104,"a4"));
    departments.put(101,new Department(105,"a5"));
}
//获得所有部门信息
    public Collection<Department> getDepartments(){
    return departments.values();
    }



}
