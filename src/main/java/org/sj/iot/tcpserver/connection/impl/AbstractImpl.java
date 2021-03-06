package org.sj.iot.tcpserver.connection.impl;

import org.sj.iot.tcpserver.connection.IServer;
import org.sj.iot.util.Tools;

/**
 * 服务端抽象
 *
 * @author shijian
 * @email shijianws@163.com
 * @date 2017-09-12
 */
public abstract class AbstractImpl implements IServer {
    private String id; // 服务端标识
    private int port = 10000; // 服务器端口
    private boolean ssl = false; // 默认关闭SSL
    private boolean start; // 启动标识
    private boolean stop; // 关闭标识
    private long startTime = Tools.getCurrentTimeMillis(); // 启动时间

    @Override
    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    @Override
    public final int getPort() {
        return port;
    }

    @Override
    public final void setPort(int port) {
        this.port = port;
    }

    @Override
    public final boolean isSsl() {
        return ssl;
    }

    @Override
    public final void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public final boolean isStart() {
        return start;
    }

    protected final void setStart(boolean start) {
        this.start = start;
    }

    @Override
    public final boolean isStop() {
        return stop;
    }

    protected final void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public final long getStartTime() {
        return startTime;
    }
}
