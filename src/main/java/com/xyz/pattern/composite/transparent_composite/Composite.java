package com.xyz.pattern.composite.transparent_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author 非
 * @create 2018-11-10 13:33
 */
public class Composite extends Component {
    private List<Component> componentList = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void delete(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return this.componentList;
    }
}
