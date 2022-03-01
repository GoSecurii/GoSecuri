import java.io.*;

public class Convert {

    public static void convert() throws IOException {
        //staff vers temp
        FileReader reader;
        FileWriter writer;

        reader = new FileReader("ressource/staff.txt");
        writer = new FileWriter("ressource/vide.txt");

        BufferedReader reader1 = new BufferedReader(reader);
        String staff;
        while ((staff = reader1.readLine()) != null) {
            writer.write("<a href='" + staff + ".html'>" + staff + "</a><br>" + "\n");
            //création des pages staff
            new FileOutputStream("ressource/HtmlPage/" + staff + ".html", false).close();
            Generate.createStaffHtml(staff);
        }
        reader1.close();
        reader.close();
        writer.close();

        //temp vers index.html
        int c;

        reader = new FileReader("ressource/vide.txt");
        writer = new FileWriter("ressource/HtmlPage/index.html");

        writer.write("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<meta charset='utf-8' />\n\t\t<title>Accueil</title>\n\t\t<link rel=\"stylesheet\" href=\"style.css\">\n\t\t<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>\n\t</head>\n\t<body>\n"); //ecrire le début du fichier index.html
        writer.write("\n<div id='logo'>\n\t<img id='gosecuri' src=\"/jpg/GoSecuri.jpg\" alt=\"logo of GoSecuri\">\n</div>\n<div id='agents'>");
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        writer.write("\n</div>\n\t</body>\n</html>"); //ecrire la fin du fichier html
        reader.close();
        writer.close();

        //del temp file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ressource/vide.txt", false)));
        pw.println("");
        pw.close();
    }
}