//package com.mybatis;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.mybatis.dao.UserDao;
//import com.mybatis.entity.UserEntity;
//import com.mybatis.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.sql.Wrapper;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootTest
//class MybatisApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//    @Autowired
//    private UserDao userMapper;
//
//    @Autowired
//    private UserService userService;
//
//    /**
//     * 测试UserService
//     */
//    @Test
//    public void testService(){
//        System.out.println(("----- 开始测试 Service 插入数据 ------"));
//        UserEntity user = UserEntity.builder()
//                .name("aibinru")
//                .age(30)
//                .gender(1)
//                .build();
//        userService.save(user);
//        System.out.println(("----- 开始 插入数据 ------"));
//
//    }
//
//    /**
//     * 测试Wrapper
//     */
//    @Test
//    public void testWrapper() {
//        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
//// 仅查询 id, name 字段
//        queryWrapper.select("id", "name");
//// where id = 1
//        queryWrapper.eq("age", 30);
//// 实际执行 SQL : SELECT id,name,age,gender FROM user WHERE (id = 1)
//        UserEntity user = userMapper.selectOne(queryWrapper);
//    }
//
//    /**
//     * 批量插入
//     */
//    @Test
//    public void testBatchInsert(){
//        List<UserEntity> userList = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            UserEntity user = UserEntity.builder()
//                    .name("aibinru")
//                    .age(30)
//                    .gender(1)
//                    .build();
//            userList.add(user);
//        }
//        userService.saveBatch(userList);
//        //Wrapper wrapper =
//        System.out.println("批量插入成功");
//    }
//
//    /**
//     * 查询数据
//     */
//    @Test
//    public void testSelectUser() {
//        System.out.println(("----- 开始测试 mybatis-plus 查询数据 ------"));
//        //  selectList() 方法的参数为 mybatis-plus 内置的条件封装器 Wrapper，这里不填写表示无任何条件，全量查询
//        List<UserEntity> userList = userMapper.selectList(null);
//
//        userList.forEach(System.out::println);
//    }
//
//    /**
//     * 新增一条数据
//     */
//    @Test
//    public void testInsertUser() {
//        System.out.println(("----- 开始测试 mybatis-plus 插入数据 ------"));
//        UserEntity user = UserEntity.builder()
//                .name("犬小哈教程 www.quanxiaoha.com")
//                .age(30)
//                .gender(1)
//                .build();
//
//        userMapper.insert(user);
//    }
//
//    /**
//     * 删除数据
//     */
//    @Test
//    public void testDeleteUser() {
//        System.out.println(("----- 开始测试 mybatis-plus 删除数据 ------"));
//        // 根据主键删除记录
//        userMapper.deleteById(1);
//
//        // 根据主键批量删除记录
//        userMapper.deleteBatchIds(Arrays.asList(1, 2));
//    }
//
//    /**
//     * 更新数据
//     */
//    @Test
//    public void testUpdateUser() {
//        System.out.println(("----- 开始测试 mybatis-plus 更新数据 ------"));
//        UserEntity user = UserEntity.builder()
//                .id(1L)
//                .name("犬小哈教程 www.quanxiaoha.com")
//                .build();
//
//        userMapper.updateById(user);
//    }
//
//}
