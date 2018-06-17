package kodutoo3;

import java.io.*;
/**
 *
 * @author Anu
 */
public class Andmed {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Klass õpilane = new Klass();
        
        System.out.println("Sisesta õpilase eesnimi: ");
	String FirstName = br.readLine();
	õpilane.FirstName = FirstName;
        
        System.out.println("Sisesta õpilase Perekonnanimi: ");
	String LastName = br.readLine();
        õpilane.LastName = LastName;
        
        System.out.println("Sisesta õpitav aine: ");
	String Subject = br.readLine();
        õpilane.Subject = Subject;
        
        System.out.println("Sisesta kogutud punktide arv: ");
	String PointsEarned = br.readLine();
        õpilane.PointsEarned = PointsEarned;
        
        if(FirstName.equals("")||LastName.equals("")||Subject.equals("")||PointsEarned.equals("")){
            System.out.println("\nTäida kõik väljad!\n");
        }else{
            br.close();
        }
	õpilane.addData();
    }
    
}
