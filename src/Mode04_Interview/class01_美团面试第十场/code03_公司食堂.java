package Mode04_Interview.class01_美团面试第十场;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code03_公司食堂 {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));//输入
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));//输出

        int t = Integer.parseInt(read.readLine());//数据组数

        for (int i = 0; i < t; i++) {//处理当前组的数据

            //1.数据的输入
            int n = Integer.parseInt(read.readLine());//总参桌数
            String table = read.readLine(); //当前餐桌的占用情况
            int m = Integer.parseInt(read.readLine());//当前排队的人数
            String sex = read.readLine();//当前排队的性别

            //2.获取当前组的就餐方案
            int[] res = getRes(table, sex);

            //3.输出方案
            for (int r : res) {
                write.write(Integer.toString(r));
                write.newLine();//换行
            }
        }
        write.flush();
    }

    /*
     * 获取当前组的就餐方式
     *
     * table：当前餐桌的占用情况
     * sex： 当前排队的性别
     * */
    private static int[] getRes(String table, String sex) {
        List<PriorityQueue<Integer>> Q = new ArrayList<PriorityQueue<Integer>>();//列表Q中的元素类型是队列。
        //1.列表Q中包含三个优先队列，分别按从左到右的顺序，对应当前餐桌的占用情况：0，1，2
        Q.add(new PriorityQueue<Integer>());
        Q.add(new PriorityQueue<Integer>());
        Q.add(new PriorityQueue<Integer>());

        //2.根据当前的占用情况，分别将占用人数为0，1，2的餐桌号放到优先队列0，1，2中
        for (int i = 0; i < table.length(); i++) {
            Q.get(table.charAt(i) - '0').add(i);//即餐桌i当前有table.charAt(i)人，其编号为i
        }

        //3.遍历排队队列，根据性别分配餐桌
        int[] res = new int[sex.length()];//存放分配方案
        for (int i = 0; i < sex.length(); i++) {
            int tnum;//存放排队队列中i所分配的餐桌编号

            if (sex.charAt(i) == 'M') {//3.1 男
                //3.1.1 查找1个人的餐桌
                if (!Q.get(1).isEmpty()) {//存在一个人的餐桌。分配后此餐桌有2人，将其放到队列2中
                    tnum = Q.get(1).poll();//最左边一个人的餐桌号
                    Q.get(2).add(tnum);
                } else {//3.1.2 不存在一个人的餐桌，则将其分配到空桌。分配后，此餐桌有1人，将其放到队列1中
                    tnum = Q.get(0).poll();
                    Q.get(1).add(tnum);
                }
            } else {//3.2女
                //3.2.1 查找空桌
                if (!Q.get(0).isEmpty()) {//存在空桌
                    tnum = Q.get(0).poll();
                    Q.get(1).add(tnum);
                } else {//不存在空桌
                    tnum = Q.get(1).poll();
                    Q.get(2).add(tnum);
                }

            }

            //3.3 将当前的分配结果放到res。编号从1开始
            res[i] = tnum + 1;
        }//for
        return res;
    }
}
