package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmailMail {
    public static void main(String[] args) {

    List<String> listaEmails = RegexUtils.emailFileToList("C:\\Arquivos\\teste.txt");

        for (String email : listaEmails) {
            System.out.println("email : " + email);
        }


    }
}

class RegexUtils {
    public static boolean emailIsValid(String email){

        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            String expression2 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
            Pattern pattern = Pattern.compile(expression2, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public static List<String> emailFileToList(String path){

        String line;
        BufferedReader data = null;
        List<String> emailList = new ArrayList<String>();
        try {
            data = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                if (!((line = data.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (emailIsValid(line)){
                emailList.add(line);
            }

            System.out.println(line);
        }
        try {
            data.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return emailList;
    }

}