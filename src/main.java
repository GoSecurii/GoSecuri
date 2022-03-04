import java.io.IOException;
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        //création de index.html
        new FileOutputStream("./login.html" + "./index.html", false).close();
    }



        /*  private void initHtpasswd(){
            String line = "admin"+":{SHA}"+Base64.getEncoder().encodeToString(DigestUtils.sha1("admin"));
            try {
                Files.writeString(Paths.get(this.generatedFilesDirPath+".htpasswd"),line+"\n");
            } catch (IOException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        private void generateHtpasswd(Agent agent){
            //Création / ou Ecriture du fichier htpasswd
            String line = agent.getUsername()+":{SHA}"+Base64.getEncoder().encodeToString(DigestUtils.sha1(agent.getPassword()));
            try {
                BufferedWriter output = new BufferedWriter(new FileWriter(this.generatedFilesDirPath+".htpasswd",true));  //clears file every time
                output.write(line);
                output.newLine();
                output.close();
                //Files.writeString(Paths.get(this.generatedFilesDirPath+".htpasswd"),line);
            } catch (IOException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }

