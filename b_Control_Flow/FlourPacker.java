package b_Control_Flow;
// ques: Write a method to check whether we can achieve our goal with the given number of bags.
// It is okay even if there are additional bags left over and if sum is greater than goal, ensure that 
// only full bags are used towards the goal amount.
    // big flour bags: 5kgs 
    // small flour bags: 1 kg
    // goal: amount of kilos of flour needed to assemble a package.

public class FlourPacker {
    public static boolean canPack(int bigcount, int smallCount, int goal){
        if(bigcount<0 || smallCount<0 || goal<0)
            return false;
        else{
            int totalweight=(bigcount*5)+(smallCount*1);
            if(totalweight<goal)
                return false;
            else if(totalweight==goal)
                return true;
            else 
            {
                int x=goal/5;
                // if we have excess of big bags
                if(x<=bigcount)
                {
                    if((goal-(x*5))<=smallCount)
                        return true;
                    else
                        return false;
                }
                // if we have less big bags
                else
                {
                    if(goal-(bigcount*5)<=smallCount)
                        return true;
                    else
                        return false;
                }    
            }
        }
    }
    public static void main(String args[]){
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(0, 5, 5));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(2, 10, 18));
    }
}
