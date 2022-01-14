import java.util.Scanner;
public class COLLEGEALLOCATOR
{
    String college="";
    void allocate()
    {
        Scanner sc=new Scanner(System.in);
        String college[]=new String[9];
        college[0]="KING EDWARD MEMORIAL COLLEGE,MUMBAI";
        college[1]="SION GOVERNMENT MEDICAL COLLEGE,MUMBAI";;
        college[2]="DR V.M. MEDICAL COLLEGE,SOLAPUR";;
        college[3]="DR D.Y. PATIL MEDICAL COLLEGE,KOLHAPUR";
        college[4]="B.J. MEDICAL COLLEGE,PUNE ";
        college[5]="TOPIWALA NATIONAL MEDICAL COLLEGE,CENTRAL MUMBAI";
        college[6]="GRANT MEDICAL COLLEGE,MUMBAI";
        college[7]="COOPER MEDICAL COLLEGE,MUMBAI";
        college[8]="SRTR MEDICAL COLLEGE,BEED";
        System.out.println("ENTER YOUR NEET PASSWORD TO VIEW COLLEGE ALLOCATED BY GOV.!!");
        String rd=sc.next();
        if(rd.equals(PasswordGenerator.password))
        {
        System.out.println("*****************************************************************************************************************************************************************************************************");
        for(int i=0;i<9;i++)
        {
        if(NEETRESULT.srank>0&&NEETRESULT.srank<=150)
        {
          System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
     i++;
        if(NEETRESULT.srank>150&&NEETRESULT.srank<=300)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
     i++;
        if(NEETRESULT.srank>300&&NEETRESULT.srank<=500)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    i++;
        if(NEETRESULT.srank>500&&NEETRESULT.srank<=700)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    i++;
        if(NEETRESULT.srank>700&&NEETRESULT.srank<=900)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
     i++;
        if(NEETRESULT.srank>900&&NEETRESULT.srank<=1100)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
     i++;
        if(NEETRESULT.srank>1100&&NEETRESULT.srank<=1300)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
     i++;
       if(NEETRESULT.srank>1300&&NEETRESULT.srank<1500)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    i++;
        if(NEETRESULT.srank>1500&&NEETRESULT.srank<=1700)
        {
        System.out.println("CONGRATULATIONS!! YOU HAVE GIVEN ADMISSION  ON MERIT TO:"+college[i]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");     
    }
        if(NEETRESULT.srank>1700)
        {
        System.out.println("YOU HAVE TO FAILED TO QUALIFY FOR GOVERNMENT MEDICAL COLLEGE ON MERIT!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
    else
    {
    System.out.println("WE HAVE NOT PROVIDED ANY SUCH PASSWORD!!");
    System.out.println("PLEASE ENTER CORRECT PASSWORD PROVIDED!!");
}
}
}
