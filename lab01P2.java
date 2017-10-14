public class lab01P2 {
    /*
1: function Exercise2(v)
2: for 0 < i < length(v) do
3: current ← v[i]
4: j ← i - 1
5: while j ≥ 0 do
6: if v[j] ≤ current then
7: break
8: end if
9: v[j+1] ← v[j]
10: j ← j - 1
11: end while
12: v[j+1] ← current
13: end for
14: return v
15: end function

{5,2,0,3,8}
     */
    public static void main(String [] args) {
        int [] v = {5,3,9,6,1};
        int current;

        for(int i = 1; i < v.length; i++){
            current = v[i];
            int j = i - 1;
            while(j >= 0){
                if(v[j] <= current){
                    break;
                }

                v[j+1] = v[j];
                j = j - 1;
            }
            v[j+1] = current;
        }

        for(int k = 0; k < v.length; k++) {
            System.out.println(v[k]);
        }


    }




}
