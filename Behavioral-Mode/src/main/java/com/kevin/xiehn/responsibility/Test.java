package com.kevin.xiehn.responsibility;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-23 23:52
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest request=new LeaveRequest("kevin", 1, "测试申请请假条");

        // 创建各级领导对象
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交请假申请
        groupLeader.submitLeave(request);
    }
}
