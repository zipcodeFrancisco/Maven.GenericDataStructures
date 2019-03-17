package zipcode;
public class Util
{
    /** Always throws {@link RuntimeException} with the given message */
    public static <T> T throwException(String msg)
    {
        throw new RuntimeException(msg);
    }
}