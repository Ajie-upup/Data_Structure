package Mode03_BlueBridgeCup.must;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code03_七段码 {
    static int[] father = new int[8];
    static int[][] light = new int[8][8];//连通
    static boolean[] islight = new boolean[8];//亮灯
    static int acount;//计数

    public static void main(String[] args) {
        //a b c d e f g
        //1 2 3 4 5 6 7
        //连边建图，light[i][j] == 1表示第i段和第j段灯管相邻
        //a-b a-f
        light[1][2] = light[1][6] = 1;
        //b-a b-g b-c
        light[2][1] = light[2][3] = light[2][7] = 1;
        //c-g c-d c-b
        light[3][4] = light[3][7] = light[3][2] = 1;
        //d-e d-c
        light[4][5] = light[4][3] = 1;
        //e-g e-f e-d
        light[5][6] = light[5][7] = light[5][4] = 1;
        //f-g f-e f-a
        light[6][7] = light[6][5] = light[6][1] = 1;
        dfs(1);
        System.out.println(acount);
    }

    private static void dfs(int startIndex) {
        //出口
        if (startIndex == 8) {
            //初始化每一个父节点
            for (int i = 1; i < 8; i++) {
                father[i] = i;
            }
            //判断是否在同一个集合
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 7; j++) {
                    // 如果当前两盏相互连接的灯处于打开的状态则放在一个集合里
                    if (islight[i] && islight[j] && light[i][j] == 1) {
                        union(i, j);//合并
                    }
                }
            }
            int ans = 0;//记录“植物数”  通俗易懂
            //寻找“植物”
            for (int i = 1; i < 8; i++) {
                if (father[i] == i && islight[i]) {
                    ans++;
                }
            }
            //当有且仅有一种联通亮灯情况的时候才合法，这个时候才算数 避免没有连通算进去
            if (ans == 1) acount++;
            return;
        }
        //下一个灯
        islight[startIndex] = true;//打开i这个灯，继续开关下一个灯
        dfs(startIndex + 1);
        islight[startIndex] = false;//关闭i这个灯，继续开关下一个灯
        dfs(startIndex + 1);
    }

    //合并  // TODO: 2022/4/6 合并模板
    private static void union(int a, int b) {
        a = findFather(a);
        b = findFather(b);
        if (a != b)
            father[b] = a;
    }

    //找父节点  // TODO: 2022/4/6 找父节点模板
    private static int findFather(int a) {
        if (a == father[a]) return a;
        father[a] = findFather(father[a]);
        return father[a];
    }
}

