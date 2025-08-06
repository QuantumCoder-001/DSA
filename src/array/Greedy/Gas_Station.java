package array.Greedy;
public class Gas_Station {
    public static void main(String[] args) {
        int[] gas = {2, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int res = calculate(gas, cost);
        System.out.println(res);
    }
        public static int calculate(int[] gas, int[] cost){
            int total = 0, tank = 0, start = 0;
            for(int i = 0; i < gas.length; i++){
                int diff = gas[i] - cost[i];
                total += diff;
                tank += diff;
                if(tank < 0){
                    tank = 0;
                    start = i + 1;
                }
        }
        return total > 0? start: -1;
    }
}
