package com.sky.service;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @para employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     *分页查询
     * 负责处理业务逻辑 + 封装标准格式的返回结果
     * 它接收 Mapper 层的数据，取出有用的信息（如总数、记录列表）
     * 然后封装成自己系统统一定义的格式
     * 为什么要封装
     * 因为 Page<Employee> 是第三方框架 PageHelper 的对象，暴露出去耦合度高，容易出问题。
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
