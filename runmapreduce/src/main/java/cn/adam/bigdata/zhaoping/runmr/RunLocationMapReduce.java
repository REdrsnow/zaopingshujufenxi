package cn.adam.bigdata.zhaoping.runmr;

import cn.adam.bigdata.zhaoping.defaultdemo.DefaultRunjob;
import cn.adam.bigdata.zhaoping.locationget.RunJob;
import cn.adam.bigdata.zhaoping.locationget.RunMapReduce;
import cn.adam.bigdata.zhaoping.locationget.work.ReducerDemo;

public class RunLocationMapReduce {

    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "D:\\program\\greensoft\\hadoop-2.7.5");

        DefaultRunjob conf = RunMapReduce.conf();
        conf.addConf(ReducerDemo.LOCATIONFILEPATH, "hdfs:/drsn/rjb/input/lfromlocation.txt");
        conf.setRunClass(RunJob.class);
        conf.runForRemote("D:\\data\\code\\idea\\zaopingshujufenxi" +
                "\\locationget\\target\\locationget-1.0-SNAPSHOT.jar");

        conf.addConf(ReducerDemo.LOCATIONFILEPATH, "hdfs:/drsn/rjb/input/lfromcname.txt");
        conf.addConf(ReducerDemo.LOCATIONDROM, "cname");
        conf.setInputFileName("jafinally.csv");
        conf.runForRemote("D:\\data\\code\\idea\\zaopingshujufenxi" +
                "\\locationget\\target\\locationget-1.0-SNAPSHOT.jar");
//        DefaultRunjob conf = cn.adam.bigdata.zhaoping.handlemr.jar.RunHandleMapReduce.conf();
//        conf.setInputDir("file:/F:/rjb/input/");
//        conf.runForLocal();
    }
}
