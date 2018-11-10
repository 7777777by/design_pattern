package com.xyz.pattern.composite.composite01;

import java.util.List;

/**
 * description: 场景类，遍历所有的节点
 *
 * @author 非
 * @create 2018-11-06 19:11
 */
public class Client {
    public static void main(String[] args) {
        // 首先生成一个根节点
        IRoot root = new ConcreteRoot("王大麻子", "总经理", 100000);
        // 产生三个部门经理，也就是树枝节点
        IBranch developDep = new ConcreteBranch("李大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new ConcreteBranch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new ConcreteBranch("赵三驼子", "财务部门经理", 30000);
        // 再把三个小组长产生出来
        IBranch firstDevGroup = new ConcreteBranch("杨三愣子", "开发一组组长", 5000);
        IBranch secondDevGroup = new ConcreteBranch("吴大棒槌", "开发二组组长", 6000);
        IBranch thirdDevGroup = new ConcreteBranch("张老憨子", "开发三组组长", 7000);
        // 剩下的是小兵
        ILeaf a = new ConcreteLeaf("a", "开发人员", 2000);
        ILeaf b = new ConcreteLeaf("b", "开发人员", 2000);
        ILeaf c = new ConcreteLeaf("c", "开发人员", 2000);
        ILeaf d = new ConcreteLeaf("d", "开发人员", 2000);
        ILeaf e = new ConcreteLeaf("e", "开发人员", 2000);
        ILeaf f = new ConcreteLeaf("f", "销售人员", 3000);
        ILeaf g = new ConcreteLeaf("g", "销售人员", 3500);
        ILeaf h = new ConcreteLeaf("h", "销售人员", 4000);
        ILeaf i = new ConcreteLeaf("i", "财务人员", 5000);
        ILeaf j = new ConcreteLeaf("j", "财务人员", 5000);
        ILeaf k = new ConcreteLeaf("k", "CEO秘书", 8000);
        ILeaf zll = new ConcreteLeaf("郑老六", "研发部副总", 20000);
        // 总经理下有三个部门经理
        root.add(developDep);
        root.add(salesDep);
        root.add(financeDep);
        // 总经理下还有个秘书
        root.add(k);
        // 定义研发部门下的结构
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(thirdDevGroup);
        // 研发部经理下还有一个副总
        developDep.add(zll);
        // 开发小组添加员工
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        secondDevGroup.add(c);
        secondDevGroup.add(d);
        thirdDevGroup.add(e);
        // 销售部下的人员情况
        salesDep.add(f);
        salesDep.add(g);
        salesDep.add(h);
        // 财务部人员情况
        financeDep.add(i);
        financeDep.add(j);
        // 打印写完的树状结构
        System.out.println(root.getInfo());
        // 打印出来整个树形
        getAllSubordinateInfo(root.getSubordinateInfo());
    }

    // 遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(List subordinateList) {
        int length = subordinateList.size();
        // 定义一个List长度，不要在for循环中每次计算
        for (int i = 0; i < length; i++) {
            Object s = subordinateList.get(i);
            if (s instanceof ILeaf) {
                // 是个叶子节点，就是员工
                ILeaf employee = (ILeaf) s;
                System.out.println(employee.getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                // 再递归调用
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
