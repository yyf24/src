package com.secondday;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class linkedLIst_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*
        * LinkedList底层实现了双向列表和双端队列特点
        * 可以添加任何元素可以重复
        * 线程不安全没有实现同步
        * */
        /*
        * LinkedList底层维护一个双向列表
        * LinkedList维护两个属性first和last分别指向首节点和尾节点
        * 每个节点里面有维护了prev，next，item三个属性
        * linkedList的元素添加和删除，不是通过是数组完成的，相对效率高
        * */
        LinkedList linkedList =new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        /*add添加过程
        * 有一个first和last初始都为null
        * 变化指针l
        * 先让l指向last，当前队列最后一个元素
        * 声明新的节点new，传参l，item，null
        * 判断l是否为null，若为null，当前队列没有元素first指向null
        * last指向new
        * */
        System.out.println(linkedList);
        linkedList.remove(2);

        System.out.println(linkedList);
        Iterator iterator =linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        /*remove过程
        *无参删除
        * 首先判断列表书否为null
        * 取出要删除节点的内容
        * next保存first的下一个节点
        * 第一个节点制null'
        * first=next
        * 判断next是否为空
        * next为空则last为null否则next.pre=null
        *
        * 指定index删除
        * 二分查找找到index的位置
        * 进行删除
        */

    }
}
