package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/18
 * @description:
 */
public class code014_加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int index = 0;
        while (index < n) {
            int sumGas = 0;
            int sumCost = 0;
            int count = 0;
            while (count < n) {
                int point = (index + count) % n;
                sumGas += gas[point];
                sumCost += cost[point];
                if (sumCost > sumGas) {
                    break;
                }
                count++;
            }
            if (count == n) {
                return index;
            } else {
                index = index + count + 1;
            }
        }
        return -1;
    }
}
