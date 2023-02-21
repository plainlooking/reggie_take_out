package com.luo.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountlistener implements HttpSessionListener {
    //创建session监听
    public void sessionCreated(HttpSessionEvent se) {

        ServletContext ctx = se.getSession().getServletContext();
        Integer onlineCount =(Integer) ctx.getAttribute("OnlineCount");
        if (onlineCount==null){
            onlineCount=new Integer(1);
        }else {
            int count = onlineCount.intValue();
            onlineCount=new Integer(count+1);
        }
        ctx.setAttribute("OnlineCount",onlineCount);
    }
    //销毁监听
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext ctx = se.getSession().getServletContext();

        Integer onlineCount =(Integer) ctx.getAttribute("OnlineCount");
        if (onlineCount==null){
            onlineCount=new Integer(1);
        }else {
            int count = onlineCount.intValue();
            onlineCount=new Integer(count+1);
        }
        ctx.setAttribute("OnlineCount",onlineCount);

    }
}
/**
 * session销毁：
 * 手动销毁:se.getSession().invalidate();
 * 自动销毁:web里添加的session的时间过期
 * <session-config>
 *         <session-timeout>1</session-timeout>
 *     </session-config>
 */

