package com.xyz.pattern.composite.common_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 树枝构件
 *
 * @author 非
 * @create 2018-11-10 13:11
 */
public class Composite extends Component {
    // 构件容器
    private List<Component> componentList = new ArrayList<Component>();

    // 增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.componentList.add(component);
    }

    // 删除一个叶子构件或树枝构件
    public void delete(Component component) {
        this.componentList.remove(component);
    }

    // 获得分之下的所有叶子构件和树枝构件
    public List<Component> getChildren() {
        return this.componentList;
    }
}
