package com.xyz.pattern.composite.transparent_composite;

import java.util.List;

/**
 * description: 树枝构件
 *
 * @author 非
 * @create 2018-11-10 13:35
 */
public class Leaf extends Component {
    @Override
    public void add(Component component) {
        // 空实现，直接抛一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Component component) {
        // 空实现，直接抛一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getChildren() {
        // 空实现，直接抛一个“不支持请求”异常
        throw new UnsupportedOperationException();
    }
}
