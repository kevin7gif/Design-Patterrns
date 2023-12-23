package com.kevin.xiehn.responsibility;

/**
 * 小组长类（具体的处理者）
 * @author kevin
 * @version 1.0
 * @date 2023-12-23 23:44
 */
public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假"+leave.getNum() + "天"+leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
