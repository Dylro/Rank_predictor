import java.util.*; 
class GenerateOTP 
{
    public static int otp;
    void generateotp()
    {
        Random gen=new Random();
        for(int i=0;i<1;i++)
        {
           otp=gen.nextInt(5000)+1000;
        }
    }
}