public class LongestCollatzSequence
{
    public static long collatzChainLength(long n)
    {
        long length = 1;

        while(n != 1)
        {
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            length++;
        }

        return length;
    }

    public static long getLongestCollatzSequence(long limit)
    {
        long startingNumber = 1;
        long longestChainLength = 0;

        for(int i = 1; i < limit; i++)
        {
            long chainLength = collatzChainLength(i);
            if(chainLength > longestChainLength)
            {
                longestChainLength = chainLength;
                startingNumber = i;
            }

        }

        return startingNumber;
    }

    public static void main(String[] args)
    {
        System.out.println(getLongestCollatzSequence(1000000));
    }
}
