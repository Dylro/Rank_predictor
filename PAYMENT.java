import java.util.*;
class PAYMENT
{
    public static int otp,tp;
    String s="";
    int i,j,q=3;
    char c;
    public void main3()
    {
        Scanner sc=new Scanner(System.in);
        PAYMENT ob=new PAYMENT();
        System.out.println("*****************************************************************************************************************************************************************************************");
        System.out.println("Press any key to proceed for payment");
        char c=sc.next().charAt(0);
        System.out.println("Enter total annual income of parents");
        int ai=sc.nextInt();
        System.out.println("Select Payment Method:DEBITCARD,VISA");
        String pm=sc.next();
        System.out.println("Enter your 16 digit bank account number");
        String bnk=sc.next();
        int n=bnk.length();
        if(n==16)
        {
            for(i=0;i<n;i++)
            {
            c=bnk.charAt(i);
            s=s+c;
            j=i;
           if(j==15)
           {
            j=j+1;
           }
           if(j==q)
          {
            s=s+'-';
            q=q+4;
          }
          }
          System.out.println("YOUR BANK ACCOUNT::"+s+"::HAS BEEN REGISTERED");
}
if(n!=16)
{
System.out.println("PLEASE ENTER VALID ACCOUNT NO.!!");
System.exit(0);
}
System.out.println("OTP will be generated shortly and sent to your mobile number +91"+FILLFORM.mob);
}
       void authenticatepayment()
       {        
        System.out.println("OTP : "+GenerateOTP.otp);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the OTP");
        int OTP=sc.nextInt();
        if(OTP==GenerateOTP.otp)
        {
         System.out.println(FILLFORM.amt+": HAS BEEN WITHDRAWN FROM YOUR ACCOUNT:"+s);
         System.out.println("PAYMENT SUCCESFUL");
        }
        else
        {
        System.out.println("PAYMENT UNSUCCESFUL, PLEASE TRY AGAIN");
        System.exit(0);
       }
        System.out.println("#############################################################################################################################################################################################################################################################################");
}
void registrationnum()
    {
        Random gen=new Random();
        for(int i=0;i<1;i++)
        {
           tp=gen.nextInt(8000000)+1;
        }
    }
void display()
     {
    System.out.println("***********************************************************************************************************************************************************************************************************");
    System.out.println("FORM RECEIPT:");
    System.out.println("Your registration Number is:"+tp);
    System.out.println("Candidates NAME:"+FILLFORM.nm+"\t"+"Mother's NAME:"+FILLFORM.mn);
    System.out.println("Father's NAME:"+FILLFORM.fn+"\t"+"CATEGORY:"+FILLFORM.cg);    
    System.out.println("GENDER:"+FILLFORM.gen+"\t"+"\t"+"NATIONALITY:"+FILLFORM.nat);
    System.out.println("STATE:"+FILLFORM.state+"\t"+"\t"+"AADHAR NUMBER:"+FILLFORM.aadharno);
    System.out.println("MOBILE NUMBER:"+FILLFORM.mob+"\t"+"EMAIL ID:"+FILLFORM.email);
    System.out.println("BANK ACCOUNT NO.:"+s);
    System.out.println("AMOUNT AFTER PAYMENT:"+FILLFORM.amt);    
    System.out.println("############################################################################################################################################################################################################");
}}





    
        