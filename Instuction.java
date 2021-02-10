public class Instruction
{
    private int opcode;
    private int op1;
    private int data;

    public Instruction (int oc, int o1)
    {
        opcode = oc;
        op1 = o1;
    }
    public Instruction (int oc, int o1, int dat)
    {
        opcode = oc;
        op1 = o1;
        data = dat;
    }
}