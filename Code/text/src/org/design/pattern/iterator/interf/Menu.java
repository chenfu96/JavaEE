package org.design.pattern.iterator.interf;

import java.util.Iterator;

import org.design.pattern.iterator.bean.MenuItem;

/**
 * <p>
 * �˵���ͨ�ýӿ�
 * </p>
 * 2016��3��4��
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public interface Menu {

    public Iterator<MenuItem> createIterator();
}