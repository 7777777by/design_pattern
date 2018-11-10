package com.xyz.pattern.composite.composite02;

import java.util.List;

/**
 * description: 场景类
 *
 * @author 非
 * @create 2018-11-10 12:42
 */
public class Client {
    public static void main(String[] args) {
        // 首先组装一个组织结构出来
        IBranch ceo = compositeCorpTree();
        // 首先把CEO的信息打印出来
        System.out.println(ceo.getInfo());
        // 然后是所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    // 把整个树组装出来
    private static IBranch compositeCorpTree() {
        // 首先生成一个根节点
        IBranch root = new Branch("王大麻子", "总经理", 100000);
        // 产生三个部门经理，也就是树枝节点
        IBranch developDep = new Branch("李大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        // 再把三个小组长产生出来
        IBranch firstDevGroup = new Branch("杨三愣子", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        IBranch thirdDevGroup = new Branch("张老憨子", "开发三组组长", 7000);
        // 剩下的是小兵
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "销售人员", 3000);
        ILeaf g = new Leaf("g", "销售人员", 3500);
        ILeaf h = new Leaf("h", "销售人员", 4000);
        ILeaf i = new Leaf("i", "财务人员", 5000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zll = new Leaf("郑老六", "研发部副总", 20000);
        // 总经理下有三个部门经理
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        // 总经理下还有个秘书
        root.addSubordinate(k);
        // 定义研发部门下的结构
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(thirdDevGroup);
        // 研发部经理下还有一个副总
        developDep.addSubordinate(zll);
        // 开发小组添加员工
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        secondDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        thirdDevGroup.addSubordinate(e);
        // 销售部下的人员情况
        salesDep.addSubordinate(f);
        salesDep.addSubordinate(g);
        salesDep.addSubordinate(h);
        // 财务部人员情况
        financeDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        return root;
    }

    // 遍历整棵树，只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(IBranch branch) {
        List<ICorp> corpList = branch.getSubordinate();
        StringBuffer info = new StringBuffer("");
        for (ICorp corp : corpList) {
            if (corp instanceof Leaf) {
                info.append(corp.getInfo()).append("\n");
            } else {
                info.append(corp.getInfo()).append("\n").append(getTreeInfo((IBranch) corp));
            }
        }
        return info.toString();
    }
}
