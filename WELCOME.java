import java.util.*;
public class WELCOME
{
    public static void main()
    {
        String cont;
        Scanner sc=new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        System.out.println("HI, I AM ROBOMATE,YOUR ADMISSION ASSISTANT");
        System.out.print("I WILL TAKE YOU THROUGH THE ADMISSION PROCESS");
        System.out.println("FOR INDIA'S PREMIER MEDICAL ENTRANCE EXAMINATION-NEET");
        System.out.println("#########################################################################################################################################################################################################");
        System.out.println("Press 1 TO REGISTER A NEW CANDIDATE OR ANY OTHER KEY TO EXIT!");
        cont=sc.next();
        if(cont.compareTo("1")>0||cont.compareTo("1")<0)
            System.exit(0);
        while(cont.equals("1"))
        {
            INSTRUCTIONS OB1=new INSTRUCTIONS();
            OB1.main1();
            PasswordGenerator OB2=new PasswordGenerator();
            FILLFORM OB3=new FILLFORM();
            OB3.enterdetails1();
            OB2.main2();
            OB3.enterdetails2();
            GenerateOTP OB4=new GenerateOTP();
            OB4.generateotp();

            PAYMENT OB5=new PAYMENT();
            OB5.main3();
            OB5.authenticatepayment();
            OB5.registrationnum();
            OB5.display();
            ADMITCARD OB6=new ADMITCARD();
            OB6.centreno();
            OB6.CENTREEXAM();
            OB6.displayadmitcard();
            NEETRESULT OB7=new NEETRESULT();
            OB7.main4();
            COLLEGEALLOCATOR OB8=new COLLEGEALLOCATOR();
            OB8.allocate();
            System.out.println("Press 1 TO REGISTER A NEW CANDIDATE OR ANY OTHER KEY TO EXIT!");
            cont=sc.next();
        }
        if(cont.compareTo("1")>0||cont.compareTo("1")<0)
        {
            System.out.println("THANK YOUR FOR COMPLETING YOUR REGISTARTION  USING ROBOMATE!!");
            System.out.println("WISHING YOU ALL SUCCESS IN YOUR FUTURE ENDEAVOURS!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");     
        }
    }
}



    