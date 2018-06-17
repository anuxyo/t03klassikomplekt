package kodutoo3;
import java.io.*;
/**
 *
 * @author Anu
 */
public class Klass {
        //protected - nähtav kogu package-ile, kõikidele alamklassidele
	protected String FirstName;
        protected String LastName;
        protected String Subject;
        protected String PointsEarned;
        
        public void addData(){
            try{
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(FirstName + ".txt", true)));
                pw.println("Õpilase eesnimi: " + FirstName);
                pw.println("Õpilase perekonnanimi: " + LastName);
                pw.println("Õpitav aine: " + Subject);
                pw.println("Kogutud punktide arv: " + PointsEarned);
		pw.close();
            } catch(IOException ex){
                System.out.println(ex);
            }
        }
       /*
        Õpilase eesnimi: anu
        Õpilase perekonnanimi: sadam
        Õpitav aine: proge
        Kogutud punktide arv: 5

        */ 
        
}
