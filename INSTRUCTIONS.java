import java.util.Scanner;
public class INSTRUCTIONS
{
    public  void main1()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("********************************************************************************************************************************************************************************************************************************************************************");
         System.out.println("Press 1 to read Instructions for reading form or ANY OTHER KEY to exit");
         String in=sc.next();
         if(in.compareTo("1")>0||in.compareTo("1")<0)
         {
            System.exit(0);
        }
         System.out.println("INSTRUCTIONS FOR ONLINE APPLICATION ARE AS FOLLOWS:");
        System.out.println("•Please read the instructions, procedure and Information Bulletin carefully before you");
        System.out.println(" start filling the Online Application Form");
        System.out.println("•NEET (UG) will be conducted as per the directives of Ministry of Health and");
        System.out.println("Family Welfare, Medical Council of India and Dental Council of India");
        System.out.println("•Candidates can apply for NEET (UG), 2017 'online' only");
        System.out.println("•Indian Nationals, Non Resident Indians (NRIs), Overseas Citizen of India (OCIs");
        System.out.println("Persons of Indian Origin (PIOs) & Foreign Nationals are eligible to appear in");
        System.out.println("NEET (UG)-2017 & also eligible for 15% All India Quota seats");   
        System.out.println("•The Age criteria for appearing in NEET (UG), 2017 is as follows:");
        System.out.println("•UPPER(MAXIMUM)AGE LIMIT:71 YEARS,LOWER(MINIMUM)AGE LIMIT:17 YEARS");
        System.out.println("•Candidates must preserve their Admit Card and all documents till admission in  college is over");
        System.out.println("FEE DETAILS:");
        System.out.println("•FOR UR/OBC:INR=1400");
        System.out.println("•FOR SC/ST/PH:INR=750");
        System.out.println("###############################################################################################################################");
    }
}
