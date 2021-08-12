public class Practice
{
    public static void main (String[] args)
    {
        Boolean bln_heap = true;
        boolean bln_stack = bln_heap;
        System.out.println("Boolean from Stack : " + bln_stack);
        System.out.println("Boolean from Heap  : " + bln_heap);
        Character ch_heap = 'x';
        char ch_stack = ch_heap;
        System.out.println("Character from Stack : " + ch_stack);
        System.out.println("Character from Heap  : " + ch_heap);
        Byte byt_heap = 120;
        byte byt_stack = byt_heap;
        System.out.println("Byte from Stack : " + byt_stack);
        System.out.println("Byte from Heap  : " + byt_heap);
        Short shrt_heap = 256;
        short shrt_stack = shrt_heap;
        System.out.println("Short from Stack : " + shrt_stack);
        System.out.println("Short from Heap  : " + shrt_heap);
        Integer it_heap = 204;
        int it_stack = it_heap;
        System.out.println("Integer from Stack : " + it_stack);
        System.out.println("Integer from Heap  : " + it_heap);
        Long lng_heap = 65536l;
        long lng_stack = lng_heap;
        System.out.println("Long from Stack : " + lng_stack);
        System.out.println("Long from Heap  : " + lng_heap);
        Float flt_heap = 3.14f;
        float flt_stack = flt_heap;
        System.out.println("Float from Stack : " + flt_stack);
        System.out.println("Float from Heap  : " + flt_heap);
        Double dbl_heap = 3.14159265358979d;
        double dbl_stack = dbl_heap;
        System.out.println("Double from Stack : " + dbl_stack);
        System.out.println("Double from Heap  : " + dbl_heap);
    }
}
