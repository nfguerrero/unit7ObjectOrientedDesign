1. public static String flip()
   {
       String[] sides = {"tails", "heads", "tails"};
       
       return sides[Math.random()*3]
   }
   
2. public static boolean arePermutations(int[] perm1, int[] perm2)
   {
       boolean perm = true;;
       boolean[] lock = new boolean[perm1.length];
       
       for (int i = 0; i < perm2.length; i++)
       {
           lock[i] = false;
           for (int j = 0; j < perm1.length; j++)
           {
               if (perm2[i] == perm1[j])
               {
                   lock[i] = true;
               }
           }
       }
       
       for (int i = 0; i < lock.length; i++)
       {
           if (!lock[i])
           {
               perm = false;
           }
       }
       
       return perm;
   }
   
3. 0, 1