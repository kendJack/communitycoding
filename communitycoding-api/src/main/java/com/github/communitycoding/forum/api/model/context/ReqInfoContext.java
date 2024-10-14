package com.github.communitycoding.forum.api.model.context;

import com.alibaba.ttl.TransmittableThreadLocal;
import lombok.Data;

import java.security.Principal;

/**
 * 请求上下文，携带用户身份相关信息
 *
 * @author kendrick
 * @date 2024/10/14
 */
public class ReqInfoContext {
    private static TransmittableThreadLocal<ReqInfo> context = new TransmittableThreadLocal<ReqInfo>();

    @Data
    public static class ReqInfo implements Principal {

        /**
         * appKey
         */
        private String appKey;

        /**
         * 访问的域名
         */
        private String host;

        /**
         * 访问的路径
         */
        private String path;

        /**
         * 客户端ip
         */
        private String clientIp;

        /**
         * referer
         */
        private String referer;

        /**
         * 表单参数
         */
        private String payload;


        private String userAgent;


        private String session;


        private Long userId;


        private Integer msgNum;

        private String deviceId;


        @Override
        public String getName() {
            return session;
        }
    }
}
