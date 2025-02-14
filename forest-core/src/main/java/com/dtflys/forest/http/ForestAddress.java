/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Jun Gong
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.dtflys.forest.http;

import com.dtflys.forest.utils.StringUtils;
import com.dtflys.forest.utils.URLUtils;

/**
 * Forest主机地址信息
 * <p>该地址信息为主机名/域名/ip地址 + 端口号的组合
 */
public class ForestAddress {

    /**
     * HTTP协议头
     */
    private final String scheme;

    /**
     * 主机地址(主机名/ip地址)
     */
    private final String host;

    /**
     * 主机端口号
     */
    private final int port;

    /**
     * URL根路径
     */
    private final String basePath;

    /**
     * 实例化Forest主机地址信息
     *
     * @param scheme HTTP协议头
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号，如果为 -1， 代表未设置端口号
     * @param basePath URL根路径
     */
    public ForestAddress(String scheme, String host, int port, String basePath) {
        this.scheme = scheme;
        this.host = host;
        this.port = port;
        this.basePath = basePath;
    }

    /**
     * 实例化Forest主机地址信息
     *
     * @param scheme HTTP协议头
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号，如果为 -1， 代表未设置端口号
     * @param basePath URL根路径
     */
    public ForestAddress(String scheme, String host, Integer port, String basePath) {
        this(scheme, host, port == null ? -1 : port, basePath);
    }

    /**
     * 实例化Forest主机地址信息
     *
     * @param scheme HTTP协议头
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号，如果为 -1， 代表未设置端口号
     */
    public ForestAddress(String scheme, String host, int port) {
        this(scheme, host, port, null);
    }


    /**
     * 实例化Forest主机地址信息
     *
     * @param scheme HTTP协议头
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号
     */
    public ForestAddress(String scheme, String host, Integer port) {
        this(scheme, host, port == null ? -1 : port);
    }

    /**
     * 实例化Forest主机地址信息
     * <p>HTTP协议头默认为 http
     *
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号，如果为 -1， 代表未设置端口号
     */
    public ForestAddress(String host, int port) {
        this(null, host, port);
    }

    /**
     * 实例化Forest主机地址信息
     * <p>HTTP协议头默认为 http
     *
     * @param host 主机地址(主机名/ip地址)
     * @param port 主机端口号
     */
    public ForestAddress(String host, Integer port) {
        this(null, host, port);
    }


    /**
     * 获取HTTP协议头
     * @return HTTP协议头字符串
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * 获取主机地址
     * <p>可以为主机名或IP地址
     *
     * @return 主机地址
     */
    public String getHost() {
        return host;
    }

    /**
     * 获取主机地址(主机名/ip地址)
     *
     * @return 主机端口号
     */
    public int getPort() {
        return port;
    }

    /**
     * 获取URL根路径
     *
     * @return URL根路径
     */
    public String getBasePath() {
        return basePath;
    }

}
