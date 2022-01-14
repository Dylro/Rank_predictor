import java.util.*;
 public class FILLFORM
{
     public static String nm,mn,fn,cg,gen,nat,state,IDTYPE,email;
    public static int amt,tp,age;
    public static String mob,aadharno;
    int n,m;
    Scanner sc=new Scanner(System.in);
     public void enterdetails1()
    {
        String temp="";
        System.out.println("**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("Press 1 to read proceed to fill form or ANY OTHER KEY to exit");
        String ky=sc.next();
        if(ky.compareTo("1")>0||ky.compareTo("1")<0)
        {
        System.exit(0);
        }
        System.out.println("\f");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Please enter the name,mother's name,father's name and gender as per instructions");
        System.out.println("Enter Candidate Name(FIRST NAME ONLY):");
        nm=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age<17||age>71)
        {
        System.out.println("Sorry you are not eligible to appear for NEET");
        System.exit(0);
        }
        System.out.println("Enter mother's name");
         mn=sc.next();
        System.out.println("Enter father's name");
         fn=sc.next();
        System.out.println("Enter your category:UR(UNRESERVED CATEGORY),SC,ST,OBC-NCL");
         cg=sc.next();
         if(cg.equalsIgnoreCase("SC")||cg.equalsIgnoreCase("ST")||cg.equalsIgnoreCase("OBC-NCL"))
    amt=750;
    else
    amt=1400;
        System.out.println("Enter your gender:M(MALE),F(FEMALE),O(OTHER)");
         gen=sc.next();
        System.out.println("Enter your nationality:INDIAN,OCI,NRI,PIO");
         nat=sc.next();
        System.out.println("Enter your STATE of eligiblity(FOR 15% ALL INDIA QUOTA)");
        System.out.println("NOTE:For states with more than one word enter first LETTER of both words(eg-TAMIL NADU-TN)");
         state=sc.next();
        if(state.equalsIgnoreCase("AP")||state.equalsIgnoreCase("TELANGANA")||state.equalsIgnoreCase("JK"))
        System.out.println("YOU ARE NOT ELIGIBLE FOR 15% ALL INDIA QUOTA(JAMMU AND KASHMIR,TELANGANA ANDHRA PRADESH)");
        System.out.println("Select Identification Type:AADHAR(ONLY)");
         IDTYPE=sc.next();
        if(IDTYPE.equalsIgnoreCase("AADHAR"))
        {
            while(m<12||m>12)
         {
             System.out.println("Enter your 12 DIGIT aadhar number");
         aadharno=sc.next();
         m=aadharno.length();
         if(m==12)
         break;
         System.out.println("INVALID AADHAR NUMBER!!!");
        }
        
        }
         while(n<10||n>10)
         {
             System.out.println("Enter your 10 DIGIT mobile number");
         mob=sc.next();
         n=mob.length();
         if(n==10)
         break;
         System.out.println("PLEASE ENTER A VALID MOBILE NUMBER!!!");
        }
        System.out.println("Enter your email ID");
         email=sc.next();
        }
         void enterdetails2()
         {
             System.out.println("Your Security Pin for NEET is being generated");
       System.out.println(PasswordGenerator.password);
       System.out.println("Enter the security pin exlusively for NEET generated as displayed above");
       String sp=sc.next();
       if(sp.equalsIgnoreCase(PasswordGenerator.password))
       {
        System.out.println("PROCEED FOR PAYMENT,DETAILS REGISTERED");
        System.out.println("###########################################################################################################################################################################################################");
       }
       else
       {
        System.out.println("WRONG SECURITY PIN!!!");
        System.out.println("ENTER DETAILS AGAIN");
        System.exit(0);
        }
    }
}

      

        
        