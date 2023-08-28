package com.thirdday;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        /*HashSet添加元素
        *添加元素值时，先得到Hash值，会转化成索引值
        * 找到存储数据表，看这个索引是否存储元素
        * 若没有直接加入
        * 如果有调用equals（由程序员重写的equal决定）比较，如果相同放弃添加，如果不同添加到最后
        * 在java8中如果一个链条元素个数大于等于8，并且table的大小大于64就会进行树化(红黑树)
        * 两次进行扩容，1.达到临界值（table.lengh*0.75）(总的节点数) 2.table表的某一条链的长度大于等于8并且长度小于64时进行扩容
        */
        HashSet hashSet =new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        /*
        * 先执行Hashset构造器
        * 执行add函数 传参字符串常量”java“
        * 执行put方法 key==”java“，PRESENT=占位符不会变化，共享
        * 得到key对应的hash值 key.hashcode()^(key.hashcode()>>>16)
        * */


        /*
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        扩容，大于临界值就会进行扩容
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
    */

    }
}
