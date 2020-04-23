package com.lichun.thread.threadgroup;

public class ThreadGroupTest {
    public static void main(String[] args) {
        //获取当前的线程组
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group1 = new ThreadGroup("Group1");
        //线程组默认与创建它的线程所在的ThreadGroup一致
        System.out.println(group1.getParent() == currentGroup);
        //定义group2,指定group1是其父group
        ThreadGroup group2 = new ThreadGroup(group1, "Group2");
        System.out.println(group2.getParent() == group1);

        currentGroup.list();
    }
}
