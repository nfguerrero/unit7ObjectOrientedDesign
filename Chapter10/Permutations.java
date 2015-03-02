public class Permutations
{
   public static boolean arePermutations(int[] perm1, int[] perm2)
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
   
   public static void main(String[] args)
   {
       Permutations test = new Permutations();
       int[] perm1 = {1, 2, 3, 4, 5};
       int[] perm2 = {5, 1, 4, 2, 3};
       
       System.out.print(test.arePermutations(perm1, perm2));
   }
}