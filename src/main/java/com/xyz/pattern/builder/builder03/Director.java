package com.xyz.pattern.builder.builder03;

import java.util.ArrayList;
import java.util.List;

/**
 * @auth: liuyang
 * @date: 2018/9/20 20:53
 * 导演类，指挥各个事件的先后顺序
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型的奔驰车模型，先start，然后stop，其他什么引擎、喇叭一概没有
     */
    public BenzModel getABenzModel() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }

    /**
     * B类型的奔驰车模型，先是发动引擎，然后start，然后stop
     */
    public BenzModel getBBenzModel() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }

    /**
     * C类型的宝马车模型，先按下喇叭，然后启动，然后停止
     */
    public BMWModel getCBMWModel() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }

    /**
     * D类型的宝马车模型只有一个功能，就是跑
     */
    public BMWModel getDBMWModel() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("start");
        // 按照顺序返回一个奔驰车
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }

    /**
     * 这里还可以有很多方法，可以先停止，然后再启动，或者一个停着不动...
     */
}
