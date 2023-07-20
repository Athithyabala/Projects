package program;

import java.util.Scanner;
import java.util.regex.*;

public class urlvalidation {
    public static void main(String[] args) {
    	
        String url1 = "https://www.example.com";
        
        System.out.println(validateURL(url1)); }

    public static String validateURL(String url) {
        // Check if the URL matches the standard URL pattern
        String urlPattern = "^((http|https|ftp)://)?([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}(/[a-zA-Z0-9-]*)*(\\?[a-zA-Z0-9-]+=[a-zA-Z0-9-]+(&[a-zA-Z0-9-]+=[a-zA-Z0-9-]+)?)?$";
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(url);
        
        if (!matcher.matches()) {
            return "Invalid";
        }
        
        // Check if the URL contains more than 2 query parameters
        int queryParamCount = url.split("[?&]").length - 1;
        if (queryParamCount > 2) {
            return "Invalid - More than 2 query parameters";
        }
        
        return "Valid";
    }
}

