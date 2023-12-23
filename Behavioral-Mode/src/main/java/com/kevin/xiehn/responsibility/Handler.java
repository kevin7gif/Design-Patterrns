package com.kevin.xiehn.responsibility;

/**
 * 抽象处理者类
 * @author kevin
 * @version 1.0
 * @date 2023-12-22 17:42
 */
public abstract class Handler {

    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;

    // 该领导处理的请求天数区间
    private int numStart;
    private int numEnd;

    // 声明后续者（上级领导）
    private Handler nextHandler;

    // 设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各级领导处理请求的方法
    protected abstract void handleLeave(LeaveRequest leave);

    // 提交请假条
    public final void submitLeave(LeaveRequest leave)  {
        // 判断是否符合处理条件
        if (leave.getNum() >= numStart && leave.getNum() <= numEnd) {
            // 处理请假条
            handleLeave(leave);
            System.out.println("流程结束");
        } else {
            // 未符合处理条件，向上级领导提交
            if (nextHandler!= null && leave.getNum()>this.numEnd) {
                nextHandler.submitLeave(leave);
            }
        }
    }

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

}
