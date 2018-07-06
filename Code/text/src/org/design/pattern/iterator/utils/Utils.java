package org.design.pattern.iterator.utils;

import org.design.pattern.iterator.bean.MenuItem;
import org.design.pattern.iterator.impl.BreakfastMenu;

public class Utils {

    public static void initMenuItem(BreakfastMenu menu) {
        addNewMenuItem(menu, new MenuItem("ºº±¤", 18.0));
        addNewMenuItem(menu, new MenuItem("¼¦³á", 12.0));
        addNewMenuItem(menu, new MenuItem("Èâ°ü", 1.5));
        addNewMenuItem(menu, new MenuItem("ôÕ×Ó", 2.0));
    }
    
    private static void addNewMenuItem(BreakfastMenu menu, MenuItem menuItem) {
        menu.addNewMenuItem(menuItem);
    }
}