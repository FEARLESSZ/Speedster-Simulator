public class Data 
{
    private int[] cache3;
    private int[] cache1;
    private int[] cache2;
    private int pointer = 0;

    public Data (int[] c3)
    {
        cache3 = c3;
        for (int i = 0; i < 16; i++)
        {
            cache1[i] = cache3[i];
        }
        for(int i = 16; i < 32; i++)
        {
            cache2[i - 16] = cache3[i];
        }
    }
    public int next()
    {
        if(pointer == 31)
        pointer = 0;
        if(pointer >= 0 && pointer < 16)
        {
        pointer ++;
        return (cache1[pointer -1]);
        }
        else
        {
        pointer++;
        return (cache2[pointer - 17]);
        }        
    }
    public void LDC1 (int page)
    {

    }
    public void LDC2 (int page)
    {

    }
}
