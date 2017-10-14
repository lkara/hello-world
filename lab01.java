public class lab01 {
    /*
1: function Exercise1(v)
2: a ← 0; b ← 0
3: for i ≤ 0 < length(v) do
4: if v[i] > b then
5: if v[i] > a then
6: b ← a
7: a ← v[i]
8: else
9: b ← v[i]
10: end if
11: end if
12: end for
13: return b
14: end function

{5,2,0,3,8}
{1,9,7,8,1,2,2,5})
     */

    public static void main(String [] args){
        int a = 0;
        int b = 0;
        int [] v = {3,3,4,6,8,1,0,1};

        for(int i = 0; i < v.length; i++){
            if(v[i] > b){
                if(v[i] > a){
                    b = a;
                    a = v[i];
                } else {
                    b = v[i];
                }
            }
        }

        System.out.println(b);

    }

}
